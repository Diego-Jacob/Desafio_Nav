package br.kurtzz.com.impacta.desafio_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import br.kurtzz.com.impacta.desafio_nav.databinding.FragmentSegundoBinding


class segundo_Fragment : Fragment() {

    private var _binding: FragmentSegundoBinding? = null
    private val binding: FragmentSegundoBinding get() = _binding!!
    private val args: segundo_FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSegundoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var random = args.random
        var texto = args.texto
        binding.textViewSegundoFrag.text = texto

        binding.buttonSegundoFrag.setOnClickListener {
            var action = segundo_FragmentDirections.actionSegundoFragmentToPrimeiroFragment2(random)
            findNavController().navigate(action)
        }
    }


    }
