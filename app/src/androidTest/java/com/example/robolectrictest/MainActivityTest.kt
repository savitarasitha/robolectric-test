package com.example.robolectrictest


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest{

    @get:Rule
    var scenario= ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun setup(){
        onView(withId(R.id.editText)).perform(typeText("Hello")
            , closeSoftKeyboard())
        onView(withId(R.id.btn_change_text)).perform(click())
        onView(withId(R.id.tv_hello_world)).check(matches(withText("Hello World!")))
    }
}