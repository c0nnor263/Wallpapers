import org.gradle.api.JavaVersion

object versions {
    object config {
        const val compileSdk = 34
        const val jvmTarget = "17"
        const val minSdk = 26
        const val targetSdk = 34
        val sourceCompatibility = JavaVersion.VERSION_17
        val targetCompatibility = JavaVersion.VERSION_17
    }

    object storage {
        const val room = "2.6.1"

        const val dataStore = "1.0.0"
    }

    object firebase {
        const val bom = "32.7.0"
        const val crashlyticsPlugin = "2.9.9"
        const val performancePlugin = "1.4.2"
        const val servicesPlugin = "4.4.0"
    }

    object compose {
        const val foundation = "1.6.0-alpha01"
        const val composeUtil = "1.5.4"
        const val exclude = "/META-INF/{AL2.0,LGPL2.1}"
        const val bom = "2023.10.01"
        const val compiler = "1.5.7"
        const val hiltNavigation = "1.1.0"
        const val navigation = "2.7.6"
        const val constraintLayout = "1.0.1"
        const val coil = "2.4.0"
    }

    object tooling {
        const val composeJunit = "1.5.4"
        const val benchmarkMacroJunit4 = "1.2.2"
        const val uiautomator = "2.2.0"
        const val androidEspressoCore = "3.5.1"
        const val androidJunit = "1.1.5"
        const val junit = "4.13.2"
    }

    object customPlugin {
        const val benNamesVersions = "0.50.0"
    }

    object playServices {
        const val ads = "22.6.0"
        const val billing = "6.1.0"
        const val integrity = "1.3.0"
        const val playReview = "2.0.1"
    }

    object android {
        const val volley = "1.2.1"
        const val cardView = "1.0.0"
        const val constraintLayoutXML = "2.1.4"
        const val gradle = "8.2.0"
        const val kotlin = "1.9.21"
        const val coroutines = "1.7.3"
        const val material = "1.11.0"
        const val activity = "1.8.2"
        const val kotlinImmutableCollections = "0.3.7"
        const val appCompat = "1.6.1"
        const val lifecycle = "2.6.2"
        const val coreKtx = "1.12.0"
    }

    object common {

        const val hilt = "2.50"
        const val ksp = "1.9.21-1.0.16"
        const val paging = "3.2.1"
        const val roomPaging = "2.6.1"
    }

    object startup {
        const val coreSplashscreen = "1.0.1"
        const val profileinstaller = "1.3.1"
        const val startupRuntime = "1.1.1"
    }

    object network {
        const val httpLoggingInterceptor = "4.12.0"
        const val retrofit = "2.9.0"
        const val converterGson = "2.9.0"
        const val gson = "2.8.8"
        const val volley = "1.2.1"
    }
}
