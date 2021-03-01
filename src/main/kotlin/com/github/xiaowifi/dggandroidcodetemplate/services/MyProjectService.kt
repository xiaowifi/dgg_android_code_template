package com.github.xiaowifi.dggandroidcodetemplate.services

import com.github.xiaowifi.dggandroidcodetemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
