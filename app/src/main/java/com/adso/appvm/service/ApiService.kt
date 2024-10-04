package com.adso.appvm.service

import com.adso.appvm.model.CreditCard
import com.adso.appvm.model.CreditCardResponse
import retrofit2.http.GET

interface ApiService {
    @GET("credit_cards")
    suspend fun getCreditCards(): CreditCardResponse
}