package com.example.retrofitkotlin

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    //    suspend, esta será necesaria para trabajar con corrutinas, es decir, siempre que queramos hacer llamadas
    //    en segundo plano usando corrutinas tendremos que añadirla para que funcione nuestro código

    @GET
    suspend fun getDogsByBreeds(@Url url:String):Response<DogsResponse>

}