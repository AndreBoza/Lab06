// AppNavigator.kt
package com.example.lab06

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigator() {
    val navController = rememberNavController() // Controlador de navegación

    // Definir NavHost con rutas
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            CustomScaffold(navController) // Llamada a la función desde CustomScaffold.kt
        }
        composable("profile") {
            UserProfileScreen() // Ruta de la pantalla de perfil
        }
        composable("build") {
            BuildScreen() // Ruta de la pantalla de construcción
        }
        composable("menu") {
            MenuScreen() // Ruta de la pantalla de menú
        }
        composable("favorites") {
            FavoritesScreen() // Ruta de la pantalla de favoritos
        }
        composable("delete") {
            DeleteScreen() // Ruta de la pantalla de eliminar
        }
    }
}

@Composable
fun UserProfileScreen() {
    // Implementación de la vista de perfil de usuario
}

@Composable
fun BuildScreen() {
    Text(text = "Pantalla de Construcción") // Contenido de la pantalla de construcción
}

@Composable
fun MenuScreen() {
    Text(text = "Pantalla del Menú") // Contenido de la pantalla del menú
}

@Composable
fun FavoritesScreen() {
    Text(text = "Pantalla de Favoritos") // Contenido de la pantalla de favoritos
}

@Composable
fun DeleteScreen() {
    Text(text = "Pantalla de Eliminar") // Contenido de la pantalla de eliminar
}
