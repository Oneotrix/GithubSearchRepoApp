package com.oneotrix.javarxtesting.view.downloads

import com.oneotrix.javarxtesting.databinding.FragmentDownloadsBinding
import com.oneotrix.javarxtesting.view.BaseFragment

class DownloadRepositoriesFragment: BaseFragment<FragmentDownloadsBinding>(FragmentDownloadsBinding::inflate){



    companion object {

        fun newInstance() = DownloadRepositoriesFragment()
    }

}