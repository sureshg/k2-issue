pluginManagement { includeBuild("gradle/build-logic") }

plugins { id("settings.repos") }

rootProject.name = "k2-issue"

listOf("common", "backend:jvm").forEach { include(":$it") }
