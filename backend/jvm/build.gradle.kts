import common.jvmArguments

plugins {
  plugins.kotlin.jvm
  plugins.publishing
  application
}

application {
  mainClass = libs.versions.app.mainclass.get()
  applicationDefaultJvmArgs += jvmArguments(forAppRun = true)
}

dependencies { implementation(projects.common) }
