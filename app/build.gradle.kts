plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.dk.dagger2"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.dk.dagger2"
        minSdk = 31
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    kapt {
        generateStubs = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    //kapt ("com.google.dagger:dagger:2.42")
    //kapt ("com.google.dagger:dagger-compiler:2.40.5")
    api ("com.google.dagger:dagger:2.24")
    api ("com.google.dagger:dagger-android:2.24")
    api ("com.google.dagger:dagger-android-support:2.24")

    annotationProcessor ("com.google.dagger:dagger-compiler:2.24")
    kapt ("com.google.dagger:dagger-compiler:2.24")

    annotationProcessor ("com.google.dagger:dagger-android-processor:2.24")
    kapt ("com.google.dagger:dagger-android-processor:2.24")

    compileOnly ("javax.annotation:jsr250-api:1.0")
    implementation ("javax.inject:javax.inject:1")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //https://stackoverflow.com/questions/43756498/dagger-2-component-not-generated
}