plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
//    TODO: build-logic setting
//    alias(libs.plugins.fitrun.android.feature)
}

android {
    namespace = "com.yapp.fitrun.feature.splash"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.orbit.compose)
    implementation(libs.orbit.viewmodel)
}