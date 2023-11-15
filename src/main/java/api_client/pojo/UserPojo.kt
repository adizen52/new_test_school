package api_client.pojo

import com.google.gson.annotations.SerializedName

open class userPojo {

    data class UserData(
        @SerializedName("name") var name: String? = null,
        @SerializedName("phone") var phone: String? = null,
        @SerializedName("session") var session: String? = null,
        @SerializedName("phoneStatus") var phoneStatus: String? = null,
        @SerializedName("bonuses") var bonuses: Int? = null,
        @SerializedName("instagram") var instagram: String? = null,
        @SerializedName("email") var email: String? = null,
        @SerializedName("birthDate") var birthDate: String? = null,
        @SerializedName("bonusCardCode") var bonusCardCode: String? = null,
        @SerializedName("order") var order: Order? = Order(),
        @SerializedName("addresses") var addresses: ArrayList<Addresses> = arrayListOf(),
        @SerializedName("wallet") var wallet: ArrayList<Wallet> = arrayListOf(),
        @SerializedName("bonusProgram") var bonusProgram: BonusProgram? = BonusProgram()
    )

    data class Status(
        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null
    )

    data class Yandex(
        @SerializedName("geoObject") var geoObject: String? = null
    )

    data class Address(

        @SerializedName("code") var code: Int? = null,
        @SerializedName("street") var street: String? = null,
        @SerializedName("flat") var flat: String? = null,
        @SerializedName("floor") var floor: Int? = null,
        @SerializedName("entrance") var entrance: String? = null,
        @SerializedName("doorphone") var doorphone: String? = null,
        @SerializedName("comment") var comment: String? = null,
        @SerializedName("yandex") var yandex: Yandex? = Yandex(),
        @SerializedName("longitude") var longitude: Int? = null,
        @SerializedName("latitude") var latitude: Int? = null,
        @SerializedName("shopId") var shopId: String? = null,
        @SerializedName("zoneId") var zoneId: String? = null,
        @SerializedName("city") var city: String? = null

    )

    data class Toppings(

        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("maxAmount") var maxAmount: Int? = null,
        @SerializedName("minAmount") var minAmount: Int? = null,
        @SerializedName("required") var required: Boolean? = null,
        @SerializedName("images") var images: ArrayList<String> = arrayListOf(),
        @SerializedName("quantity") var quantity: Int? = null

    )

    data class Tags(

        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null

    )

    data class Modifications(
        @SerializedName("chocolate") var Chokolate: ArrayList<Any> = arrayListOf()
    )

    data class ModificationValues(

        @SerializedName("type") var type: String? = null,
        @SerializedName("name") var name: String? = null

    )

    data class Toppings1(

        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("maxAmount") var maxAmount: Int? = null,
        @SerializedName("minAmount") var minAmount: Int? = null,
        @SerializedName("required") var required: Boolean? = null,
        @SerializedName("images") var images: ArrayList<String> = arrayListOf(),
        @SerializedName("quantity") var quantity: Int? = null

    )

    data class ToppingGroups(

        @SerializedName("maxAmount") var maxAmount: Int? = null,
        @SerializedName("minAmount") var minAmount: Int? = null,
        @SerializedName("required") var required: Boolean? = null,
        @SerializedName("groupName") var groupName: String? = null,
        @SerializedName("toppings") var toppings: ArrayList<Toppings> = arrayListOf()

    )

    data class Product(

        @SerializedName("name") var name: String? = null,
        @SerializedName("status") var status: String? = null,
        @SerializedName("code") var code: String? = null,
        @SerializedName("sortIndex") var sortIndex: Int? = null,
        @SerializedName("description") var description: String? = null,
        @SerializedName("calories") var calories: Int? = null,
        @SerializedName("carbohydrate") var carbohydrate: Int? = null,
        @SerializedName("fat") var fat: Int? = null,
        @SerializedName("fiber") var fiber: Int? = null,
        @SerializedName("ingredients") var ingredients: ArrayList<String> = arrayListOf(),
        @SerializedName("categories") var categories: ArrayList<String> = arrayListOf(),
        @SerializedName("weight") var weight: Int? = null,
        @SerializedName("volume") var volume: Int? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("quantity") var quantity: Int? = null,
        @SerializedName("createdAt") var createdAt: String? = null,
        @SerializedName("updatedAt") var updatedAt: String? = null,
        @SerializedName("images") var images: ArrayList<String> = arrayListOf(),
        @SerializedName("tags") var tags: ArrayList<Tags> = arrayListOf(),
        @SerializedName("deliveryRestrictions") var deliveryRestrictions: ArrayList<String> = arrayListOf(),
        @SerializedName("modifications") var modifications: Modifications? = Modifications(),
        @SerializedName("mainMeal") var mainMeal: Boolean? = null,
        @SerializedName("modificationValues") var modificationValues: ModificationValues? = ModificationValues(),
        @SerializedName("toppingGroups") var toppingGroups: ArrayList<ToppingGroups> = arrayListOf(),
        @SerializedName("priceBeforeDiscount") var priceBeforeDiscount: Int? = null,
        @SerializedName("media") var media: ArrayList<String> = arrayListOf(),
        @SerializedName("descriptionRich") var descriptionRich: ArrayList<String> = arrayListOf(),
        @SerializedName("previewImage") var previewImage: String? = null,
        @SerializedName("minPrice") var minPrice: Int? = null

    )

    data class Items1(

        @SerializedName("code") var code: Int? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("discountPrice") var discountPrice: Int? = null,
        @SerializedName("totalPrice") var totalPrice: Int? = null,
        @SerializedName("quantity") var quantity: Int? = null,
        @SerializedName("presentItemsCount") var presentItemsCount: Int? = null,
        @SerializedName("mealGlobalId") var mealGlobalId: Int? = null,
        @SerializedName("categoryGlobalId") var categoryGlobalId: ArrayList<String> = arrayListOf(),
        @SerializedName("toppings") var toppings: ArrayList<Toppings> = arrayListOf(),
        @SerializedName("product") var product: Product? = Product(),
        @SerializedName("isAccessible") var isAccessible: Boolean? = null,
        @SerializedName("categoryNotAccessibility") var categoryNotAccessibility: String? = null,
        @SerializedName("notAccessibleByBrand") var notAccessibleByBrand: Boolean? = null,
        @SerializedName("notAccessibleByStopList") var notAccessibleByStopList: Boolean? = null

    )

    data class DeliveryPrice(

        @SerializedName("basketPriceTo") var basketPriceTo: Int? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("description") var description: String? = null

    )

    data class DeliveryTypePrice(

        @SerializedName("deliveryType") var deliveryType: String? = null,
        @SerializedName("minBasketPrice") var minBasketPrice: Int? = null,
        @SerializedName("defaultDeliveryPrice") var defaultDeliveryPrice: Int? = null,
        @SerializedName("deliveryPrice") var deliveryPrice: ArrayList<DeliveryPrice> = arrayListOf(),
        @SerializedName("deliveryTime") var deliveryTime: Int? = null,
        @SerializedName("paymentTypes") var paymentTypes: ArrayList<String> = arrayListOf(),
        @SerializedName("packageReturn") var packageReturn: Boolean? = null

    )

    data class Items(

        @SerializedName("code") var code: String? = null,
        @SerializedName("quantity") var quantity: Int? = null,
        @SerializedName("totalPrice") var totalPrice: String? = null

    )

    data class PackageItems(

        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null,
        @SerializedName("items") var items: ArrayList<Items> = arrayListOf(),
        @SerializedName("totalPrice") var totalPrice: String? = null,
        @SerializedName("maxFreeQuantity") var maxFreeQuantity: Int? = null

    )

    data class User(

        @SerializedName("name") var name: String? = null,
        @SerializedName("phone") var phone: String? = null,
        @SerializedName("session") var session: String? = null,
        @SerializedName("phoneStatus") var phoneStatus: String? = null,
        @SerializedName("bonuses") var bonuses: Int? = null,
        @SerializedName("instagram") var instagram: String? = null,
        @SerializedName("email") var email: String? = null,
        @SerializedName("birthDate") var birthDate: String? = null,
        @SerializedName("bonusCardCode") var bonusCardCode: String? = null

    )

    data class Promocode(

        @SerializedName("code") var code: String? = null,
        @SerializedName("status") var status: String? = null,
        @SerializedName("message") var message: String? = null,
        @SerializedName("discount") var discount: Int? = null,
        @SerializedName("type") var type: String? = null,
        @SerializedName("value") var value: Int? = null

    )

    data class Condition(

        @SerializedName("minPrice") var minPrice: Int? = null,
        @SerializedName("maxPrice") var maxPrice: Int? = null,
        @SerializedName("deliveryType") var deliveryType: ArrayList<String> = arrayListOf(),
        @SerializedName("paymentType") var paymentType: ArrayList<String> = arrayListOf(),
        @SerializedName("meals") var meals: ArrayList<String> = arrayListOf()

    )

    data class Meals(

        @SerializedName("code") var code: String? = null,
        @SerializedName("quantity") var quantity: Int? = null

    )

    data class GoalDiscounts(

        @SerializedName("description") var description: String? = null,
        @SerializedName("lastApplicable") var lastApplicable: Boolean? = null,
        @SerializedName("type") var type: String? = null,
        @SerializedName("condition") var condition: Condition? = Condition(),
        @SerializedName("value") var value: Int? = null,
        @SerializedName("meals") var meals: ArrayList<Meals> = arrayListOf(),
        @SerializedName("popupTitle") var popupTitle: String? = null,
        @SerializedName("popupDescription") var popupDescription: String? = null

    )

    data class Meals1(

        @SerializedName("code") var code: String? = null,
        @SerializedName("quantity") var quantity: Int? = null

    )

    data class Conditions(

        @SerializedName("completed") var completed: Boolean? = null,
        @SerializedName("title") var title: String? = null

    )

    data class Discounts(

        @SerializedName("name") var name: String? = null,
        @SerializedName("status") var status: String? = null,
        @SerializedName("message") var message: String? = null,
        @SerializedName("discount") var discount: Int? = null,
        @SerializedName("type") var type: String? = null,
        @SerializedName("value") var value: Int? = null,
        @SerializedName("kind") var kind: String? = null,
        @SerializedName("size") var size: Int? = null,
        @SerializedName("meals") var meals: ArrayList<Meals> = arrayListOf(),
        @SerializedName("conditions") var conditions: ArrayList<Conditions> = arrayListOf(),
        @SerializedName("code") var code: String? = null

    )

    data class Toppings2(

        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("maxAmount") var maxAmount: Int? = null,
        @SerializedName("minAmount") var minAmount: Int? = null,
        @SerializedName("required") var required: Boolean? = null,
        @SerializedName("images") var images: ArrayList<String> = arrayListOf(),
        @SerializedName("quantity") var quantity: Int? = null

    )

    data class Tags2(

        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null

    )

    data class Modifications2(
        @SerializedName("chocolate") var chocolate: String? = null
    )

    data class ModificationValues1(

        @SerializedName("type") var type: String? = null,
        @SerializedName("name") var name: String? = null

    )

    data class Toppings3(

        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("maxAmount") var maxAmount: Int? = null,
        @SerializedName("minAmount") var minAmount: Int? = null,
        @SerializedName("required") var required: Boolean? = null,
        @SerializedName("images") var images: ArrayList<String> = arrayListOf(),
        @SerializedName("quantity") var quantity: Int? = null

    )

    data class ToppingGroups1(

        @SerializedName("maxAmount") var maxAmount: Int? = null,
        @SerializedName("minAmount") var minAmount: Int? = null,
        @SerializedName("required") var required: Boolean? = null,
        @SerializedName("groupName") var groupName: String? = null,
        @SerializedName("toppings") var toppings: ArrayList<Toppings> = arrayListOf()

    )

    data class Product1(

        @SerializedName("name") var name: String? = null,
        @SerializedName("status") var status: String? = null,
        @SerializedName("code") var code: String? = null,
        @SerializedName("sortIndex") var sortIndex: Int? = null,
        @SerializedName("description") var description: String? = null,
        @SerializedName("calories") var calories: Int? = null,
        @SerializedName("carbohydrate") var carbohydrate: Int? = null,
        @SerializedName("fat") var fat: Int? = null,
        @SerializedName("fiber") var fiber: Int? = null,
        @SerializedName("ingredients") var ingredients: ArrayList<String> = arrayListOf(),
        @SerializedName("categories") var categories: ArrayList<String> = arrayListOf(),
        @SerializedName("weight") var weight: Int? = null,
        @SerializedName("volume") var volume: Int? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("quantity") var quantity: Int? = null,
        @SerializedName("createdAt") var createdAt: String? = null,
        @SerializedName("updatedAt") var updatedAt: String? = null,
        @SerializedName("images") var images: ArrayList<String> = arrayListOf(),
        @SerializedName("tags") var tags: ArrayList<Tags> = arrayListOf(),
        @SerializedName("deliveryRestrictions") var deliveryRestrictions: ArrayList<String> = arrayListOf(),
        @SerializedName("modifications") var modifications: Modifications? = Modifications(),
        @SerializedName("mainMeal") var mainMeal: Boolean? = null,
        @SerializedName("modificationValues") var modificationValues: ModificationValues? = ModificationValues(),
        @SerializedName("toppingGroups") var toppingGroups: ArrayList<ToppingGroups> = arrayListOf(),
        @SerializedName("priceBeforeDiscount") var priceBeforeDiscount: Int? = null,
        @SerializedName("media") var media: ArrayList<String> = arrayListOf(),
        @SerializedName("descriptionRich") var descriptionRich: ArrayList<String> = arrayListOf(),
        @SerializedName("previewImage") var previewImage: String? = null,
        @SerializedName("minPrice") var minPrice: Int? = null

    )

    data class StopListItems(

        @SerializedName("code") var code: Int? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("discountPrice") var discountPrice: Int? = null,
        @SerializedName("totalPrice") var totalPrice: Int? = null,
        @SerializedName("quantity") var quantity: Int? = null,
        @SerializedName("presentItemsCount") var presentItemsCount: Int? = null,
        @SerializedName("mealGlobalId") var mealGlobalId: Int? = null,
        @SerializedName("categoryGlobalId") var categoryGlobalId: ArrayList<String> = arrayListOf(),
        @SerializedName("toppings") var toppings: ArrayList<Toppings> = arrayListOf(),
        @SerializedName("product") var product: Product? = Product(),
        @SerializedName("isAccessible") var isAccessible: Boolean? = null,
        @SerializedName("categoryNotAccessibility") var categoryNotAccessibility: String? = null,
        @SerializedName("notAccessibleByBrand") var notAccessibleByBrand: Boolean? = null,
        @SerializedName("notAccessibleByStopList") var notAccessibleByStopList: Boolean? = null

    )

    data class Order(

        @SerializedName("flatwareAmount") var flatwareAmount: Int? = null,
        @SerializedName("safeDelivery") var safeDelivery: Boolean? = null,
        @SerializedName("comment") var comment: String? = null,
        @SerializedName("userName") var userName: String? = null,
        @SerializedName("userPhone") var userPhone: String? = null,
        @SerializedName("packageReturn") var packageReturn: Boolean? = null,
        @SerializedName("deliveryType") var deliveryType: String? = null,
        @SerializedName("payMethod") var payMethod: String? = null,
        @SerializedName("code") var code: Int? = null,
        @SerializedName("status") var status: Status? = Status(),
        @SerializedName("price") var price: Int? = null,
        @SerializedName("discountPrice") var discountPrice: Int? = null,
        @SerializedName("totalPrice") var totalPrice: Int? = null,
        @SerializedName("address") var address: Address? = Address(),
        @SerializedName("bonuses") var bonuses: Int? = null,
        @SerializedName("items") var items: ArrayList<Items> = arrayListOf(),
        @SerializedName("deliveryPrice") var deliveryPrice: Int? = null,
        @SerializedName("deliveryTime") var deliveryTime: String? = null,
        @SerializedName("deliveryDuration") var deliveryDuration: Int? = null,
        @SerializedName("updatedAt") var updatedAt: String? = null,
        @SerializedName("deliveryPriceDesc") var deliveryPriceDesc: String? = null,
        @SerializedName("notCall") var notCall: Boolean? = null,
        @SerializedName("table") var table: String? = null,
        @SerializedName("isPreorder") var isPreorder: Boolean? = null,
        @SerializedName("source") var source: String? = null,
        @SerializedName("deliveryMinutes") var deliveryMinutes: Int? = null,
        @SerializedName("cookingMinutes") var cookingMinutes: Int? = null,
        @SerializedName("lang") var lang: String? = null,
        @SerializedName("awardedBonuses") var awardedBonuses: Int? = null,
        @SerializedName("canBeUsedBonuses") var canBeUsedBonuses: Int? = null,
        @SerializedName("sumToPay") var sumToPay: Int? = null,
        @SerializedName("changeFrom") var changeFrom: Int? = null,
        @SerializedName("deliveryTypePrice") var deliveryTypePrice: DeliveryTypePrice? = DeliveryTypePrice(),
        @SerializedName("packageItems") var packageItems: ArrayList<PackageItems> = arrayListOf(),
        @SerializedName("packageItemsPrice") var packageItemsPrice: String? = null,
        @SerializedName("user") var user: User? = User(),
        @SerializedName("promocode") var promocode: Promocode? = Promocode(),
        @SerializedName("errorReason") var errorReason: String? = null,
        @SerializedName("errorCode") var errorCode: String? = null,
        @SerializedName("payCardId") var payCardId: String? = null,
        @SerializedName("saveCard") var saveCard: Boolean? = null,
        @SerializedName("goalDiscounts") var goalDiscounts: ArrayList<GoalDiscounts> = arrayListOf(),
        @SerializedName("discounts") var discounts: ArrayList<Discounts> = arrayListOf(),
        @SerializedName("stopListItems") var stopListItems: ArrayList<StopListItems> = arrayListOf(),
        @SerializedName("upsale") var upsale: ArrayList<String> = arrayListOf()

    )

    data class Yandex1(
        @SerializedName("geoObject") var geoObject: String? = null
    )

    data class Addresses(

        @SerializedName("code") var code: Int? = null,
        @SerializedName("street") var street: String? = null,
        @SerializedName("flat") var flat: String? = null,
        @SerializedName("floor") var floor: Int? = null,
        @SerializedName("entrance") var entrance: String? = null,
        @SerializedName("doorphone") var doorphone: String? = null,
        @SerializedName("comment") var comment: String? = null,
        @SerializedName("yandex1") var yandex: Yandex1? = Yandex1(),
        @SerializedName("longitude") var longitude: Int? = null,
        @SerializedName("latitude") var latitude: Int? = null,
        @SerializedName("shopId") var shopId: String? = null,
        @SerializedName("zoneId") var zoneId: String? = null,
        @SerializedName("city") var city: String? = null

    )

    data class Wallet(

        @SerializedName("name") var name: String? = null,
        @SerializedName("method") var method: String? = null

    )

    data class Levels(

        @SerializedName("title") var title: String? = null,
        @SerializedName("minBound") var minBound: Int? = null,
        @SerializedName("maxBound") var maxBound: Int? = null,
        @SerializedName("type") var type: String? = null,
        @SerializedName("value") var value: Int? = null

    )

    data class Choices(
        @SerializedName("strin1") var string1: String? = null
    )

    data class ExtraCustomerFields(

        @SerializedName("title") var title: String? = null,
        @SerializedName("type") var type: String? = null,
        @SerializedName("value") var value: String? = null,
        @SerializedName("required") var required: Boolean? = null,
        @SerializedName("choices") var choices: Choices? = Choices()

    )

    data class BonusProgram(

        @SerializedName("withdrawPercent") var withdrawPercent: Int? = null,
        @SerializedName("refillPercent") var refillPercent: Int? = null,
        @SerializedName("canUseWithPromocode") var canUseWithPromocode: Boolean? = null,
        @SerializedName("canUseWithDiscount") var canUseWithDiscount: Boolean? = null,
        @SerializedName("refillFromClean") var refillFromClean: Boolean? = null,
        @SerializedName("levels") var levels: ArrayList<Levels> = arrayListOf(),
        @SerializedName("requiredCustomerFields") var requiredCustomerFields: ArrayList<String> = arrayListOf(),
        @SerializedName("extraCustomerFields") var extraCustomerFields: ArrayList<ExtraCustomerFields> = arrayListOf(),
        @SerializedName("extraFields") var extraFields: ArrayList<String> = arrayListOf(),
        @SerializedName("level") var level: String? = null,
        @SerializedName("isLoyaltyActive") var isLoyaltyActive: Boolean? = null

    )
}