package co.edu.unab.santiagoperez.quizandroidsantiagoperez

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.unab.santiagoperez.quizandroidsantiagoperez.ui.theme.QuizAndroidSantiagoPerezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            ShowPhone()

            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable


fun ShowPhone() {
    Column (
        modifier = Modifier
            .padding(all=30.dp)

    ){
    Box(
        modifier = Modifier
            .background(Color(0xFF90CAF9)) // azul clarito
            .padding(horizontal = 18.dp, vertical = 10.dp)
    ) {
        Text(text = "Encabezado", color = Color.Black, fontSize = 14.sp)
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFA5D6A7)) // verde
            .padding(vertical = 18.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(18.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ItemCuadrito("Item 1", Color(0xFFFFF59D)) // amarillo
            ItemCuadrito("Item 2", Color(0xFFFFCC80)) // naranja
            ItemCuadrito("Item 3", Color(0xFFCE93D8)) // morado
        }
    }
        Box(
            modifier = Modifier
                .background(Color(0xFFEF9A9A)) // rojo/rosado
                .padding(horizontal = 18.dp, vertical = 10.dp)
        ) {
            Text(text = "Pie de página", color = Color.Black, fontSize = 14.sp)
        }

     }
    }








@Composable
private fun ItemCuadrito(texto: String, color: Color) {
    Box(
        modifier = Modifier
            .background(color)
            .padding(horizontal = 18.dp, vertical = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = texto, color = Color.Black, fontSize = 14.sp)
    }
}


