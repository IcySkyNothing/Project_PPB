package com.mukeshsolanki.snake.presentation.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.mukeshsolanki.snake.R
import com.mukeshsolanki.snake.domain.navigation.Screen
import com.mukeshsolanki.snake.presentation.component.AppButton
import com.mukeshsolanki.snake.presentation.component.DisplayLarge
import com.mukeshsolanki.snake.presentation.theme.border2dp
import com.mukeshsolanki.snake.presentation.theme.padding16dp
import com.mukeshsolanki.snake.presentation.theme.padding64dp
import com.mukeshsolanki.snake.presentation.theme.width248dp

@Composable
fun MenuScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding16dp)
            .border(width = border2dp, color = MaterialTheme.colorScheme.onBackground),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val context = LocalContext.current
        DisplayLarge(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .padding(bottom = padding64dp))

        AppButton(
            modifier = Modifier.width(width248dp),
            text = stringResource(R.string.SetName)
        ) {
            navController.navigate(Screen.Settings.route)
        }


        AppButton(
            modifier = Modifier.width(width248dp),
            text = stringResource(id = R.string.high_score)
        ) {
            navController.navigate(Screen.HighScores.route)
        }


        AppButton(
            modifier = Modifier.width(width248dp),
            text = stringResource(R.string.about)
        ) {
            navController.navigate(Screen.About.route)
        }
    }
}
