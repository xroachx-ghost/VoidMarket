package com.voidmarket.identity
object AnonymousIdentity {
    private var currentId = "anon_0"
    fun rotateId() { currentId = "anon_"+(0..9999).random() }
    fun getId(): String = currentId
}
