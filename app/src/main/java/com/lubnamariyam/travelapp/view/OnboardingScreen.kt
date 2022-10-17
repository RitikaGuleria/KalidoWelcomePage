package com.lubnamariyam.travelapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lubnamariyam.travelapp.model.Page


@Composable
fun PageUi(page: Page){
    Column(modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally) {

        if(page.image1!=0)Image(painter= painterResource(id = page.image1), contentDescription = null, modifier = Modifier.height(200.dp).width(200.dp))

        Text(text = stringResource(page.title), fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = stringResource(page.description), fontSize = 20.sp , textAlign = TextAlign.Center , modifier = Modifier.padding(start = 10.dp , end = 10.dp))
        Spacer(modifier = Modifier.height(50.dp))

        if(page.image!=0)
            Image(painter = painterResource(id = page.image), contentDescription = null ,
            modifier = Modifier
                .height(200.dp)
                .width(250.dp)
        )

    }
}



