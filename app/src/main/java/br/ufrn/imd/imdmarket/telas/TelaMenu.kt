package br.ufrn.imd.imdmarket.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.ufrn.imd.imdmarket.R
import br.ufrn.imd.imdmarket.navegacao.Rotas

@Composable
fun TelaMenu(navController: NavController) {
    Column {
        Row(
            Modifier
                .height(60.dp)
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


        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                modifier = Modifier.padding(top = 50.dp),
                text = "O que deseja fazer?",
                color = colorResource(id = R.color.black),
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 70.dp, end = 70.dp, top = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {
                        navController.navigate(Rotas.TCADASTRO)
                    },
                    colors = ButtonDefaults.buttonColors(
                        colorResource(id = R.color.azul
                    ),
                ),
                    modifier = Modifier
                        .size(110.dp, 60.dp)
                        .background(
                            color = colorResource(id = R.color.azul)
                        )
                ) {
                    Text(
                        text = "Cadastrar\nProduto",
                        textAlign = TextAlign.Center
                    )
                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        colorResource(id = R.color.azul)
                    ),
                    modifier = Modifier
                        .size(110.dp, 60.dp)
                        .background(
                            color = colorResource(id = R.color.azul)
                        )
                ) {
                    Text(
                        text = "Listar\nProdutos",
                        textAlign = TextAlign.Center
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 70.dp, end = 70.dp, top = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {
                        navController.navigate(Rotas.TALTERACAO)
                    },
                    colors = ButtonDefaults.buttonColors(
                        colorResource(id = R.color.azul)
                    ),
                    modifier = Modifier
                        .size(110.dp, 60.dp)
                        .background(
                            color = colorResource(id = R.color.azul)
                        )
                ) {
                    Text(
                        text = "Alterar\nProduto",
                        textAlign = TextAlign.Center
                    )
                }
                Button(
                    onClick = {
                        navController.navigate(Rotas.TEXCLUSAO)
                    },
                    colors = ButtonDefaults.buttonColors(
                        colorResource(id = R.color.azul)
                    ),
                    modifier = Modifier
                        .size(110.dp, 60.dp)
                        .background(
                            color = colorResource(id = R.color.azul)
                        )
                ) {
                    Text(
                        text = "Deletar\nProduto",
                        textAlign = TextAlign.Center
                    )
                }
            }
            Column(
                Modifier
                .padding(top = 100.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "Imagem ilustiva da loaja.",
                    modifier = Modifier
                        .size(100.dp)
                )
            }
        }
    }
}