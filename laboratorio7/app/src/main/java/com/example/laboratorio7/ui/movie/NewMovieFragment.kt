package com.example.laboratorio7.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.laboratorio7.databinding.FragmentNewMovieBinding
import com.example.laboratorio7.ui.movie.MovieViewModel

class NewMovieFragment : Fragment() {

    private lateinit var binding: FragmentNewMovieBinding

    private val viewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentNewMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
        setObserver()
    }

    private fun setViewModel(){
        binding.viewmodel = viewModel
    }

    private fun setObserver(){
        viewModel.status.observe(viewLifecycleOwner) {status ->
            when{
                status.equals(MovieViewModel.MOVIE_CREATED) -> {
                    Log.d("TAG APP", status)
                    Log.d("TAG APP", viewModel.getMovies().toString())

                    Toast.makeText(this.context, status, Toast.LENGTH_SHORT).show()

                    viewModel.clearData()
                    viewModel.clearStatus()

                    findNavController().popBackStack()
                }status.equals(MovieViewModel.WRONG_DATA) -> {
                Log.d("TAG APP", status)

                Toast.makeText(this.context, status, Toast.LENGTH_SHORT).show()
            }
            }


            Toast.makeText(this.context, status, Toast.LENGTH_SHORT).show()
        }
    }



}