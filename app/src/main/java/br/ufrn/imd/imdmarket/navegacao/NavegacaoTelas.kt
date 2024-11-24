package br.ufrn.imd.imdmarket.navegacao

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import br.ufrn.imd.imdmarket.telas.TelaLogin
import androidx.navigation.compose.composable
import br.ufrn.imd.imdmarket.telas.TelaAlteracao
import br.ufrn.imd.imdmarket.telas.TelaCadastro
import br.ufrn.imd.imdmarket.telas.TelaExclusao
import br.ufrn.imd.imdmarket.telas.TelaMenu

object Rotas {
    const val TLOGIN = "tela_login"
    const val TMENU = "tela_menu"
    const val TCADASTRO = "tela_cadastro"
    const val TALTERACAO = "tela_alteracao"
    const val TEXCLUSAO = "tela_exclusao"
    const val TLISTAGEM = "tela_listagem"
}

@Composable
fun NavegacaoTelas(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController()){
    NavHost(
        navController = navController,
        startDestination = Rotas.TLOGIN,
    ) {
        composable(Rotas.TLOGIN){
            TelaLogin(modifier, navController = navController)
        }
        composable(Rotas.TMENU){
            TelaMenu(navController = navController)
        }
        composable(Rotas.TCADASTRO){
            TelaCadastro(navController = navController)
        }
        composable(Rotas.TALTERACAO){
            TelaAlteracao(navController = navController)
        }
        composable(Rotas.TEXCLUSAO){
            TelaExclusao(navController = navController)
        }
    }

}

