pluginManagement {
    plugins {
        kotlin("jvm") version "1.9.10"
    }
}
rootProject.name = "triumph-gui"

include("core")
findProject(":core")?.name = "triumph-gui"

include("paper")
findProject(":paper")?.name = "triumph-gui-paper"

// test-plugin excluded (not part of the core library)
