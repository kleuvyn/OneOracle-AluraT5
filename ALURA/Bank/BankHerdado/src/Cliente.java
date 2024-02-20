public class Cliente implements Legitimar {

    private Autenticacao certificar;

    public Cliente(){
   this.certificar = new Autenticacao();

    }

    @Override
    public void setSenha(int senha) {
        this.certificar.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.certificar.autentica(senha);
    }

}
