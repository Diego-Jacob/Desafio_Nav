package br.kurtzz.com.impacta.desafio_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import br.kurtzz.com.impacta.desafio_nav.databinding.FragmentTerceiroBinding


class terceiro_Fragment : Fragment() {

    private var _binding: FragmentTerceiroBinding? = null
    private val binding: FragmentTerceiroBinding get() = _binding!!
    private val args: terceiro_FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTerceiroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var texto = args.texto
        var random = args.random
        binding.textViewTerceiroFrag.text = texto
        binding.buttonTerceiroFrag.setOnClickListener{
            var action = terceiro_FragmentDirections.actionTerceiroFragmentToPrimeiroFragment3(random)
            findNavController().navigate(action)
        }
    }


}