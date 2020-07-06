package com.alikit.news.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.ldt.navigation.NavigationFragment
import com.ldt.navigation.router.SplitRouter
import com.ldt.navigation.router.SplitRouterSaver

abstract class BaseActivity: AppCompatActivity(), SplitRouter {
    private val _routerSaver = SplitRouterSaver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(provideLayout(this))
        onCreateRouter(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        onSaveRouterState(outState)
    }

    override fun onBackPressed() {
        if (onNavigateBack()) return
        super.onBackPressed()
    }

    override fun provideFragmentManager(): FragmentManager = supportFragmentManager
    override fun getRouterSaver(): SplitRouterSaver = _routerSaver
}