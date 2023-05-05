package com.iremkryt.rickandmortyapp.data.source.remote

import com.iremkryt.rickandmortyapp.data.source.remote.dto.CharactersDto
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortyApi {
    @GET("character/")
    suspend fun getCharacters(
        @Query("page") page: Int
    ): CharactersDto
}