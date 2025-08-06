package com.trigent.datbricks.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val route: String
) {
    Home(title = "Home", icon = Icons.Default.Home, route = "home"),
    History(title = "History", icon = Icons.Default.List, route = "history"), // ✅ fixed
    About(title = "About", icon = Icons.Default.Info, route = "about")
}