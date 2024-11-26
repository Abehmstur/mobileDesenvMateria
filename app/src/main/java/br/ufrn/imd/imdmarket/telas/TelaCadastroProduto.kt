package br.ufrn.imd.imdmarket.telas

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.ufrn.imd.imdmarket.R

@Composable
fun TelaCadastro(
    navController: NavController
){
    var codigoProduto by remember { mutableStateOf("") }
    var nomeProduto by remember { mutableStateOf("") }
    var descricaoProduto by remember { mutableStateOf("") }
    var estoqueProduto by remember { mutableStateOf("") }
    val msg = LocalContext.current

    fun verificaNull(){
        if(codigoProduto.isEmpty() || nomeProduto.isEmpty() || descricaoProduto.isEmpty() || estoqueProduto.isEmpty()){
            Toast.makeText(msg, "Todos os itens são de preenchimento obrigatório!", Toast.LENGTH_SHORT).show()
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
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

        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "CADASTRAR PRODUTO",
            color = colorResource(id = R.color.azul),
            style = MaterialTheme.typography.titleLarge
        )

        TextField(
            value = codigoProduto,
            onValueChange = { codigoProduto = it },
            label = {
                Text("Código do Produto:")
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = colorResource(id = R.color.amarelo),
                unfocusedLabelColor = colorResource(id = R.color.cinzafraco),
            )
            ,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
        )
        TextField(
            value = nomeProduto,
            onValueChange = { nomeProduto = it },
            label = {
                Text("Nome do Produto:")
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = colorResource(id = R.color.amarelo),
                unfocusedLabelColor = colorResource(id = R.color.cinzafraco),
            )
        )
        TextField(
            value = descricaoProduto,
            onValueChange = { descricaoProduto = it },
            label = {
                Text("Descrição do Produto:")
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = colorResource(id = R.color.amarelo),
                unfocusedLabelColor = colorResource(id = R.color.cinzafraco),
            ),
            maxLines = 5
        )
        TextField(
            value = estoqueProduto,
            onValueChange = { estoqueProduto = it },
            label = {
                Text("Estoque:")
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = colorResource(id = R.color.amarelo),
                unfocusedLabelColor = colorResource(id = R.color.cinzafraco),
            )
            ,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    verificaNull()
                },
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.azul)
                ),
                modifier = Modifier
                    .size(100.dp, 40.dp)
                    .background(
                        color = colorResource(id = R.color.azul)
                    )
            ) {
                Text(
                    text = "Salvar",
                    textAlign = TextAlign.Center
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.azul)
                ),
                modifier = Modifier
                    .size(100.dp, 40.dp)
                    .background(
                        color = colorResource(id = R.color.azul)
                    )
            ) {
                Text(
                    text = "Limpar",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}