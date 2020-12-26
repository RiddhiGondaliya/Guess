package com.example.guess

import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.guess.databinding.FragmentSquareBinding
import kotlin.math.absoluteValue


class SquareFragment : Fragment() {


    private lateinit var viewModel: SquareViewModel

    private lateinit var binding: FragmentSquareBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val binding = DataBindingUtil.inflate<FragmentSquareBinding>(
                inflater,
                R.layout.fragment_square,
                container,
                false
        )
        // called the viewModel class
        viewModel = ViewModelProvider(this).get(SquareViewModel::class.java)

        viewModel.textLiveData.observe(this) {
            binding.result.text = it.toString()
        }

        binding.btn.setOnClickListener {
            val editUsername = binding.userName.text.toString()
            val editPassword = binding.passWord.text.toString()

            viewModel.validate(editUsername, editPassword)
        }
        binding.btnReset.setOnClickListener {
            if (binding.userName.text.isNotBlank() && binding.passWord.text.isNotBlank()) {
                binding.userName.text.clear()
                binding.passWord.text.clear()
            } else {
                Toast.makeText(context, "its already blank!", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root


    }
}



