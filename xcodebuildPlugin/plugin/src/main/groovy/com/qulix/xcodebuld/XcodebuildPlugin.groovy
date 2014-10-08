package com.qulix.xcodebuild

import org.gradle.api.Project
import org.gradle.api.Plugin



class XcodebuildPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.extensions.create("xcodebuild", XcodebuildPluginExtension)
        project.task('hello', type: GreetingTask)
        project.task('build', type: XcodebuildTask)
    }
}


