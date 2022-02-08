import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    println("Digite o primeiro valor:")
    val value1: Int = Integer.valueOf(readLine())
    println("Digite o segundo valor:")
    val value2: Int = Integer.valueOf(readLine())

    val result = ( value1 + value2 ) / 2

    print("O valor da média é: $result")


    println("Digite o primeiro valor:")
    val value3: Float = reader.nextFloat()
    println("Digite o segundo valor:")
    val value4: Float = reader.nextFloat()

    val resultF = ( value3 + value4 ) / 2

    print("O valor da média é: $resultF")


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html
}

