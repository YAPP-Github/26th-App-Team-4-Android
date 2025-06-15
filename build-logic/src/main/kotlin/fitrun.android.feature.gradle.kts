import com.yapp.fitrun.configureHiltAndroid
import com.yapp.fitrun.libs

plugins {
    id("fitrun.android.library")
    id("fitrun.android.compose")
}

android {
    packaging {
        resources {
            excludes.add("META-INF/**")
        }
    }
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

configureHiltAndroid()

dependencies {
    val libs = project.extensions.libs
    implementation(libs.findLibrary("hilt.navigation.compose").get())
    implementation(libs.findLibrary("androidx.lifecycle.viewModelCompose"))
    implementation(libs.findLibrary("androidx.lifecycle.runtime.ktx"))
    implementation(libs.findLibrary("androidx.lifecycle.runtimeCompose"))
    implementation(libs.findLibrary("orbit.viewmodel").get())
    implementation(libs.findLibrary("orbit.compose").get())
}