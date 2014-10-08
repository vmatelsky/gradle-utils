package com.qulix.xcodebuild

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class XcodebuildTask extends DefaultTask {

    @TaskAction
    def build() {
        println '------------build-------------------'
        println 'From : ${project.xcodebuild.app_name},\
                  message : ${project.xcodebuild.project}'
    }
}
