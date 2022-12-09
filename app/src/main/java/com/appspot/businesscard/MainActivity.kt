package com.appspot.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appspot.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardScreen()
                }
            }
        }
    }
}


@Composable
fun BusinessCardScreen(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(top = 150.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        val image = painterResource(R.drawable.ic_baseline_android_24)
        Image(painter = image, contentDescription = "Android logo",
            colorFilter = ColorFilter.lighting(Color.Black, Color(0xFF3ddc84)),

        )
        Text(
            text = stringResource(R.string.logo_name),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 0.dp, bottom = 8.dp),
            color = Color.White
        )
        Text(
            text = stringResource(R.string.full_name),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 10.dp, bottom = 8.dp),
            color = Color.White
        )
        Text(
            text = stringResource(R.string.job_title),
            fontSize = 16.sp,
            color =  Color(0xFF3ddc84),

        )


    }
    
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(top = 600.dp),
        ) {
        val phoneIcon = painterResource(R.drawable.ic_baseline_call_24)
        val shareIcon = painterResource(R.drawable.ic_baseline_share_24)
        val  emailIcon = painterResource(R.drawable.ic_baseline_email_24)
        Divider(color = Color.White, )
        Row() {

            Image(painter = phoneIcon, contentDescription = "call icon", modifier = Modifier.padding(start =25.dp, bottom= 5.dp, end = 20.dp),
                colorFilter = ColorFilter.lighting(Color.Black, Color(0xFF3ddc84)))
            Text(text = stringResource(R.string.contact_information), color = Color.White)
        }
        Divider(color = Color.White, )
        Row() {
            Image(painter = shareIcon, contentDescription = "share icon", modifier = Modifier.padding(start =25.dp,bottom= 5.dp, end = 20.dp),
                colorFilter = ColorFilter.lighting(Color.Black, Color(0xFF3ddc84)))
            Text(text = stringResource(R.string.social_media_handle), color = Color.White)
        }
        Divider(color = Color.White, )
        Row() {
            Image(painter = emailIcon, contentDescription = "email icon", modifier = Modifier.padding(start =25.dp, end = 20.dp),
                colorFilter = ColorFilter.lighting(Color.Black, Color(0xFF3ddc84)))

            Text(text = stringResource(R.string.email_address), color = Color.White)
        }



    }
    
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCardScreen()
    }
}