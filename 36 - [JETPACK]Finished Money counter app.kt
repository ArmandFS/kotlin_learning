package com.example.introtocomposeapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.introtocomposeapp.ui.theme.IntroToComposeAppTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroToComposeAppTheme {
                //call composables here
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val moneyCounter = remember {
        mutableStateOf(0)
    }
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth(),
             //put gray here
             color = Color(0xFF546E7A)
    ){
      Column(
          verticalArrangement = Arrangement.Center,
          horizontalAlignment = Alignment.CenterHorizontally
            ){
          Text(text = "$${moneyCounter.value}", style = TextStyle(
              color = Color.White,
              fontSize = 35.sp,
              fontWeight = FontWeight.ExtraBold
          ))
          Spacer(modifier = Modifier.height((130.dp)))
          //add circle into surface
          CreateCircle(moneyCounter = moneyCounter.value) {
              //pass the int to the lambda function
              moneyCounter.value = it + 1
          }
          if (moneyCounter.value > 25){
              Text(text = "You are rich!")
          }

      }
    }
}
//create circle composable function
//pass a callback function
@Composable
fun CreateCircle(moneyCounter: Int = 0, updateMoneyCounter: (Int) -> Unit){
    Card(modifier = Modifier
        .padding(3.dp)
        .size(100.dp)
        .clickable {
            updateMoneyCounter(moneyCounter)
        },
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            ,contentAlignment = Alignment.Center) {
            Text(text = "Tap", modifier = Modifier)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IntroToComposeAppTheme {
        MyApp()
    }
}
