package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RulesFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rules, container, false)
    }


    //Same here like in AboutFragment...
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
//        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
//            inflater, R.layout.fragment_title, container, false)
//
//        binding.ruleEvery.setOnClickListener { view: View ->
//            view.findNavController().navigate(R.id.action_titleFragment_to_rulesFragment)
//        }
//        return binding.root
//    }

}
