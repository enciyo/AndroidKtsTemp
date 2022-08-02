package plugins

import Library
import PluginIds
import androidTestImplementation
import com.android.build.gradle.BaseExtension
import configureAndroid
import implementation
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import testImplementation

class AndroidProjectPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.getByType<BaseExtension>().configureAndroid()
        plugins().forEach(project.plugins::apply)
        project.plugins.apply(CommonProjectPlugin::class.java)
        project.dependencies {
            implementations().forEach(::implementation)
            testImplementations().forEach(::testImplementation)
            androidTestImplementations().forEach(::androidTestImplementation)
        }
    }

    private fun plugins() = listOf(PluginIds.kotlinAndroid)

    private fun implementations() = listOf(
        Library.coreKtx,
        Library.UI.appCompat,
        Library.UI.constraintLayout,
        Library.UI.material,
        Library.coroutine,
        Library.LifecycleAwareKtx.lifecycleScope,
        Library.LifecycleAwareKtx.liveData,
        Library.LifecycleAwareKtx.viewModel,

    )

    private fun testImplementations() = listOf(
        Library.Test.jUnit
    )

    private fun androidTestImplementations() = listOf(
        Library.AndroidTest.espresso,
        Library.AndroidTest.jUnit
    )

}
