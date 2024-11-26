package br.ufrn.imd.imdmarket.telas

import androidx.compose.ui.tooling.preview.Preview
import br.ufrn.imd.imdmarket.ui.theme.IMDMarketTheme
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
import br.ufrn.imd.imdmarket.navegacao.Rotas

@Composable
fun TelaExclusao(navController: NavController){
    var codigoProduto by remember { mutableStateOf("") }
    val msg = LocalContext.current

    fun verificaNull(){
        if(codigoProduto.isEmpty()){
            Toast.makeText(msg, "O campo é obrigatório!", Toast.LENGTH_SHORT).show()
        }
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
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
            text = "DELETAR PRODUTO",
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

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    navController.navigate(Rotas.TMENU)
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
                    text = "Deletar",
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

//@Preview(showBackground = true)
//@Composable
//fun prev(){
//    IMDMarketTheme {
//        TelaExclusao()
//    }
//}