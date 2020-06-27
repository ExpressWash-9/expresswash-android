package com.versilistyson.expresswash.domain.entities

sealed class User(): Entity() {
    data class Client(val nothing: Nothing)
    data class Washer(val nothing: Nothing)
}