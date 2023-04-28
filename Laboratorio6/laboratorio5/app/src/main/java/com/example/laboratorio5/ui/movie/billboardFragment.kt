package com.example.laboratorio5.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.example.laboratorio5.R


class billboardFragment : Fragment() {

    private lateinit var actionToMovie: CardView
    private lateinit var actionToMovie2: CardView
    private lateinit var actionToNewMoview: FloatingActionButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_billboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        actionToMovie = view.findViewById(R.id.id_cardView_movie)
        actionToMovie2 = view.findViewById(R.id.id_cardView_movie2)

        actionToNewMoview = view.findViewById(R.id.floating_action_button)

        actionToMovie.setOnClickListener {
            it.findNavController().navigate(R.id.movieFragment)
        }

        actionToMovie2.setOnClickListener {
            it.findNavController().navigate(R.id.movieFragment)
        }

        actionToNewMoview.setOnClickListener {
            it.findNavController().navigate(R.id.newMovieFragment)
        }
    }
}