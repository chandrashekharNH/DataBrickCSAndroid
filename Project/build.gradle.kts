// build.gradle.kts (Project level)

plugins {
    // Do NOT use compose alias unless you've defined it in libs.versions.toml
    id("com.android.application") version "8.4.0" apply false
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false // Optional here
}