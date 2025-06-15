plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
    alias(libs.plugins.gradle.dependency.handler.extensions)
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.verify.detektPlugin)
    compileOnly(libs.compose.compiler.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "fitrun.android.hilt"
            implementationClass = "com.yapp.fitrun.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "fitrun.kotlin.hilt"
            implementationClass = "com.yapp.fitrun.HiltKotlinPlugin"
        }
        // Kotlin
        register("kotlinLibrary") {
            id = "fitrun.kotlin.library"
            implementationClass = "KotlinLibraryConventionPlugin"
        }
    }
}


repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)

}
