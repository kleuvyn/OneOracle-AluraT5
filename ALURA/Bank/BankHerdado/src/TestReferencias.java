public class TestReferencias {

    public static void main(String[] args) {

        Gerente gr01 = new Gerente();
        gr01.setNome("Miguel Silva");
        gr01.setCpf(987456123);
        gr01.setSalario(5000.00);
        gr01.getBonificacao();


        EditorVideo editorv = new EditorVideo();
        editorv.setSalario(2500.00);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gr01);
        controle.registra(editorv);


        System.out.println("Nome: " + gr01.getNome() + "\nCPF: " + gr01.getCpf() + "\nSalario: "
                + gr01.getSalario() + "\nBonificação: " +  controle.getSoma());

        gr01.setSenha(0306);
        boolean autenticou = gr01.autentica(0306);

        System.out.println("Senha: " + autenticou);

        System.out.println(controle.getSoma());
    }

}
