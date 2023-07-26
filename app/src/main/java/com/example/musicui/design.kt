package com.example.musicui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun alls() {
    Column {
        Section1()
        Section2(chips = listOf("Vandan","Vivek","Nikhil","Sahil"))
        Section3()
    }
}


@Composable
fun Section1() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Column() {
            Text(text = "Hello, Vandan", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Good Morning Vandan", style = MaterialTheme.typography.bodyLarge)
        }
        Image(painter = painterResource(id = R.drawable.search_ic), contentDescription =null, modifier = Modifier.size(45.dp))
    }
}

@Composable
fun Section2(chips : List<String>){
    var indexx by remember{
        mutableStateOf(0)
    }
    LazyRow{
        items(chips.size){
            Box(modifier = Modifier
                .padding(15.dp)
                .clickable { indexx = it }
                .clip(RoundedCornerShape(20.dp))
                .background(
                    Color.Black
                )
                .padding(20.dp)){
                Text(text = chips[it], color = Color.White)
            }
        }
    }
}

@Composable
fun Section3(){
    Column() {
        Row {
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .alpha(0.8f)
                    .padding(20.dp)
            ) {
                Text(text = "Maditaion", modifier = Modifier.align(Alignment.TopStart))
                Image(
                    painter = painterResource(id = R.drawable.music_ic), modifier = Modifier.align(
                        Alignment.BottomStart
                    ), contentDescription = "Music"
                )
                Button(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.BottomEnd)) {
                    Text(text = "Play")
                }

            }

            Box(
                modifier = Modifier
                    .size(200.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .alpha(0.8f)
                    .padding(10.dp)
            ) {
                Text(text = "Maditaion", modifier = Modifier.align(Alignment.TopStart))
                Image(
                    painter = painterResource(id = R.drawable.music_ic), modifier = Modifier.align(
                        Alignment.BottomStart
                    ), contentDescription = "Music"
                )
                Button(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.BottomEnd)) {
                    Text(text = "Play")
                }

            }
        }

        Row {
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .alpha(0.8f)
                    .padding(20.dp)
            ) {
                Text(text = "Maditaion", modifier = Modifier.align(Alignment.TopStart))
                Image(
                    painter = painterResource(id = R.drawable.music_ic), modifier = Modifier.align(
                        Alignment.BottomStart
                    ), contentDescription = "Music"
                )
                Button(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.BottomEnd)) {
                    Text(text = "Play")
                }

            }

            Box(
                modifier = Modifier
                    .size(200.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .alpha(0.8f)
                    .padding(20.dp)
            ) {
                Text(text = "Maditaion", modifier = Modifier.align(Alignment.TopStart))
                Image(
                    painter = painterResource(id = R.drawable.music_ic), modifier = Modifier.align(
                        Alignment.BottomStart
                    ), contentDescription = "Music"
                )
                Button(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.BottomEnd)) {
                    Text(text = "Play")
                }

            }
        }
    }



}


