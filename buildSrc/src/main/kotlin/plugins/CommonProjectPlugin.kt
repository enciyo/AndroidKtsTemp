package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class CommonProjectPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        plugins().forEach(target.plugins::apply)
    }

    private fun plugins() = listOf(PluginIds.kapt)

}