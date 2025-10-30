plugins {
    id("java")
}

group = "com.example.paycommand"
version = "1.0"

repositories {
        mavenCentral()
        maven {
            name = "papermc"
            url = uri("https://repo.papermc.io/repository/maven-public/")
        }
        flatDir {
            dirs("libs")
        }
    }

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
    compileOnly(files("libs/api-5.5.jar"))
    compileOnly("net.kyori:adventure-api:4.14.0")
    compileOnly("net.md-5:bungeecord-chat:1.21-R0.1")
    implementation("net.kyori:adventure-text-serializer-legacy:4.17.0")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}