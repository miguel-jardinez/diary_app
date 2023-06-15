package com.migueljardinez.diaryapp.utils

import com.migueljardinez.diaryapp.BuildConfig
import javax.inject.Inject

class EnvSecrets @Inject constructor() {

    fun getMongoApiKey(): String {
        return BuildConfig.API_KEY_MONGO_APPLICATION
    }
}