public class TesteBanco {
    public static void main(String[] args) {
        Cliente kleuvyn = new Cliente();
        kleuvyn.nome = "Beatryz Kleuvyn Silva";
        kleuvyn.cpf = "032.165.987-00";
        kleuvyn.profissao = "estudante";

        Conta contaKleuvyn  = new Conta();
        contaKleuvyn.depositar(100);
//
//
        contaKleuvyn.titular = kleuvyn;
        System.out.println(contaKleuvyn.titular.nome);

        //test01 conta sem cliente
        Conta contaLuna = new Conta();
        System.out.println(contaLuna.getSaldo());

//        contaLuna.titular = new Cliente();
//        System.out.println(contaLuna);
//
//        contaLuna.titular.nome = "Luna Silva";
//        System.out.println(contaLuna.titular.nome);
//
//        //  test02 sado negativo
//        Conta conta= new Conta();
//        conta.depositar(100);
//        System.out.println(conta.sacar(101));
//
//        System.out.println(conta.saldo);
        //proibido:
        Conta conta = new Conta();
        conta.depositar(100);
        System.out.println(conta.sacar(101));

        conta.sacar(101);

        System.out.println(conta.getSaldo());


    }
}


