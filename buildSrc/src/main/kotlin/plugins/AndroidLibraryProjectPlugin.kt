package plugins

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import implementation
import configureAndroidLibrary
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryProjectPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.extensions.getByType<BaseExtension>().configureAndroidLibrary()
        plugins().forEach(target.plugins::apply)
        target.plugins.apply(CommonProjectPlugin::class.java)
        target.dependencies {
            implementations().forEach(::implementation)
        }
    }

    private fun plugins() = listOf(PluginIds.kotlinAndroid)

    private fun implementations() = listOf(
        Library.coreKtx
    )
}