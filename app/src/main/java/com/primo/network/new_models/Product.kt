package com.primo.network.new_models


data class Product(var productId: String = "",
              var productName: String = "",
              var currency: Int = 0,
              var price: Double = 0.0,
              var category: Int = 0,
              var variantType: Int = 0,
              var weightTypeUnit: Int = 0,
              var weightAmount: Double = 0.0,
              var description: String = "",
              var zeroPriceAction: Int = 0,
              var minimumOrderQty: Int = 0,
              var maximumOrderQty: Int = 0,
              var taxType: Int = 0,
              var taxAmount: Double = 0.0,
              var creationDate: String = "",
              var availSinceDate: String = "",
              var outOfStockAction: Int = 0,
              var defaultImage: String = "",
              var defaultThumbnail: String = "",
              var shippingDom_option: Int = 0,
              var shippingDom_amount: Double = 0.0,
              var shippingInterOption: Int = 0,
              var shippingInterAmount: Double = 0.0,
              var images: MutableList<Image> = mutableListOf(),
              var discounts: MutableList<Discount> = mutableListOf(),
              var stocks: MutableList<Stock> = mutableListOf()) {
}