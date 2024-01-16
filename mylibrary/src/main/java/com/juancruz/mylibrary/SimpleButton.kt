package com.juancruz.mylibrary

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun SimpleButton(
    text:String,
    containerColor:Color = Color.White,
    contentColor:Color= Color.Black,
    onClick:() -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        onClick = { onClick() }) {
        Text(text = text)
    }

}