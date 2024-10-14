package edu.temple.fragmentrefactor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        val displayTextView: TextView = view.findViewById(R.id.displayTextView)
        val nameEditText: EditText = view.findViewById(R.id.nameEditText)
        val changeButton: Button = view.findViewById(R.id.changeButton)

        changeButton.setOnClickListener {
            val enteredName = nameEditText.text.toString()
            displayTextView.text = "Hello, "+ enteredName
        }
        return view
    }
}
