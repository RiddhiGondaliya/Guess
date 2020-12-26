package com.example.guess

/**
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.guess.databinding.FragmentSquareBinding

// Simple code without viewModel,LiveData and Observer

class SquareFragment : Fragment() {


//  private lateinit var viewModel: SquareViewModel

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
//  viewModel = ViewModelProvider(this).get(SquareViewModel::class.java)



binding.btn.setOnClickListener {
val editUsername = binding.username.text.toString()

val editPassword = binding.password.text.toString()

if (editUsername == "admin" && editPassword == "admin123") {
binding.result.text = "success!!"
} else {
binding.result.text = "Fail("
}
}
return binding.root


}
}
 */
