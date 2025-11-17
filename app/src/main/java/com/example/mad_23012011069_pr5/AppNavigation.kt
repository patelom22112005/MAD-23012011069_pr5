package com.example.mad_23012011069_pr5


import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mad_23012011069_pr5.screen.LoginScreen
import com.example.mad_23012011069_pr5.screen.RegisterScreen


@Composable
fun AppNavigation(context: Context){
    val navcontroller = rememberNavController()
    NavHost(navController = navcontroller,
        startDestination = "login"){
        composable("login"){
            LoginScreen(context,navcontroller)
        }
        composable("registration"){
            RegisterScreen(context,navcontroller)
        }
    }
}