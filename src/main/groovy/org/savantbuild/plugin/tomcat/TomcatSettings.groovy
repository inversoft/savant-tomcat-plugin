/*
 * Copyright (c) 2014, Inversoft Inc., All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.savantbuild.plugin.tomcat

import java.nio.file.Path
import java.nio.file.Paths

/**
 * Settings for the webapp plugin.
 *
 * @author Brian Pontarelli
 */
class TomcatSettings {
  Path buildDirectory = Paths.get("build")

  Path buildBinDirectory = Paths.get("build/apache-tomcat-8.0.12/bin")

  Path buildConfDirectory = Paths.get("build/apache-tomcat-8.0.12/conf")

  Path buildWebDirectory = Paths.get("build/apache-tomcat-8.0.12/webapps/ROOT")

  Path configurationDirectory = Paths.get("src/main/tomcat/conf")

  Path binDirectory = Paths.get("src/main/tomcat/bin")

  String dependencyGroup = "tomcat"

  String dependencyID = "org.apache.tomcat:apache-tomcat:8.0.12:tar.gz"

  Path webDirectory = Paths.get("web")
}
