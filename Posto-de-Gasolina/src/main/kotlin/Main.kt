//region IMPORTS

import java.util.*

//endregion IMPORTS

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Digite o nome do Funcionário: ")
    val name: String? = readLine()

    print("Digite a idade do Funcionário: ")
    val idade: Int = reader.nextInt()

    print("Digite agora, quantos clientes passaram no posto no mês: ")
    val clientes: Float = reader.nextFloat()

    val func = Funcionario(name, idade)
    func.calcBonus(clientes)
}