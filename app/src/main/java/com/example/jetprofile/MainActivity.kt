package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TabRowDefaults.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.cat),
                            contentDescription = "プロフィール画像",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(30.dp))
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = "test user",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(text = "職業: SE", color = Color.Gray, fontSize = 16.sp)
                        Spacer(modifier = Modifier.height(20.dp))

                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                                Text(
                                    text = "google",
                                    fontSize = 26.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "DXカンパニーテクノロジーグループ",
                                    color = Color.Gray,
                                    fontSize = 16.sp,
                                )
                            Spacer(modifier = Modifier.height(20.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.Email,
                                    contentDescription = "email",
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(text = "Email", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "example@gmail.com", fontSize = 16.sp)
                            Spacer(modifier = Modifier.height(5.dp))

                            Divider(
                                modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
                                thickness = 2.dp,
                            )
                        }
                    }
                }
            }
        }
    }
}