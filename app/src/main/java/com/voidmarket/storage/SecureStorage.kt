package com.voidmarket.storage
import android.content.Context
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
class SecureStorage(context: Context) {
    private val masterKeyAlias = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
    private val prefs = EncryptedSharedPreferences.create(
        "secure_prefs", masterKeyAlias, context,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )
    fun putString(key:String, value:String){ prefs.edit().putString(key,value).apply() }
    fun getString(key:String, default:String=""): String = prefs.getString(key,default) ?: default
}
