//calculador de imposto
public class ComputarOimposto {

    private  double totalImposto;

    public void registrar(Encargos en){ // contacao = valor
        double valor =  en.getCotacaoImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
