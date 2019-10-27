import org.hibernate.gradle.tools.*
plugins {
    java
    id("org.hibernate.gradle.tools") version "1.2.5"
}

group = "th.in.lordgift"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    compile("mysql:mysql-connector-java:8.0.15")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}


database {

    basePackage = "hbm.out"

/*      for generate hibernate.cfg.xml && hibernate.reveng.xml   */
//    catalog = mapOf("testdb" to Schema("testdb", ".*"))
//    url = "jdbc:mysql://localhost"
//    port = 3306
//    user = "root"
//    password = "mobile"


/*      for use existing hibernate.cfg.xml && hibernate.reveng.xml      */
    configXml   = "./hibernate.cfg.xml"
    revEngXml   = "./hibernate.reveng.xml"
}