package com.example.laboratorio7.repository
import com.example.laboratorio7.data.models.MovieModel

class MovieRepository (private val movies: MutableList<MovieModel>) {
    fun getMovies() = movies
    fun addMovie(newMovie: MovieModel) = movies.add(newMovie)
}