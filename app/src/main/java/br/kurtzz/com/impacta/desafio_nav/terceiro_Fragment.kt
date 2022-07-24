package br.kurtzz.com.impacta.desafio_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.kurtzz.com.impacta.desafio_nav.databinding.FragmentTerceiroBinding


class terceiro_Fragment : Fragment() {

    private var _binding: FragmentTerceiroBinding? = null
    private val binding: FragmentTerceiroBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTerceiroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonTerceiroFrag.setOnClickListener{
            findNavController().navigate(R.id.action_terceiro_Fragment_to_primeiro_Fragment3)
        }
    }


}