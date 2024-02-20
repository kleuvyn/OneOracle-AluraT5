public class Valores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

//        conta.setAgencia(-50);
//        conta.setNumero(-330);

        System.out.println("Agencia: " + conta.getAgencia() +  " \nConta: " + conta.getNumero() + "\n");

        conta.setAgencia(1232123);
        Conta conta02 = new Conta(1337, 16549);
        Conta conta03 = new Conta(2112, 14660);

        System.out.println(Conta.getTotal());
    }
}
