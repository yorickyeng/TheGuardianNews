package com.example.newsaggregator.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.newsaggregator.ui.screens.NewsDetailScreen
import com.example.newsaggregator.ui.screens.NewsListScreen
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

sealed class Screen(val route: String) {
    data object NewsList : Screen("news_list")
    data object NewsDetail : Screen("news_detail/{url}") {
        fun createRoute(url: String) =
            "news_detail/${URLEncoder.encode(url, StandardCharsets.UTF_8.toString())}"
    }
}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.NewsList.route,
    ) {
        composable(Screen.NewsList.route) {
            NewsListScreen(
                onNewsItemClick = { url ->
                    navController.navigate(Screen.NewsDetail.createRoute(url))
                }
            )
        }
        composable(Screen.NewsDetail.route) { backStackEntry ->
            val encodedUrl = backStackEntry.arguments?.getString("url") ?: return@composable
            val url = java.net.URLDecoder.decode(encodedUrl, StandardCharsets.UTF_8.toString())
            NewsDetailScreen(
                url = url,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
} 