plugins {
    id("java-library")
    id("maven-publish")
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        maven("https://hub.spigotmc.org/nexus/content/groups/public/")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

subprojects {

    apply(plugin = "java-library")
    apply(plugin = "maven-publish")

    group = "dev.triumphteam"
    version = "3.1.14-SNAPSHOT"
}
