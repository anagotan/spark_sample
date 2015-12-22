name := "emrscala"

version := "0.0.1"

scalaVersion := "2.10.5"

libraryDependencies ++= Seq(
  ("org.apache.spark" %% "spark-sql" % "1.3.1").
    exclude("org.mortbay.jetty", "servlet-api").
    exclude("com.google.guava","guava").
    exclude("org.apache.hadoop","hadoop-yarn-api").
    exclude("commons-beanutils", "commons-beanutils-core").
    exclude("commons-beanutils", "commons-beanutils").
    exclude("commons-collections", "commons-collections").
    exclude("commons-logging", "commons-logging").
    exclude("org.spark-project.spark", "unused"). 
    exclude("com.twitter", "parquet-encoding").
    exclude("com.twitter", "parquet-column").
    exclude("com.twitter", "parquet-hadoop-bundle").
    exclude("org.datanucleus", "datanucleus-api-jdo").
    exclude("org.datanucleus", "datanucleus-core").
    exclude("org.datanucleus", "datanucleus-rdbms").
    exclude("com.esotericsoftware.minlog", "minlog"),
  ("org.apache.spark" %% "spark-mllib" % "1.3.1").
    exclude("org.mortbay.jetty", "servlet-api").
    exclude("com.google.guava","guava").
    exclude("org.apache.hadoop","hadoop-yarn-api").
    exclude("commons-beanutils", "commons-beanutils-core").
    exclude("commons-beanutils", "commons-beanutils").
    exclude("commons-collections", "commons-collections").
    exclude("commons-logging", "commons-logging").
    exclude("org.spark-project.spark", "unused"). 
    exclude("com.twitter", "parquet-encoding").
    exclude("com.twitter", "parquet-column").
    exclude("com.twitter", "parquet-hadoop-bundle").
    exclude("org.datanucleus", "datanucleus-api-jdo").
    exclude("org.datanucleus", "datanucleus-core").
    exclude("org.datanucleus", "datanucleus-rdbms").
    exclude("com.esotericsoftware.minlog", "minlog"),
  ("org.apache.spark" %% "spark-hive" % "1.3.1").
    exclude("org.mortbay.jetty", "servlet-api").
    exclude("com.google.guava","guava").
    exclude("org.apache.hadoop","hadoop-yarn-api").
    exclude("commons-beanutils", "commons-beanutils-core").
    exclude("commons-beanutils", "commons-beanutils").
    exclude("commons-collections", "commons-collections").
    exclude("commons-logging", "commons-logging").
    exclude("org.spark-project.spark", "unused"). 
    exclude("com.twitter", "parquet-encoding").
    exclude("com.twitter", "parquet-column").
    exclude("com.twitter", "parquet-hadoop-bundle").
    exclude("org.datanucleus", "datanucleus-api-jdo").
    exclude("org.datanucleus", "datanucleus-core").
    exclude("org.datanucleus", "datanucleus-rdbms").
    exclude("com.esotericsoftware.minlog", "minlog"),
  ("org.apache.spark" %% "spark-sql" % "1.3.1").
    exclude("org.mortbay.jetty", "servlet-api").
    exclude("com.google.guava","guava").
    exclude("org.apache.hadoop","hadoop-yarn-api").
    exclude("commons-beanutils", "commons-beanutils-core").
    exclude("commons-beanutils", "commons-beanutils").
    exclude("commons-collections", "commons-collections").
    exclude("commons-logging", "commons-logging").
    exclude("org.spark-project.spark", "unused"). 
    exclude("com.twitter", "parquet-encoding").
    exclude("com.twitter", "parquet-column").
    exclude("com.twitter", "parquet-hadoop-bundle").
    exclude("org.datanucleus", "datanucleus-api-jdo").
    exclude("org.datanucleus", "datanucleus-core").
    exclude("org.datanucleus", "datanucleus-rdbms").
    exclude("com.esotericsoftware.minlog", "minlog"),
  ("org.apache.spark" %% "spark-core" % "1.3.1").
    exclude("org.mortbay.jetty", "servlet-api").
    exclude("com.google.guava","guava").
    exclude("org.apache.hadoop","hadoop-yarn-api").
    exclude("commons-beanutils", "commons-beanutils-core").
    exclude("commons-beanutils", "commons-beanutils").
    exclude("commons-collections", "commons-collections").
    exclude("commons-logging", "commons-logging").
    exclude("org.spark-project.spark", "unused"). 
    exclude("com.twitter", "parquet-encoding").
    exclude("com.twitter", "parquet-column").
    exclude("com.twitter", "parquet-hadoop-bundle").
    exclude("org.datanucleus", "datanucleus-api-jdo").
    exclude("org.datanucleus", "datanucleus-core").
    exclude("org.datanucleus", "datanucleus-rdbms").
    exclude("com.esotericsoftware.minlog", "minlog")
)
