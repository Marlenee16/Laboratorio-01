package com.example.laboratorio8.repository

import com.example.laboratorio8.data.model.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>){

    fun getMovies() = movies

    fun addMovie(newMovie: MovieModel){
        movies.add(newMovie)
    }


}