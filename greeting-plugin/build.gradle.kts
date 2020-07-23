plugins {
    id("java-gradle-plugin")
}

group = "org.sample"
version = "1.0-SNAPSHOT"

repositories {
  maven { url = uri("https://jitpack.io") }
  jcenter()
}

dependencies {
  implementation("com.github.vidstige:jadb:v1.1.0")
}

  
gradlePlugin {
    plugins {
        create("customPlugin") {
            id = "org.sample.greeting"
            implementationClass = "org.sample.GreetingPlugin"
        }
    }
}
