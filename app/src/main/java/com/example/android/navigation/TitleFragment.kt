package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        return FragmentTitleBinding.inflate(layoutInflater).run {
            playButton.setOnClickListener  (
                    Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
            )
            root
        }
    }
}