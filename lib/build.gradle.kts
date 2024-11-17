plugins {
    java
}

java.toolchain {
    languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    mavenCentral()
}

val picoCliVersion = "4.7.6"
val slf4jVersion = "1.7.36"
val log4jVersion = "2.23.1"

dependencies {
    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    implementation("info.picocli:picocli:$picoCliVersion")

    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:$log4jVersion")
}