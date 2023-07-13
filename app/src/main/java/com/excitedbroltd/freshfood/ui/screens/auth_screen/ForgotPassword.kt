package com.excitedbroltd.freshfood.ui.screens.auth_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.excitedbroltd.freshfood.R
import com.excitedbroltd.freshfood.ui.theme.DeepGreen


@Composable
@Preview(showBackground = true)
fun ForgotPassword() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "Forgot password",
            style = MaterialTheme.typography.titleMedium,
            fontSize = 25.sp,
            modifier = Modifier.padding(top = 80.dp)
        )
        Column() {
            Text(text = "Enter your email and will send you", color = Color.Gray)
            Text(text = "instructions on how to reset it", color = Color.Gray)


        }

        Column(
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        ) {

            TextField(
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .shadow(
                        elevation = 2.dp,
                        ambientColor = Color.Black.copy(alpha = 0.5f),
                        spotColor = Color.Black.copy(alpha = 0.5f),
                        clip = true,
                        shape = RoundedCornerShape(30.dp)
                    ),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    focusedLabelColor = Color.Transparent,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    disabledContainerColor = Color.White
                ),
                enabled = true,
                isError = false,
                value = "",
                maxLines = 1,
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_email),
                        contentDescription = "Icon phone",
                        Modifier.size(20.dp)
                    )
                },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                label = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,

                        ) {
                        Text(
                            text = "Email address",
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                },
                onValueChange = {

                })
            Box(
                Modifier

                    .clip(RoundedCornerShape(40.dp))
                    .clickable {

                    }
                    .background(DeepGreen)
                    .fillMaxWidth()
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Send link",
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.White
                )
            }
        }

    }
}