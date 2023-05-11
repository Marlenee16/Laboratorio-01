package com.example.laboratorio7

import android.app.Application
import com.example.laboratorio7.data.moviesFromDummyData
import com.example.laboratorio7.repository.MovieRepository


class MovieReviewerApplication : Application () {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(moviesFromDummyData)
    }
}