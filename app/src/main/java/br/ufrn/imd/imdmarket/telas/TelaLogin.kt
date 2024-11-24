package br.ufrn.imd.imdmarket.telas

import android.widget.Toast
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
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.ufrn.imd.imdmarket.R
import br.ufrn.imd.imdmarket.navegacao.Rotas
import br.ufrn.imd.imdmarket.ui.theme.IMDMarketTheme

@Composable
fun TelaLogin(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var usuario by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var mensagem by remember { mutableStateOf("") }
    val msg = LocalContext.current

    fun logar() {
        if (usuario == "admin" && senha == "admin") {
            navController.navigate(Rotas.TMENU)
            Toast.makeText(msg, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(msg, "Usuário ou senha incorreto!", Toast.LENGTH_SHORT).show()
        }
    }

    fun resetarSenha() {
        senha = "senha123"
        mensagem = "Sua senha foi redefinida para 'senha123'."
    }

    Column  {
        Row(
            modifier.height(60.dp)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.amareloForte)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.app_name),
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
                    value = usuario,
                    onValueChange = {usuario = it },
                    label = {
                        Text(text = "Usuário")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = colorResource(id = R.color.amarelo),
                        unfocusedLabelColor = colorResource(id = R.color.cinzafraco),
                    )
                )
                Text(
                    text = "Senha:",
                    style = MaterialTheme.typography.headlineLarge
                )
                TextField(
                    value = senha,
                    onValueChange = {senha = it },
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
                        logar()
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
                TextButton(
                    onClick = {
                        resetarSenha()
                    }
                ) {
                    Text(
                        text = "Esqueci minha senha/login",
                        style = MaterialTheme.typography.bodySmall,
                        color = colorResource(id = R.color.azul)
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = mensagem, color = MaterialTheme.colorScheme.scrim)
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun prev(
//){
//    IMDMarketTheme {
//        TelaLogin()
//    }
//}