package br.kurtzz.com.impacta.desafio_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.kurtzz.com.impacta.desafio_nav.databinding.FragmentSegundoBinding


class segundo_Fragment : Fragment() {

    private var _binding: FragmentSegundoBinding? = null
    private val binding: FragmentSegundoBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSegundoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSegundoFrag.setOnClickListener {
            findNavController().navigate(R.id.action_segundo_Fragment_to_primeiro_Fragment2)
        }
    }


    }
