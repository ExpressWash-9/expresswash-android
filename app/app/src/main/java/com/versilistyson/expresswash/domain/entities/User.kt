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
    override val userId: Int,
    override val email: String,
    override val firstName: String,
    override val lastName: String,
    override val phoneNumber: String,
    override val city: String,
    override val zip: String,
    override val profilePicture: String,
    override val bannerImage: String

) : User()
data class Washer(
    override val userId: Int,
    val washerId: Int,
    override val email: String,
    override val firstName: String,
    override val lastName: String,
    override val phoneNumber: String,
    override val city: String,
    override val zip: String,
    override val profilePicture: String,
    override val bannerImage: String,
    val workStatus: Boolean,
    val rateSmall: Float,
    val rateMedium: Float,
    val RateLarge: Float,
    val aboutMe: String,
    val currentLatitude: Nothing = TODO("Change to lat after implementing MapBox"),
    val currentLongitude: Nothing = TODO("Change to lon after implementing MapBox"),
    val averageRating: Float,
    val ratingCount: Int
) : User()
