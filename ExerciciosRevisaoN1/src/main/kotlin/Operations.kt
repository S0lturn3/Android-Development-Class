
public class Operations {

    //region METHODS
    /**
     * ## Atividade 1
     * Crie um programa que seja capaz de verificar se um número digitado (num) é ímpar ou par.
     */
    fun parImpar(num: Int) {

        if(num % 2 == 0) {
            println("\n- O número ($num) é par.\n\n")
        } else {
            println("\n- O número ($num) é ímpar.\n\n")
        }
    }

    /**
     * ## Atividade 2
     *  Imagine que você esteja criando um sistema para uma faculdade e a mesma solicitou uma
     *  funcionalidade para a classificação das notas de seus alunos em conceitos, sendo que as
     *  regras descritas devem ser atendidas:
     *
     *      1. Alunos com notas iguais a 10, recebem o conceito A;
     *      2. Alunos com notas maiores ou iguais a 9, recebem o conceito B;
     *      3. Alunos com notas maiores ou iguais a 6, recebem o conceito C;
     *      4. Alunos com notas maiores ou iguais a 3, recebem o conceito D;
     *      5. Alunos com notas maiores ou iguais a 0, recebem o conceito E;
     */
    fun notasAlunos(n1: Float, n2: Float) {
        val result : Float = (n1 + n2) / 2

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

    /**
     * ## Atividade 3
     * Imagine que você esteja criando um sistema para uma casa de show e a mesma solicitou
     * uma funcionalidade para a liberação da entrada de cliente no estabelecimento, sendo
     * que as regras descritas devem ser atendidas:
     *
     *      1. Somente maiores de idade podem entrar sem acompanhante;
     *      2. Jovens que tiverem 16 anos ou mais, só podem entrar acompanhados de um adulto;
     *      3. Jovens que tiverem menos de 16, não podem acessar o estabelecimento.
     */
    fun entradaShow() { }

    /**
     * ## Atividade 4
     *  Imagine que você tenha sido contratado por uma empresa para criar um sistema de bonificação
     *  para os seus funcionários. As bonificações devem seguir os seguintes critérios:
     *
     *      1. Funcionários com mais de 10 anos de empresa e que não tiverem tirado férias nos últimos 12 meses recebem 10% de bônus;
     *      2. Funcionários com mais de 7 anos de empresa e que não tiverem tirado férias nos últimos 12 meses recebem 7% de bônus;
     *      3. Funcionários com mais de 3 anos de empresa e que não tiverem tirado férias nos últimos 6 meses recebem 5% de bônus;
     *      4. Os demais funcionários não recebem bonificação.
     */
    fun bonificacao() {}

    //endregion METHODS

}