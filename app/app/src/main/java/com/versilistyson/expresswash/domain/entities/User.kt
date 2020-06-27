package com.versilistyson.expresswash.domain.entities

sealed class User() : Entity() {
    abstract val userId: Int
    abstract val email: String
    abstract val firstName: String
    abstract val lastName: String
    abstract val phoneNumber: String
    abstract val city: String
    abstract val zip: String
    abstract val profilePicture: String
    abstract val bannerImage: String
}

data class Client(
    override val userId: Int = 0,
    override val email: String = "",
    override val firstName: String = "",
    override val lastName: String = "",
    override val phoneNumber: String = "",
    override val city: String = "",
    override val zip: String = "",
    override val profilePicture: String = "",
    override val bannerImage: String = ""

) : User()

data class Washer(
    override val userId: Int = 0,
    val washerId: Int = 0,
    override val email: String = "",
    override val firstName: String = "",
    override val lastName: String = "",
    override val phoneNumber: String = "",
    override val city: String = "",
    override val zip: String = "",
    override val profilePicture: String = "",
    override val bannerImage: String = "",
    val workStatus: Boolean = false,
    val rateSmall: Float = 0f,
    val rateMedium: Float = 0f,
    val RateLarge: Float = 0f,
    val aboutMe: String = "",
    val currentLatitude: Nothing = TODO("Change to lat after implementing MapBox"),
    val currentLongitude: Nothing = TODO("Change to lon after implementing MapBox"),
    val averageRating: Float = 0f,
    val ratingCount: Int = 0
) : User()