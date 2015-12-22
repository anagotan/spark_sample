package sample

import scala.math.random

import org.apache.spark.mllib.util.MLUtils
import org.apache.spark._

object SparkPi {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Spark Pi").setMaster("local[2]")
    val spark = new SparkContext(conf)
    val slices=2
    val n = math.min(100000L * slices, Int.MaxValue).toInt // avoid overflow
    val count = spark.parallelize(1 until n, slices).map { i =>
      val x = random * 2 - 1
      val y = random * 2 - 1
      if (x*x + y*y < 1) 1 else 0
    }.reduce(_ + _)
    println("Pi is roughly " + 4.0 * count / n)
    
    val outputLocation = "s3n://bucket/output"

    val pi=4.0 * count / n
    val data=spark.makeRDD(Seq(pi))

    data.saveAsTextFile(outputLocation + "/pi")
	spark.stop()
  }
}
