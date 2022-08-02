object Library {
    const val coreKtx = "androidx.core:core-ktx:${LibraryVersion.coreKtx}"
    const val coroutine =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${LibraryVersion.coroutine}"

    object LifecycleAwareKtx {
        const val viewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibraryVersion.lifecycleAwareKtx}"
        const val lifecycleScope =
            "androidx.lifecycle:lifecycle-runtime-ktx:${LibraryVersion.lifecycleAwareKtx}"
        const val liveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${LibraryVersion.lifecycleAwareKtx}"

    }

    object UI {
        const val appCompat = "androidx.appcompat:appcompat:${LibraryVersion.UI.appCompat}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${LibraryVersion.UI.constraintLayout}"
        const val material = "com.google.android.material:material:${LibraryVersion.UI.material}"
    }

    object Test {
        const val jUnit = "junit:junit:${LibraryVersion.Test.jUnit}"
    }

    object AndroidTest {
        const val jUnit = "androidx.test.ext:junit:${LibraryVersion.AndroidTest.jUnit}"
        const val espresso =
            "androidx.test.espresso:espresso-core:${LibraryVersion.AndroidTest.espresso}"
    }

}


