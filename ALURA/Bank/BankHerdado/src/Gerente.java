public class Gerente extends Funcionario implements Legitimar {

    private Autenticacao certificar;

        public Gerente() {
        this.certificar = new Autenticacao();
    }

        public double getBonificacao() {
            return super.getSalario();
        }

        @Override
        public void setSenha( int senha) {
            this.certificar.setSenha(senha);
        }

        @Override
        public boolean autentica( int senha) {
            return this.certificar.autentica(senha);
        }
    }
