public class TestGerente {
    public static void main(String[] args) {

     Legitimar referencia = new Cliente();

        Gerente gr01 = new Gerente();
        gr01.setNome("Luna Silva");
        gr01.setCpf(123456789);
        gr01.setSalario(6000.00);
        gr01.getBonificacao();

        gr01.setSenha(2222);
        boolean autenticou = gr01.autentica(2222);

        System.out.println("Senha: " + autenticou);
        System.out.println("Nome: " + gr01.getNome() + "\nCPF: " + gr01.getCpf() + "\nSalario: " + gr01.getSalario() + "\nBonificação: " + gr01.getBonificacao());

    }
}
