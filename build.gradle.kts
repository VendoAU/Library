plugins {
    java
    `maven-publish`
}

group = "com.vendoau"
version = "1.0.0"

repositories {
    mavenCentral()

    maven("https://jitpack.io")
}

dependencies {
    compileOnly("com.github.Minestom:Minestom:529_extension_improvement-SNAPSHOT")
}

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

tasks {
    wrapper {
        gradleVersion = "7.4.1"
        distributionType = Wrapper.DistributionType.ALL
    }
}