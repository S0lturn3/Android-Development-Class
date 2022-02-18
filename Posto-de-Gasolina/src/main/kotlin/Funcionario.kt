//region IMPORTS

import java.util.*
import java.math.*
import kotlin.math.roundToInt

//endregion IMPORTS

/**
 * ## Classe do Funcionário
 *
 * Serão armazenados seus dados (Nome, Idade e Salário) e será feito um cálculo, onde a cada 10 clientes que passarem
 * no Posto, ele receberá um bônus de +10% do seu salário
 *
 * Ao final, mostrar seus dados e o salário final pós cálculo
 *
 * */
class Funcionario(nome: String?, idade: Int) {
    private val sal: Float = 1212F
    private var salFinal: Float = 0F

//    Aqui será calculado o bônus
    fun calcBonus(clientesTotais: Float) {
        var bonus: Float = 0.1F * sal

        //  Aqui, verificamos se o número de clientes é maior ou igual a 10,
        //  caso contrário, o bônus não é calculado, pois não será usado este cálculo
        if (clientesTotais >= 10) {
            var clientesDezenas: Float = clientesTotais / 10
            var clientesInteiros: Int = clientesDezenas.toInt()

            while (clientesInteiros > 0) {
                bonus += bonus
                salFinal = sal + bonus
                clientesInteiros--
            }

            println("\nNeste mês houve um bônus de +R$ %.2f".format(bonus))
        }

        println("\nNão houve bônus neste mês, o salário do funcionário foi: R$ %.2f".format(salFinal))

    }
}
