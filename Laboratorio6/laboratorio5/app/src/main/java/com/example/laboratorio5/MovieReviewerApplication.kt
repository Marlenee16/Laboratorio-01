package com.example.laboratorio5

import android.app.Application
import com.example.laboratorio5.data.movies
import com.example.laboratorio5.repositories.MovieRepository


class MovieReviewerApplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}