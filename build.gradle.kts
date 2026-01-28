plugins {
    kotlin("jvm") version "1.9.22" // Измените версию на 1.9.22
    id("org.jetbrains.compose") version "1.6.0" // Добавьте плагин Compose
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev") // Добавьте репозиторий JetBrains
    google() // Добавьте репозиторий Google
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(compose.desktop.currentOs) // Это уже есть
    implementation(compose.material3) // Дополнительно, если нужен Material 3
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

compose.desktop {
    application {
        mainClass = "MainKt" // Укажите главный класс

        nativeDistributions {
            packageName = "FineBoxs"
            packageVersion = "1.0.0"
        }
    }
}