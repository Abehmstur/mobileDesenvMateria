package br.ufrn.imd.imdmarket.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.ufrn.imd.imdmarket.R
import br.ufrn.imd.imdmarket.ui.theme.IMDMarketTheme

@Composable
fun TelaLogin() {
    Column  {
        Row(
            Modifier
                .height(60.dp)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.amareloForte)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "IMDMARKET",
                style = MaterialTheme.typography.titleLarge,
                color = colorResource(id = R.color.white),
            )
        }

        Spacer(modifier = Modifier.size(16.dp))

        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp),
            ) {
                Text(
                    text = "Login:",
                    style = MaterialTheme.typography.headlineLarge
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "Usuário")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = colorResource(id = R.color.amareloForte),
                        unfocusedLabelColor = colorResource(id = R.color.cinzafraco),
                    )

                )
                Text(
                    text = "Senha:",
                    style = MaterialTheme.typography.headlineLarge
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "Senha")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = colorResource(id = R.color.amareloForte),
                        unfocusedLabelColor = colorResource(id = R.color.cinzafraco),
                    )
                )
                Button(
                    onClick = {
                    },
                    colors = ButtonDefaults.buttonColors(
                        colorResource(id = R.color.azul)
                    ),
                    modifier = Modifier
                        .width(200.dp)
                        .height(45.dp),
                ) {
                    Text(
                        text = "Entrar",
                        style = TextStyle(
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                Text(
                    text = "Esqueci minha senha/login",
                    style = MaterialTheme.typography.bodySmall,
                    color = colorResource(id = R.color.azul)

                )
            }
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun TelaLoginPreview() {
//    IMDMarketTheme {
//        TelaLogin()
//    }
//}