/*
 * Copyright 2019-2023 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.thoughtworks.go.gradle.task.helpers

import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class GocdPluginGradleTaskHelpersPluginTest extends Specification {
    def 'plugin registers task "allDependencies"'() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.plugins.apply 'com.thoughtworks.go.gradle.task.helpers'

        then:
        project.tasks.findByName('allDependencies') != null
    }
}
