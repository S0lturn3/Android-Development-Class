//region IMPORTS

import java.util.*

//endregion IMPORTS

//region METHODS

//region UNUSED METHODS
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
    val arrayEven = mutableListOf<Int>()
    val arrayOdd = mutableListOf<Int>()

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

fun whenTest(var1: Int) {
    val var3 = var1 % 2

    when(var3) {
        0 -> println("O número é Par")

        1 -> println("O número é Ímpar")
    }
}
//endregion UNUSED METHODS

fun notas(N1: Float, N2: Float) {
    val result : Float = (N1 + N2) / 2

    val presentation: String = "\nO desempenho do aluno foi: "
    val sentence: String = "| Média final: %.2f \n\n\n".format(result)  //  ".format(val) usado em conjunto com "%.2f" arredonda o
                                                                        // valor com pontos flutuantes para apenas duas casas decimais
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

fun isPalindrome(word: String) {
//    Esta variável representa a primeira letra da String
    var f: Int = 0
//    Enquanto esta representa a última letra da String
    var l: Int = word.length - 1
//    Esta variável apenas guarda a confirmação se a palavra é um Palíndromo ou não, será usada no loop
    var isPali: Boolean = true

//    Aqui iniciamos um loop que irá se repetir enquanto o index da última
//    letra (l) for maior que a primeira (f) e a variável isPali for true
    while (isPali && l > f) {

//        SE(a primeira letra da palavra for DIFERENTE da última)
//        Ao final do loop, a primeira letra passa a ser a segunda
//        e a última passa a ser a penúltima (e por aí vai, se
//        baseando no tamanho da String)
        if (word[f++] != word[l--]) {
//            Se as letras forem diferentes, printe uma mensagem de Erro
//            e defina a variável isPali para false
            isPali = false
            println("\n- Não é um Palíndromo!\n\n\n")
        }
    }

    if (isPali) {
//          Agora que o index da "última" letra é igual ao da "primeira" e a variável
//          isPali se tornou false o loop se acaba e printa a mensagem de sucesso!
        isPali = true
        println("\n- É um Palíndromo!\n\n\n")
    }
}

//endregion METHODS

//region MAIN
fun main(args: Array<String>) {
    Locale.setDefault(Locale.US);
    val reader = Scanner(System.`in`)
    var isActive = true

    while (isActive) {
        println("-----------------------------------------------------------------------------------------------------------------------------")
        print(  "1: Para acessar a função de Notas (que imprime o resultado da média de notas de um aluno, usando dois parâmetros de entrada);\n" +
                "2: Para acessar a função de Palíndromos (que imprime se uma palavra ou frase informada é um Palíndromo ou não);\n" +
                "0: Para sair do programa\n\n" +
                "- Digite aqui a opção que deseja acessar: ")

        when (val opcao: Int = reader.nextInt()) {
            1 -> {
                println("----------------------------------------\n")
                print("Digite a primeira nota do aluno (N1): ")
                val n1: Float = reader.nextFloat()
                print("Digite a segunda nota do aluno (N2): ")
                val n2: Float = reader.nextFloat()

                val media = Aluno(n1, n2)
                println(media.messageSelection())
            }

            2 -> {
                println("-------------------------------------------------------------------------\n")
                print("Digite uma palavra ou frase para verificar se ela é um Palíndromo ou não: ")
                val word: String = readLine()!!.lowercase().replace("[^a-zA-Z0-9]".toRegex(), "")
                //  A etapa acima recebe uma string como input, converte tudo para lowercase e substitui
                //  alguns caracteres para fazer a verificação de Palíndromas

                isPalindrome(word)
            }

            0 -> {
                println("\n\nSaindo da aplicação . . .")
                isActive = false
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
}
//endregion MAIN
