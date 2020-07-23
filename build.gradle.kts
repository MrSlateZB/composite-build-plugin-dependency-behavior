plugins {
    id("org.sample.greeting").version("1.0-SNAPSHOT")
}

buildscript {
    repositories {
         //maven { url = uri("https://jitpack.io") }
    }
}

greeting {
    who = "Bob"
}
