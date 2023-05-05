package com.iremkryt.rickandmortyapp.data

sealed class Result<T>(
    val data: T? = null,
    val message: String? = null,
    val networkError: Boolean = false
){
    class Loading<T>(data: T? = null): Result<T>(data)
    class Success<T>(data: T): Result<T>(data)
    class Error<T>(networkError: Boolean, message: String?): Result<T>(data = null, message = message, networkError = networkError)
}