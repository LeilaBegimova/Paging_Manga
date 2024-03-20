package com.example.android4_1.data.remote.apiservice

import retrofit2.http.GET
import retrofit2.http.Query
import com.example.android4_1.data.models.MangaResponse

private const val POST_END_POINT = "manga"

interface MangaApi {

    @GET(POST_END_POINT)
    suspend fun getManga(
        @Query("page[offset]") offset: Int,
        @Query("page[limit]") limit: Int,
    ): MangaResponse
}