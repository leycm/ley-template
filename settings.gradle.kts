dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {}
}

rootProject.name = "ley-template"

include("common", "api")

project(":api").projectDir = file("tmp-api")
project(":common").projectDir = file("tmp-common")
