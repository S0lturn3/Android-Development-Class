
public class Aluno(n1: Float, n2: Float) {
    private val result : Float = (n1 + n2) / 2
    private var performance: String = ""

    private val presentation: String = "\nO desempenho do aluno foi: "
    private val sentence: String = "| Média final: %.2f \n\n\n".format(result)  //  ".format(val) usado em conjunto com "%.2f" arredonda o
                                                                                // valor com pontos flutuantes para apenas duas casas decimais

    public fun messageSelection(): String {
        performance = if(result >= 9){ "$presentation\n 'A' $sentence" }
                      else if(result >= 7.5) { "$presentation\n 'A' $sentence" }
                      else if(result >= 6) { "$presentation\n 'A' $sentence" }
                      else { "$presentation\n 'D' $sentence" }

        return performance
    }
}

