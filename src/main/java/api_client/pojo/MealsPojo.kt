package api_client.pojo

import com.google.gson.annotations.SerializedName

open class mealsPojo {

    data class mealsRes(

        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null,
        @SerializedName("status") var status: String? = null,
        @SerializedName("description") var description: String? = null,
        @SerializedName("images") var images: ArrayList<String> = arrayListOf(),
        @SerializedName("carbohydrate") var carbohydrate: String? = null,
        @SerializedName("fat") var fat: String? = null,
        @SerializedName("fiber") var fiber: String? = null,
        @SerializedName("calories") var calories: String? = null,
        @SerializedName("weight") var weight: Int? = null,
        @SerializedName("volume") var volume: Int? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("priceBeforeDiscount") var priceBeforeDiscount: String? = null,
        @SerializedName("quantity") var quantity: String? = null,
        @SerializedName("ingredients") var ingredients: ArrayList<String> = arrayListOf(),
        @SerializedName("tags") var tags: ArrayList<String> = arrayListOf(),
        @SerializedName("sortIndex") var sortIndex: Int? = null,
        @SerializedName("categories") var categories: ArrayList<String> = arrayListOf(),
        @SerializedName("deliveryRestrictions") var deliveryRestrictions: ArrayList<String> = arrayListOf(),
        @SerializedName("updatedAt") var updatedAt: String? = null,
        @SerializedName("createdAt") var createdAt: String? = null,
        @SerializedName("modifications") var modifications: String? = null,
        @SerializedName("mainMeal") var mainMeal: Boolean? = null,
        @SerializedName("modificationValues") var modificationValues: String? = null,
        @SerializedName("toppingGroups") var toppingGroups: ArrayList<String> = arrayListOf(),
        @SerializedName("media") var media: ArrayList<String> = arrayListOf(),
        @SerializedName("descriptionRich") var descriptionRich: String? = null,
        @SerializedName("previewImage") var previewImage: String? = null,
        @SerializedName("minPrice") var minPrice: Int? = null
    )


}