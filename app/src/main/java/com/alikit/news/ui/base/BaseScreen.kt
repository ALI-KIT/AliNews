package com.alikit.news.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import com.ldt.navigation.NavigationFragment

abstract class BaseScreen(private val layoutId: Int) : NavigationFragment() {
    override fun onCreateContentView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater?.inflate(layoutId, container, false)

    @StringRes
    abstract fun title(): Int
    fun titleText() : String = requireContext().resources.getText(title()).toString()
}