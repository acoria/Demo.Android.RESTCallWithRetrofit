package com.example.restcallwithretrofit.Services

import com.example.restcallwithretrofit.Model.Animal
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface AnimalApiService{
    @GET("animals/{animal_id}")
    fun getAnimalData(@Path("animal_id") id: Long): Single<Animal>
}