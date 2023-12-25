@file:Suppress("UnstableApiUsage")

plugins {
    PluginType.LIBRARY.get(this)
}

android {
    namespace = "com.doodle.core.database"
    compileSdk = versions.config.compileSdk

    defaultConfig {
        minSdk = versions.config.minSdk
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {

            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = versions.config.sourceCompatibility
        targetCompatibility = versions.config.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = versions.config.jvmTarget
    }
}

dependencies {
    implementation(project(":core:domain"))
    databaseModule()

    implementation("androidx.paging:paging-runtime:${versions.common.paging}")
    implementation("androidx.room:room-paging:${versions.common.roomPaging}")
}
