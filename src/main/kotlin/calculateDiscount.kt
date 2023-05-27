fun calculateDiscount(purchaseAmount: Double, isRegularUser: Boolean): Double {
    var discount = 0.0

    when {
        0.0 <= purchaseAmount && purchaseAmount <= 1000.0 -> {
            discount = 0.0
        }
        1001.0 <= purchaseAmount && purchaseAmount <= 10000.0 -> {
            discount = 100.0
        }
        purchaseAmount > 10000.0 -> {
            discount = purchaseAmount * 0.05
        }
    }

    if (isRegularUser) {
        discount += purchaseAmount * 0.01
    }

    return discount
}