package com.alikit.news.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.alikit.news.ui.base.BaseActivity
import com.ldt.navigation.NavigationFragment
import com.ldt.navigation.router.FlexRouter
import com.ldt.navigation.router.SplitRouter
import com.ldt.navigation.router.SplitRouterSaver

class MainActivity : BaseActivity() {
    override fun provideDefaultDetailFragment(): Class<out NavigationFragment> {
        TODO("Not yet implemented")
    }

    override fun provideDefaultMasterFragment(): Class<out NavigationFragment> {
        TODO("Not yet implemented")
    }

}