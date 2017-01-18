package com.primo.goods.mvp

import com.primo.network.models.ShippingQuote
import com.primo.network.new_models.Auth
import com.primo.network.new_models.CartItem
import com.primo.network.new_models.Product
import com.primo.network.new_models.Stock
import com.primo.utils.base.BasePresenter
import com.primo.utils.base.BaseView
import java.util.*

interface GoodsTotalView : BaseView {

    fun onUpdateShipping(shippings: MutableList<ShippingQuote>)

    fun updateProductList(products: List<CartItem>)

    fun showDescriptionDialog(data: Pair<CartItem, ArrayList<Stock>>)

    fun onSigned(result: Auth)

    fun deleteItem(cartItem: CartItem)
}

abstract class GoodsTotalPresenter(view: GoodsTotalView) : BasePresenter<GoodsTotalView>(view) {

    override fun onResume() {

    }

    override fun onPause() {

    }

    abstract fun updateCartItem(product: CartItem, isIncrement: Boolean)

    abstract fun updateCartItem(stockId: String, cartItemId: String, quantity: String)

    abstract fun addProduct(product: Product)

    abstract fun findProductByKeyword(keyword: String)

    abstract fun removeProduct(product: CartItem)

    abstract fun getProductList()

    abstract fun addToWishList(product: CartItem)

    abstract fun retrieveProductStock(product: CartItem)

    abstract fun signIn(email: String, password: String)

}