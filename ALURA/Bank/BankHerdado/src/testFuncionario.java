public class testFuncionario {
    public static void main(String[] args) {

        Gerente beatryz = new Gerente();
        beatryz.setNome("Beatryz KLeuvyn");
        beatryz.setCpf(123654789);
        beatryz.setSalario(3500.00);

        System.out.println("Nome: " + beatryz.getNome() + "\n" + "Bonificação: " + beatryz.getBonificacao());

    }
}
