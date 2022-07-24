package br.kurtzz.com.impacta.desafio_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.kurtzz.com.impacta.desafio_nav.databinding.FragmentPrimeiroBinding
import kotlin.random.Random


class Primeiro_Fragment : Fragment()
{

    private var _binding: FragmentPrimeiroBinding? = null
    private val binding: FragmentPrimeiroBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        _binding = FragmentPrimeiroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        var numeroRandom: Int = -1
        var guardaRandom: Int = 0
        if (numeroRandom < 0)
        {
            numeroRandom = Random.nextInt(6, 10)
            var guardaRandom = numeroRandom
        }
        binding.textViewTeste.text = "Random=$numeroRandom Guardado=$guardaRandom"
        binding.buttonPrimeiroFrag.setOnClickListener {
            findNavController().navigate(R.id.action_primeiro_Fragment_to_quarto_Fragment2)
        }
    }

}
