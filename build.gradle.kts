plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.17.3"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

intellij {
    // песочница на той IDE, что у тебя скачалась
    version.set("2023.2.6")
    type.set("IC") // Community
    plugins.set(listOf()) // без зависимостей
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
        options.encoding = "UTF-8"
    }

    patchPluginXml {
        sinceBuild.set("232")   // для 2023.2.x
        untilBuild.set("242.*") // можно оставить такой коридор
    }
}
