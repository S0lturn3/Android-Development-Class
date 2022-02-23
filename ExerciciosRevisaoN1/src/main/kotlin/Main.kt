//region IMPORTS

import java.util.*
import java.util.Arrays
import kotlin.collections.ArrayList

//endregion IMPORTS

//region METHODS
fun maiorMenor(list: IntArray) {
    var largest = list[0]
    for (num in list) {
        if (largest < num) {
            largest = num
        }
    }

    println("- O maior número é: $largest")


    var smallest = list[0]
    for (num in list) {
        if (smallest > num) {
            smallest = num
        }
    }

    println("- O menor número é: $smallest")
}

fun mediaPar(list: IntArray) {
    var mediaPar: Int = 0
    for (i in list) {
        if (i % 2 == 0) {
            mediaPar = list.sum() / 2
        }
    }

    println("- A média dos números pares é: $mediaPar")
}

//endregion METHODS

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    val listArr = mutableListOf<Int>()
    var valor: Int = 1

    while (valor > 0) {
        print("Digite um valor (diferente de 0): ")
        valor = reader.nextInt()

        listArr.add(valor)
    }

    println("\n\n--------------------------------------------------------------------------")
    println("- A lista de números é: $listArr")
    println("- A soma de todos estes valores é: " + listArr.sum())
    println("- A quantidade total de valores digitados é: ${listArr.size}")
    println("- A média de valores é: " + listArr.sum() / 2)
    maiorMenor(listArr.toIntArray())
    mediaPar(listArr.toIntArray())
    println("- A porcentagem dos números ímpares entre todos os números digitados é: ")
    println("--------------------------------------------------------------------------\n\n")

}
