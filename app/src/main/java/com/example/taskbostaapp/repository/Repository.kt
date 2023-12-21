package com.example.taskbostaapp.repository


import com.example.taskbostaapp.api.ServiceBuilder
import com.example.taskbostaapp.api.TaskBostaService

import javax.inject.Inject
//@Inject
class Repository  constructor(private val retrofit: TaskBostaService = ServiceBuilder.buildService()) {
    suspend fun getUser() = retrofit.getUser()
    suspend fun getAlbums(userId: Int) = retrofit.getAlbums(userId)
    suspend fun getPhotos(albumId: Int) = retrofit.getPhotos(albumId)

}