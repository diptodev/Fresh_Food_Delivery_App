package com.excitedbroltd.freshfood.ui.screens.auth_screen.number_verification

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.excitedbroltd.freshfood.ui.theme.DeepGreen

@Composable
fun EnterCode(navController: NavHostController) {
    val focusManager = LocalFocusManager.current
    var otp1 by remember {
        mutableStateOf("")
    }
    var otp2 by remember {
        mutableStateOf("")
    }
    var otp3 by remember {
        mutableStateOf("")
    }
    var otp4 by remember {
        mutableStateOf("")
    }
    var otp5 by remember {
        mutableStateOf("")
    }
    var otp6 by remember {
        mutableStateOf("")
    }
    LaunchedEffect(key1 = otp1) {
        if (otp1.isNotEmpty()) {
            focusManager.moveFocus(
                focusDirection = FocusDirection.Next
            )
        }
    }
    LaunchedEffect(key1 = otp2) {
        if (otp2.isNotEmpty()) {
            focusManager.moveFocus(
                focusDirection = FocusDirection.Next
            )
        } else {
            focusManager.moveFocus(
                focusDirection = FocusDirection.Previous
            )
        }
    }
    LaunchedEffect(key1 = otp3) {
        if (otp3.isNotEmpty()) {
            focusManager.moveFocus(
                focusDirection = FocusDirection.Next
            )
        } else {
            focusManager.moveFocus(
                focusDirection = FocusDirection.Previous
            )
        }
    }
    LaunchedEffect(key1 = otp4) {
        if (otp4.isNotEmpty()) {
            focusManager.moveFocus(
                focusDirection = FocusDirection.Next
            )
        } else {
            focusManager.moveFocus(
                focusDirection = FocusDirection.Previous
            )
        }
    }
    LaunchedEffect(key1 = otp5) {
        if (otp5.isNotEmpty()) {
            focusManager.moveFocus(
                focusDirection = FocusDirection.Next
            )
        } else {
            focusManager.moveFocus(
                focusDirection = FocusDirection.Previous
            )
        }
    }
    LaunchedEffect(key1 = otp6) {
        if (otp6.isEmpty()) {
            focusManager.moveFocus(
                focusDirection = FocusDirection.Previous
            )
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "Verify your Number",
            style = MaterialTheme.typography.titleMedium,
            fontSize = 25.sp,
            modifier = Modifier.padding(top = 80.dp)
        )

        Text(text = "Enter your otp ", color = Color.Gray)

        Column(
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                OutlinedTextField(
                    modifier = Modifier
                        .width(50.dp)
                        .padding(2.dp),
                    value = "$otp1",
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,

                    ),
                    onValueChange = {
                        if (it.length < 2) {
                            otp1 = it
                        }
                    })
                OutlinedTextField(
                    modifier = Modifier
                        .width(50.dp)
                        .padding(2.dp),
                    value = "$otp2",
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,

                    ),
                    onValueChange = {
                        if (it.length < 2) {
                            otp2 = it
                        }
                    })
                OutlinedTextField(
                    modifier = Modifier
                        .width(50.dp)
                        .padding(2.dp),
                    value = "$otp3",
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,

                    ),
                    onValueChange = {
                        if (it.length < 2) {
                            otp3 = it
                        }
                    })
                OutlinedTextField(
                    modifier = Modifier
                        .width(50.dp)
                        .padding(2.dp),
                    value = "$otp4",
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,

                    ),
                    onValueChange = {
                        if (it.length < 2) {
                            otp4 = it
                        }
                    })
                OutlinedTextField(
                    modifier = Modifier
                        .width(50.dp)
                        .padding(2.dp),
                    value = "$otp5",
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,

                    ),
                    onValueChange = {
                        if (it.length < 2) {
                            otp5 = it
                        }
                    })
                OutlinedTextField(
                    modifier = Modifier
                        .width(50.dp)
                        .padding(2.dp),
                    value = "$otp6",
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,

                    ),
                    onValueChange = {
                        if (it.length < 2) {
                            otp6 = it
                        }
                    })

            }
            Box(
                Modifier
                    .padding(top = 10.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .clickable {

                    }
                    .background(DeepGreen)
                    .fillMaxWidth()
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Verify",
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.White
                )
            }
        }

    }
}