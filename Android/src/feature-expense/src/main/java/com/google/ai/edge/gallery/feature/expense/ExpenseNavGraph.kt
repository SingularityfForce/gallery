package com.google.ai.edge.gallery.feature.expense

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.expenseGraph(navigateUp: () -> Unit) {
    composable(route = ExpenseDestination.route) {
        ExpenseScreen()
    }
}
