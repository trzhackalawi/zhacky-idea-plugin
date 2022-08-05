package com.github.trzhackalawi.zhackyideaplugin.services

import com.intellij.openapi.project.Project
import com.github.trzhackalawi.zhackyideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
