plugins {
    application
    kotlin("jvm")
}

application {
    mainClassName = "main"
}

repositories {
    mavenCentral()
}
dependencies {
    compile(kotlin("stdlib"))
}

