public class Administrador extends Funcionario implements Legitimar {

    private Autenticacao certificar;

        public Administrador() {
        this.certificar = new Autenticacao();
    }

        public double getBonificacao() {
            return 50;
        }


        public void setSenha(int senha) {
            this.certificar.setSenha(senha);
        }


        public boolean autentica(int senha) {
            return this.certificar.autentica(senha);
        }

    }

