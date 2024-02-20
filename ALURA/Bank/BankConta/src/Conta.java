   public abstract class Conta {
    protected double saldo;
       private int agencia;
       private int numero;
       private Cliente titular;
      private static int total =0 ;

      // OPCIONAL
//      public Conta() {
//
//       }
       public Conta(int agencia, int numero) {
           Conta.total++;

           this.agencia = agencia;
           this.numero = numero;
           //this.saldo = 100;
           //System.out.println("\n...Crinda conta...\n" + "\nConta: " + this.numero );
       }

    public void depositar(double valor){
        this.saldo += valor;

    }
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }

    }
    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor )) {
            destino.depositar(valor);
            return true;
        }else {
            return false;
        }
    }
        public double getSaldo() {
            return this.saldo;
        }

        public int getNumero() {
            return this.numero;
        }

       public void setNumero(int numero) {
           if(numero <= 0) {
               System.out.println("Não pode valalor menor  igual a 0.");
               return;
           }
           this.numero = numero;
       }

       public int getAgencia() {
           return this.agencia;
       }

       public void setAgencia(int agencia) {
        if( agencia <= 0) {
            System.out.println("Não pode valalor menor  igual a 0.");
            return;
        }
           this.agencia = agencia;
       }
       public void setTitular(Cliente titular) {
            this.titular = titular;
       }

       public Cliente getTitular() {
           return titular;
       }

        public static int getTotal() {
            return Conta.total;
   }
}