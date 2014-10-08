package com.qulix.xcodebuild

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class XcodebuildTask extends DefaultTask {

    @TaskAction
    def build() {
        println '------------ xcodebuild task -------------------'
	println "Project: ${project.xcodebuild.project}"
	println "Scheme: ${project.xcodebuild.scheme}"
	println "Build dir: ${project.xcodebuild.build_dir}"
        println "Configuration: ${project.xcodebuild.configuration}"
	println "ipa path: ${project.xcodebuild.ipa_path}"
	println "archive path: ${project.xcodebuild.archive_path}"
	println "provisioning profile: ${project.xcodebuild.provisioning_profile}"
    }
}

class XcodebuildPluginExtension {
    String project = "Project.xcodeproj"
    String scheme = "ProjectScheme"
    String build_dir = "./build"
    String configuration = "Release"
    String ipa_path = "${build_dir}/Project.ipa"
    String archive_path = "${build_dir}/Project.xcarchive"
    String provisioning_profile = "TestProvision-dev"
}
