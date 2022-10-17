package com.learn.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.register("hello", HelloTask::class.java)
    }
}