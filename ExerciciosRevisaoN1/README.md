## Atividades de revisão para Prova (24/02)

### EXERCÍCIO 1:
Faça um programa que, dado dois valores quaisquer 
que representação a nota de um aluno e outro valor 
que representa a quantidade de faltas, faça:

- Cálculo da média;
- Mostre o GPA do aluno ( <br>
		M >= 6 -> C <br>
		M >= 7.5 -> B <br>
		M >= 9 -> A <br>
		M <= 6 -> D <br>
		faltas < 75% -> FF <br>
	)

### RESOLUÇÃO:
    n1 = input(Float)
    n2 = input(Float)
    pr_totais = 50
    faltas = input(Int)

    faltas_por = (pr_totais - faltas)/(faltas_por * 100)

    SE (faltas < 75% OU media == 0){
       Mostre("O GPA do aluno foi: FF")
    }
    SENÃO SE (media >= 9){
       Mostre("O GPA do aluno foi: A")
    }
    SENÃO SE (media >= 7.5){
       Mostre("O GPA do aluno foi: B")
    }
    SENÃO SE (media >= 6){
       Mostre("O GPA do aluno foi: C")
    }
    SENÃO {
       Mostre("O GPA do aluno foi: D")
    }


    função notaMedia(n1, n2): retorna um Float {
       media = (n1 + n2) / 2

       return media
    }



### EXERCÍCIO 2:
Faça um programa que, dado um intervalo de numeros
entre 0 à 100, guarde todos os valores pares numa 
lista e ao fim imprima eles.

### RESOLUÇÃO:
    [...]



### EXERCÍCIO 3:
Dado uma palavra, determine se ela é palindroma ou não

### RESOLUÇÃO:
    palavra = input(String)
       (OBS: Aqui é feita uma formatação na variável para formatá-la 
       para que seja composta apenas por caracteres de letras e 
       números, ignorando pontuações e caracteres especiais)


    função éPalindroma(palavra) {
       pLetra = 0				// Primeira letra da palavra/exressão
       uLetra = palavra.tamanho - 1		// Última letra da palavra/expressão
       éPali = VERDADEIRO			// Booleano para afzer a verificação no PARA (FOR)

       ENQUANTO (éPali == VERDADEIRO E uLetra > pLetra) {
          SE (palavra[pLetra++] != palavra[uLetra--]) {
             éPali = FALSO
       Mostre("A expressão não é um palíndromo.")
          }
       }

       SE (éPali == VERDADEIRO) {
          Mostre("A expressão é um palíndromo")
       }
    }



### EXERCÍCIO 4:
Tendo base o que já foi visto em aula, faça um programa 
que permita o usuario escolher entre: calcular uma média 
e ver se uma palavra é palindroma.

    OBS. 1: A escolha de qual fluxo irá executar, tem que ser 
    feita através de um input, assim como a palavra e os 
    valores para o cálculo da média;

    OBS. 2: O programa deve continuar rodando até que uma 
    opção de Sair seja passada como input.

Ex: <br>
Op 1 -> calcula a media <br>
Op 2 -> verifica se é palindroma <br>
Op 3 -> sair? <br>


### RESOLUÇÃO:
    isAtivo = VERDADEIRO
    ENQUANTO (isActive == VERDADEIRO) {	// Vai se manter rodando enquanto a variável 'isActive' for VERDADEIRA

       opção = Input(Int)
       QUANDO (opção) {
          1 -> RESOLUÇÃO(Exercício 1)

          2 -> RESOLUÇÃO(Exercício 3)

          0 -> SAIR
               isActive = FALSO

          SENÃO -> Mostre("Você digitou uma opção inválida!")
       }

    }
