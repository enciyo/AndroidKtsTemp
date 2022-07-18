import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion

fun BaseExtension.configureAndroid() = apply {
    compileSdkVersion(AndroidSettings.compileSdkVersion)
    defaultConfig {
        applicationId = AndroidSettings.applicationId
        minSdk = AndroidSettings.minSdk
        targetSdk = AndroidSettings.targetSdk
        versionCode = AppVersion.code
        versionName = AppVersion.name
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
