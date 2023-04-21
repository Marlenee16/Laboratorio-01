package com.example.laboratorio5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BillboardFragment : Fragment() {

    private lateinit var actionNavToCreateMovie: FloatingActionButton
    private lateinit var actionNavToMovieFragment: CardView
    private lateinit var actionNavToMovieFragmentST: CardView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_billboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        actionNavToCreateMovie = view.findViewById(R.id.btn_crear_pelicula)
        actionNavToMovieFragmentST = view.findViewById(R.id.cardView02)

        actionNavToCreateMovie.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_createMovieFragment)
        }

        actionNavToMovieFragment = view.findViewById(R.id.cardView01)


        actionNavToMovieFragment.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }
        actionNavToMovieFragmentST.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }


    }

}