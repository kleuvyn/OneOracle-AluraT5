public class TestSistema {

    public static void main(String[] args) {
        Gerente gr01 = new Gerente();
        gr01.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(1239);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno sis = new SistemaInterno();
        sis.autentica(gr01);
        sis.autentica(adm);
        sis.autentica(cliente);

    }


}
