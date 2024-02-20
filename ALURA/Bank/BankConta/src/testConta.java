public class testConta  {
    public static void main(String[] args) {

        ContaCorrente contaC = new ContaCorrente(111, 111);
        contaC.depositar(100.00);

        ContaPoupanca contaP = new ContaPoupanca(222,222);
        contaP.depositar(100.00);

        contaC.transferir(10.00, contaP);

        System.out.println("\nSaldo Disponivel: " + contaC.getSaldo());
        System.out.println("\nSaldo Disponivel: " + contaP.getSaldo());
    }
}

