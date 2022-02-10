//region IMPORTS

import sun.applet.Main
import java.util.Scanner

//endregion IMPORTS

//region METHODS

fun pares() {
    println("=========================================================")
    println("---------------------------------------------------------")
    println("=========================================================")

    println("Aqui estão os valores pares dentro do conjunto informado:\n")

    for (A in 1..100) {
        if(A % 2 == 0) {
            println("- $A")
        }
    }
    println("------\n")
}

fun paresArray() {
    val arrayEven = arrayListOf<Int>()
    val arrayOdd = arrayListOf<Int>()

    for (A in 0..16) {
        if(A % 2 == 0) {
            arrayEven.add(A)
        }
        else {
            arrayOdd.add(A)
        }
    }

    println("\n\nA lista de valores pares:")
    println(arrayEven)

    println("\nA lista de valores ímpares:")
    println(arrayOdd)
}

fun notas(N1: Float, N2: Float) {

    val result : Float = (N1 + N2)/2
    val sentence: String = "| Média final: $result"
    val presentation: String = "\nO desempenho do aluno foi:"

    if(result >= 9)
        println(presentation +
                "\n'A' $sentence")

    else if(result >= 7.5)
        println(presentation +
                "\n'A' $sentence")

    else if(result >= 6)
        println(presentation +
                "\n'A' $sentence")

    else
        println(presentation +
                "\n'D' $sentence")
}

fun whenTest(var1: Int) {
    val var3 = var1 % 2

    when(var3) {
        0 -> println("O número é Par")

        1 -> println("O número é Ímpar")
    }
}

//endregion METHODS

//region MAIN
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var isActive = true

    print(  "\n1: Para acessar a função de Pares (que imprime todos os valores pares de um conjunto predeterminado);\n" +
            "2: Para acessar a função de Notas (que imprime o resultado de notas de um aluno, utilizando dois parâmetros de entrada);\n" +
            "3: Para acessar a função de Pares em Lista (que imprime todos os valores pares e ímpares em dois ArrayLists separados)\n" +
            "Digite a opção que deseja acessar: ")

    when (val opcao: Int = reader.nextInt()) {
        1 -> {
            pares()
            main(args)
        }

        2 -> {
            println("=========================================================")
            println("---------------------------------------------------------")
            println("=========================================================")
            print("Digite a primeira nota do aluno (N1): ")
            val N1: Float = reader.nextFloat()
            print("Digite a segunda nota do aluno (N2): ")
            val N2: Float = reader.nextFloat()

            notas(N1, N2)
        }

        3 -> {
            paresArray()
        }

        else -> {
            println("\n\n\n-----------------------------------------------")
            println(
                "O valor informado ($opcao) não é uma opção válida!\n" +
                        "Tente novamente"
            )
            println("-----------------------------------------------\n\n")

            main(args)
        }
    }
}
//endregion MAIN

