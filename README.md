# Hibernate Tools Gradle
![](https://img.shields.io/badge/Java-8-orange.svg?logo=java)
![](https://img.shields.io/badge/Gradle-5.2.1-002A32.svg)

## Usage

Inside your build.gradle file add this:

### Build script snippet

#### build.gradle
```kotlin
plugins {
  id "org.hibernate.gradle.tools" version "1.2.5"
}
```

add dependency for Database Driver (here is MySQL)

```kotlin
dependencies {
    implementation("mysql:mysql-connector-java:8.0.15")
}
```

This plugin provides three gradle target:

> hbm2dao: for generate DAO classes
>> hbm2java: for generate Hibernate Entity classes
>>> hibernate-config: for generate hibernate.cfg.xml & hibernate.reveng.xml 


Usually way to config this plugin by use existing hibernate.cfg.xml & hibernate.reveng.xml.

```kotlin
database {
    basePackage = "hbm.out"

    configXml   = "./hibernate.cfg.xml"
    revEngXml   = "./hibernate.reveng.xml"
}
```

all generated files should appear in build/generated/src


official plugin site.
https://plugins.gradle.org/plugin/org.hibernate.gradle.tools



### IF JAVA_HOME configured with later than JDK 11+ (no longer included Java EE), please specify to JDK 8 (including Java EE)
JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_221.jdk/Contents/Home/" ./gradlew :hibernate-tool:hbm2java
