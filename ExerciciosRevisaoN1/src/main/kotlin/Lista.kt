//region IMPORTS

import java.util.*
import java.util.Arrays
import kotlin.collections.ArrayList

//endregion IMPORTS


class Lista {
    val reader = Scanner(System.`in`)
    val listArr = mutableListOf<Int>()

    var valor: Int = reader.nextInt()

    var largest = listArr[0]


    /**
     * ## Atividade 5
     *  Faça um programa que receba vários números (preferencialmente mais que 5), calcule-os e mostre:
     *
     *      1. A soma dos números digitados;
     *      2. A quantidade de números digitados;
     *      3. A média dos números digitados;
     *      4. O maior número digitado;
     *      5. O menor número digitado;
     *      6. A média dos números pares;
     *      7. A porcentagem dos números ímpares entre todos os números digitados;
     */
    fun exerc5(num: Int) {
        val reader = Scanner(System.`in`)

        val listArr = mutableListOf<Int>()
        var valor = num

        while (valor != 0) {
            print("Digite um valor (diferente de 0): ")
            valor = reader.nextInt()

            listArr.add(valor)
        }

        println("Lista: $listArr")
        for (num in listArr) {
            if (largest < num) {
                largest = num
            }
        }

        println("\nLargest element = $largest")


        println("Array: $listArr")
        println("Tamanho do array: ${listArr.size}")
        println("A soma dos valores: $listArr.sum()")
    }
}