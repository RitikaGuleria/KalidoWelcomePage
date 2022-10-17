package com.lubnamariyam.travelapp

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.lubnamariyam.travelapp.model.onboardPages
import com.lubnamariyam.travelapp.ui.theme.TravelzTheme
import com.lubnamariyam.travelapp.view.PageUi

@ExperimentalPagerApi
class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelzTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    OnboardingUi()
                }
            }
        }
    }
}


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun OnboardingUi() {

    val pagerState = rememberPagerState(pageCount = 6)

    Column {

        HorizontalPager(state = pagerState , modifier = Modifier
            .fillMaxSize()
            .weight(1f)) {
            page ->
            PageUi(page = onboardPages[page])
        }

        HorizontalPagerIndicator(pagerState = pagerState, modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(16.dp),
        activeColor = Color.Black)

        Button(onClick = { /*TODO*/ },shape= RoundedCornerShape(50), modifier = Modifier.padding(start=20.dp,end=20.dp),colors=ButtonDefaults.buttonColors(
            colorResource(id = R.color.seagreen))) {
            Text(text = "Join Kalido",color= Color.White, modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "I already have an account",color= colorResource(id = R.color.seagreen), modifier = Modifier.padding(start=100.dp), fontSize = 18.sp)
        Spacer(modifier = Modifier.height(20.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TravelzTheme {

    }
}