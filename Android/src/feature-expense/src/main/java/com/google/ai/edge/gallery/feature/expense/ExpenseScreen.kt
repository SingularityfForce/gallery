package com.google.ai.edge.gallery.feature.expense

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlinx.serialization.Serializable

/** Navigation destination for the expense feature */
object ExpenseDestination {
    @Serializable
    val route: String = "expense"
}

@Composable
fun ExpenseScreen(modifier: Modifier = Modifier) {
    Text(text = "Expense feature", modifier = modifier)
}
