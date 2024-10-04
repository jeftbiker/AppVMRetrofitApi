package com.adso.appvm.data

import com.adso.appvm.model.CreditCardResponse
import com.adso.appvm.service.RetrofitInstance

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.creditCardService
    suspend fun getCreditCards(): CreditCardResponse{
        return creditCardService.getCreditCards()
    }
}