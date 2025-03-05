plugins {
    kotlin("jvm") version "2.1.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jsoup:jsoup:1.19.1")
    implementation("com.google.code.gson:gson:2.10.1")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}