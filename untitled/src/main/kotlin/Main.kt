import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    //  Utilizando Int
    /*
    println("Digite o primeiro valor:")
    val value1I: Int = Integer.valueOf(readLine())
    println("Digite o segundo valor:")
    val value2I: Int = Integer.valueOf(readLine())

    val resultI = ( value1I + value2I ) / 2

    print("O valor da média é: $resultI")

    //  Utilizando Float
    println("Digite o primeiro valor:")
    val value1F: Float = reader.nextFloat()
    println("Digite o segundo valor:")
    val value2F: Float = reader.nextFloat()

    val resultF = ( value1F + value2F ) / 2

    print("O valor da média é: $resultF")
    */


    //  Utilizando Double
    /*println("Digite a quantidade de faltas do aluno: ")
    val faltas: Double = reader.nextDouble()
    val aulas: Int = 33;
    val presenca: Double = (25.0 / 100.0) * aulas

    if (faltas <= presenca) {

        println("Digite a primeira nota: ")
        val value1D: Double = reader.nextDouble()
        println("Digite a segunda nota: ")
        val value2D: Double = reader.nextDouble()

        val resultD = ( value1D + value2D ) / 2

        if (resultD >= 9) {
            println("A nota do aluno foi 'A' e sua média foi $resultD. O aluno está aprovado!")
        }
        else if (resultD >= 7.5) {
            println("A nota do aluno foi 'B' e sua média foi $resultD. O aluno está aprovado!")
        }
        else if (resultD >= 6) {
            println("A nota do aluno foi 'C' e sua média foi $resultD. O aluno está aprovado!")
        }
        else if (resultD < 6) {
            println("A nota do aluno foi 'D' e sua média foi $resultD. O aluno está reprovado!")
        }
    } else {
        println("A nota do aluno foi 'FF'. O aluno está reprovado por Faltas!")
    }
    */


    //  Utilizando Long
    /*
    println("Digite o primeiro valor:")
    val value1L: Long = reader.nextLong()
    println("Digite o segundo valor:")
    val value2L: Long = reader.nextLong()

    val resultL = ( value1L + value2L ) / 2

    print("O valor da média é: $resultL")
     */



    for (M in 0..59) {
        for (S in 0..59) {
            if (S < 59) {
                //S += 1
            } else {
                //M += 1
                //S = 0
            }
        }
    }

}

