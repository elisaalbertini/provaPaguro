plugins {
    alias(libs.plugins.sonarqube)
}

repositories {
    mavenCentral()
}

sonar {
    properties {
        property("systemProp.sonar.gradle.skipCompile", true)
        property("systemProp.sonar.projectKey")
        property("systemProp.sonar.organization")
        property("systemProp.sonar.host.url")
    }
}