package com.alikit.news.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.alikit.news.ui.base.BaseActivity
import com.alikit.news.ui.home.HomeScreen
import com.ldt.navigation.NavigationFragment
import com.ldt.navigation.router.FlexRouter
import com.ldt.navigation.router.SplitRouter
import com.ldt.navigation.router.SplitRouterSaver

class MainActivity : BaseActivity() {
    override fun provideDefaultDetailFragment(): Class<out NavigationFragment> = HomeScreen::class.java
    override fun provideDefaultMasterFragment(): Class<out NavigationFragment> = HomeScreen::class.java
}