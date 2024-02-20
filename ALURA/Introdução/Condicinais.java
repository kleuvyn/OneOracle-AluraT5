public class Condicinais {
    public static void main(String[] args) {
        //O operador condicional é do tipo ternário, pois envolve três operandos.
        //Operador ternário Exemplo prático if/else A estrutura condicional if/else
        //permite ao programa avaliar uma expressão como sendo verdadeira ou falsa e,
        //de acordo com o resultado dessa verificação, executar uma ou outra rotina.

        System.out.println("Teste de condicional\n ");
        System.out.println("!!!AVISO!!! \nMenores de 18 anos só podem entrar acompanhado como um responsavel!\n");

        int idade = 28;
        int acompanhadoPessoa = 3;
        boolean acompanhado = acompanhadoPessoa >=2;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos!");

        } else if (acompanhadoPessoa >= 2) {
            System.out.println("Vocês podem entrar!");

        } else {
            System.out.println("Infeizmente você não pode entrar!\n");
        }

        // || = ou//
        //Uma proposição disjuntiva só terá seu valor falso se ambas as afirmativas forem falsas.
        //De outro modo será considerada verdadeira. Na proposição acima ou eu irei a um lugar ou irei a outro,
        //mesmo não indo a um desses lugares eu posso ir ao outro, só não posso deixar de ir a um deles!


        if (idade >= 18 || acompanhadoPessoa >= 2) {
            System.out.println("\nSejam Bem-Vindos!");
        } else {
            System.out.println("Infeizmente você não pode entrar!");
        }

        //&& = e//
        //Uma proposição conjuntiva só terá seu valor verdadeiro se ambas as afirmativas forem verdadeiras, logo,
        //nessa proposição composta acima ambos têm de desempenhar tais funções para haver um valor lógico verdadeiro.
        if (idade >= 18 && acompanhadoPessoa >= 2) {
            System.out.println("\nSejam Bem-Vindos!");
        } else {
            System.out.println("Infeizmente você não pode entrar!");
        }

        if (idade >= 18 && acompanhado) {
            System.out.println("\nSejam Bem-Vindos!");
        } else {
            System.out.println("Infeizmente você não pode entrar!");
        }
        System.out.println("Condicionais:\n" +
                "As estruturas condicionais são usadas para tomar decisões com base em determinadas condições.\n"+
                "Os condicionais mais comuns são \"if\" (se) e \"else\" (senão), e podem ser estendidos usando \"else if\" (senão, se).\n"+
                "A ideia básica é que o programa execute um bloco de código apenas se uma condição especificada for verdadeira.\n");
        System.out.println("Operador \"E\" (AND):\n"+
                "O operador \"E\" é representado pelos símbolos && ou AND.\n"+
                "Ele retorna verdadeiro somente quando todas as condições envolvidas são verdadeiras.\n"+
                "\nOperador \"OU\" (OR):\n"+
                "O operador \"OU\" é representado pelos símbolos || ou OR.\n"+
                "Ele retorna verdadeiro se pelo menos uma das condições envolvidas for verdadeira.\n"+
                "\nOperador \"NÃO\" (NOT):\n"+
                "O operador \"NÃO\" é representado pelo símbolo ! ou NOT.\n"+
                "Ele inverte o valor de uma condição, retornando verdadeiro se a condição for falsa e vice-versa.");
    }
}

