public class lacos {
    //Laços//
    //Os laços (também conhecidos como loops) são usados para executar um bloco de código repetidamente
    //enquanto uma condição especificada for verdadeira, ou para percorrer uma sequência de elementos.
    //Os laços mais comuns são "for" (para), "while" (enquanto) e "do-while" (faça-enquanto).

    public static void main(String[] args) {
        //testeWhile();
        //testeWhile2();
        //testeFor();
        //lacosEncadeados();
        //lacos();
        desafio();
    }

    public static void testeWhile() {
        //Laço "while":
        //O laço "while" é utilizado quando a quantidade de iterações não é conhecida de antemão,
        //mas depende de uma condição que deve ser verificada antes de cada iteração.
        //Enquanto a condição for verdadeira, o bloco de código é executado repetidamente.

        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
            //contador = contador + 1;
            //contador += 1;
        }
        System.out.println(contador);
    }

    public static void testeWhile2() {
        int contador = 0;
        int total = 0;

        while (contador <= 100) {
            total += contador;
            //total = total + contador;

            System.out.println(total);
            contador++;
        }

    }

    public static void testeFor() {
        //Laço "for":
        //O laço "for" é utilizado quando se sabe exatamente quantas vezes o bloco de código deve
        //ser executado. Ele possui três partes principais: a inicialização, a condição de continuação
        //e o incremento (ou decremento). A cada iteração, a condição é verificada, e se for verdadeira,
        //o bloco de código é executado. Em seguida, o incremento (ou decremento) é aplicado
        //e o laço continua até que a condição seja falsa.

        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(contador);

        }

    }

    public static void lacosEncadeados() {
        for(int multiplicacao = 1; multiplicacao <= 10; multiplicacao++) {
            for (int contador = 0; contador <= 10; contador++) {
                System.out.print(multiplicacao * contador);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void lacos() {
        for(int linha = 0; linha <= 10; linha++) {
            for (int coluna= 0; coluna <= 10; coluna++) {
                if(coluna > linha)
                    break;
                System.out.print(" * ");
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void desafio() {
                int fatorial = 1;
                for(int numero = 1; numero <= 11; numero++) {
                    fatorial *= numero;
                }
                System.out.println("O fatorial de 10 é: " + fatorial);
            }
}


