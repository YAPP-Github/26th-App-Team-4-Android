import com.yapp.fitrun.configureCoroutineAndroid
import com.yapp.fitrun.configureHiltAndroid
import com.yapp.fitrun.configureKotest
import com.yapp.fitrun.configureKotlinAndroid


plugins {
    id("com.android.library")
}

configureKotlinAndroid()
configureKotest()
configureCoroutineAndroid()
configureHiltAndroid()