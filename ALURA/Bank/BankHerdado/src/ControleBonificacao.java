public class ControleBonificacao {

    private  double soma;

    public void registra(Funcionario fun){

        double bon = fun.getBonificacao();
        this.soma = this.soma + bon;
    }

    public double getSoma() {
        return soma;
    }
}
