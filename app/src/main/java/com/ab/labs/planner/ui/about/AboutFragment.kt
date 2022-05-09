package com.ab.labs.planner.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import com.ab.labs.R
import com.ab.labs.planner.core.BaseFragment
import com.ab.labs.planner.core.extension.getViewModelExt
import com.ab.labs.databinding.FragmentAboutBinding

class AboutFragment : BaseFragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    private lateinit var aboutViewModel: AboutViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        aboutViewModel = getViewModelExt { AboutViewModel() }

        binding.infoView.text = HtmlCompat.fromHtml(getString(R.string.info_view), HtmlCompat.FROM_HTML_MODE_LEGACY)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}