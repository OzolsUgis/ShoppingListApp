package com.ugisozols.shoppinglistapp

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule

@HiltAndroidTest
class ShoppingListAppE2E {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Before
    fun setUp(){
        hiltRule.inject()
    }

}