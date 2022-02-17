/**
 * ## Classe relacionada ao Aluno
 *
 *  - Contém a função de `Cálculo de Desempenho Escolar` (possivelmente no futuro tendo outras funções);
 *  - Atributos de `Notas` e `Média` e futuramente possuirá outros atributos, como "Nome", "Idade", "E-mail", etc.
 *
 * */
public class Aluno(n1: Float, n2: Float) {
    private val result: Float = (n1 + n2) / 2
    private var gradeLetter: Char = 'A'

    public fun messageSelection(): String {
        gradeLetter = if (result >= 7.5) { 'B' }
                      else if (result >= 6) { 'C' }
                      else { 'D' }

        return ("\n-= DESEMPENHO DO ALUNO =- \n" +
                "$gradeLetter | Média final: %.2f \n\n\n").format(result)
        //  ".format(variável) usado em conjunto com "%.2f" arredonda o valor com pontos flutuantes
        //  para apenas duas casas decimais
    }
}
