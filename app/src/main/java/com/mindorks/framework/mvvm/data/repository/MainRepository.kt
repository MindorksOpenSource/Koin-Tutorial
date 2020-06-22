package com.mindorks.framework.mvvm.data.repository

import com.mindorks.framework.mvvm.data.api.ApiHelper

class MainRepository constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}