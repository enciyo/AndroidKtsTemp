package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import implementation

class AndroidLibraryProjectPlugin : Plugin<Project> {
    override fun apply(target: Project) {
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