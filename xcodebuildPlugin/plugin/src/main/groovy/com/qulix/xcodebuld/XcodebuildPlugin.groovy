package com.qulix.xcodebuild

import org.gradle.api.Project
import org.gradle.api.Plugin

class XcodebuildPluginExtension {
    String app_name = 'My_super_gradle_builded_application'
    String project = "Project.xcodeproj"
    String scheme = "ProjectScheme"
    String out_dir = "./build"
    String configuration = "Release"
}

class XcodebuildPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.extensions.create('xcodebuild', XcodebuildPluginExtension)
        project.task('hello', type: GreetingTask)
        project.task('build', type: XcodebuildTask)
    }
}


