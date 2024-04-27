package com.oneotrix.javarxtesting.view.search

import com.oneotrix.javarxtesting.databinding.FragmentSearchBinding
import com.oneotrix.javarxtesting.view.BaseFragment


class SearchFragment: BaseFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {





    companion object {
        fun newInstance() = SearchFragment()
    }

}