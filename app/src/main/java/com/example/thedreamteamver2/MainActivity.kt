package com.example.thedreamteamver2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.concurrent.BlockingDeque

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                DreamTeamScreen()
            }
        }
    }
}

@Composable
fun DreamTeamScreen() {
    val context = LocalContext.current

    val jostBold = FontFamily(Font(R.font.jostbold))
    val jostRegular = FontFamily(Font(R.font.jostregular))

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            text = "DREAM",
            fontFamily = jostBold,
            fontSize = 70.sp,
            style = TextStyle(fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
        )
        Text(
            text = "TEAM",
            fontFamily = jostRegular,
            fontSize = 20.sp,
            letterSpacing = 40.sp,
            style = TextStyle(fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
        )

        Spacer(modifier = Modifier.weight(1f))

        StudentButton("Student 1", jostRegular) {
            context.startActivity(Intent(context, StudentOneActivity::class.java))
        }

        StudentButton("Student 2", jostRegular) {
            context.startActivity(Intent(context, StudentTwoActivity::class.java))
        }

        StudentButton("Student 3", jostRegular) {
            context.startActivity(Intent(context, StudentThreeActivity::class.java))
        }

        StudentButton("Student 4", jostRegular) {
            context.startActivity(Intent(context, StudentFourActivity::class.java))
        }

        StudentButton("Student 5", jostRegular) {
            context.startActivity(Intent(context, StudentFiveActivity::class.java))
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
fun StudentButton(
    text: String,
    fontFamily: FontFamily,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .padding(bottom = 12.dp),
        shape = MaterialTheme.shapes.extraLarge,
        border = ButtonDefaults.outlinedButtonBorder.copy(width = 3.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = MaterialTheme.colorScheme.onSurface
        )
    ) {
        Text(
            text = text,
            fontFamily = fontFamily,
            fontSize = 16.sp
        )
    }
}


