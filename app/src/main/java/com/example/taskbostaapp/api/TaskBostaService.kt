package com.example.taskbostaapp.api



import com.example.taskbostaapp.model.AlbumsResponse
import com.example.taskbostaapp.model.PhotosResponse
import com.example.taskbostaapp.model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET

import retrofit2.http.POST
import retrofit2.http.Query

interface TaskBostaService {


    @GET("users")
    suspend fun getUser(): Response<List<UserResponse>>


    @GET("albums")
    suspend fun getAlbums(
        @Query("userId") userId: Int
    ): Response<List<AlbumsResponse>>


    @GET("photos")
    suspend fun getPhotos(
        @Query("albumId") albumId: Int
    ): Response<List<PhotosResponse>>



}
