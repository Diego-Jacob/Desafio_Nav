package br.kurtzz.com.impacta.desafio_nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.kurtzz.com.impacta.desafio_nav.databinding.ActivityMainBinding

var _binding: ActivityMainBinding? = null
val binding get() = _binding!!

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}