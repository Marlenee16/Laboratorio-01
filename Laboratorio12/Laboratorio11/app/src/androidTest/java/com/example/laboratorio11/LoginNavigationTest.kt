package com.example.laboratorio11

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.laboratorio11.ui.login.LoginFragment
import junit.framework.TestCase
import org.junit.Test

class LoginNavigationTest {

    @Test
    fun testNavigationToWelcome() {
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )

        val loginScenario =
            launchFragmentInContainer<LoginFragment>(themeResId = R.style.Theme_Laboratorio11)

        loginScenario.onFragment { fragment ->
            navController.setGraph(R.navigation.nav_graph)
            Navigation.setViewNavController(fragment.requireView(), navController)
        }

        Espresso.onView(withId(R.id.emailField)).perform(ViewActions.typeText("test@test.com"))
        Espresso.onView(withId(R.id.passwordField)).perform(ViewActions.typeText("12345678"))
        Espresso.onView(withId(R.id.loginBtn)).perform(ViewActions.click())

        Thread.sleep(2000)
        TestCase.assertEquals(navController.currentDestination?.id, R.id.welcomeFragment)
    }
}

