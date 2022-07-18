import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.implementation(dependencyNotation: Any) {
    add("implementation", dependencyNotation)
}

fun DependencyHandlerScope.testImplementation(dependencyNotation: Any) {
    add("testImplementation", dependencyNotation)
}

fun DependencyHandlerScope.androidTestImplementation(dependencyNotation: Any) {
    add("androidTestImplementation", dependencyNotation)
}

fun DependencyHandlerScope.kapt(dependencyNotation: Any) {
    add("kapt", dependencyNotation)
}
