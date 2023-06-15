plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("io.gitlab.arturbosch.detekt") version("1.23.0")

    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id("io.realm.kotlin")
}

android {
    namespace = "com.migueljardinez.diaryapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.migueljardinez.diaryapp"
        minSdk = 24
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1,gradle-plugins}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation(platform("androidx.compose:compose-bom:2022.10.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2022.10.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // Dagger Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-compiler:2.44")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")

    // OkHttp
    implementation("com.squareup.okhttp3:okhttp")

    // Navigation compose
    implementation("androidx.navigation:navigation-compose:2.6.0")

    // Room
    implementation("androidx.room:room-runtime:2.5.1")
    implementation("androidx.room:room-ktx:2.5.1")
    kapt("androidx.room:room-compiler:2.5.1")
    annotationProcessor("androidx.room:room-compiler:2.5.1")

    // Icons
    implementation("androidx.compose.material:material-icons-extended:1.4.3")

    // Message bar library
    implementation("com.github.stevdza-san:MessageBarCompose:1.0.2")

    //Coil
    implementation("io.coil-kt:coil-compose:2.3.0")

    // Date Time Picker
    implementation("io.github.vanpra.compose-material-dialogs:core:0.9.0")
    implementation("io.github.vanpra.compose-material-dialogs:datetime:0.9.0")
    implementation("io.github.vanpra.compose-material-dialogs:color:0.9.0")


    // Firebase
    implementation ("com.google.firebase:firebase-auth-ktx:22.0.0")
    implementation ("com.google.firebase:firebase-storage-ktx:20.2.0")

    //Play Services Auth
    implementation("com.google.android.gms:play-services-auth:20.5.0")

    // Runtime compose
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.1")

    // Splash api
    implementation("androidx.core:core-splashscreen:1.0.1")

    // MongoDB Realm
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0-native-mt") {
        version {
            strictly("1.6.0-native-mt")
        }
    }
    implementation("io.realm.kotlin:library-sync:1.0.2")

    // Pager - Accompanist
    implementation("com.google.accompanist:accompanist-pager:0.27.0")

    // Desugar SDK
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.3")

}