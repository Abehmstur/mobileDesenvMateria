package br.ufrn.imd.imdmarket.telas


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.ufrn.imd.imdmarket.R

@Composable
fun TelaListagem(
    navController: NavController
){
    val msg = LocalContext.current

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
            text = "Listar Produtos",
            color = colorResource(id = R.color.azul),
            style = MaterialTheme.typography.titleLarge
        )

        Column (
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

//            LazyColumn {
//                var lista = arrayOf("s","a","b")
//                items(lista){ item->
//                    Text(
//                        text = item,
//                        modifier = Modifier.padding(8.dp)
//                            .clickable {
//                                Toast.makeText(msg,"Teste",Toast.LENGTH_SHORT)
//                            }
//                    )
//                }
//            }

            Button(
                onClick = {

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
                    text = "Listar",
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
//        TelaListagem()
//    }
//}