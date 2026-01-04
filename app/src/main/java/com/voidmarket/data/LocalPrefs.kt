package com.voidmarket.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore(name = "voidmarket_prefs")

object LocalPrefs {
    private val USER_ID = stringPreferencesKey("user_id")
    
    suspend fun saveUserId(context: Context, id: String) {
        context.dataStore.edit { it[USER_ID] = id }
    }
    
    fun getUserId(context: Context) = context.dataStore.data.map { it[USER_ID] ?: "" }
}
