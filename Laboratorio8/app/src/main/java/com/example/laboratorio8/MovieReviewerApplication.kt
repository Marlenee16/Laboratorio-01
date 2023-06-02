package com.example.laboratorio8

import android.app.Application
import com.example.laboratorio8.data.movies
import com.example.laboratorio8.repository.MovieRepository

class MovieReviewerApplication: Application() {

    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}