public class TesteEncargos {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333 );
        cc.depositar(100.00);

        SeguroDeVida seguro = new SeguroDeVida();

        ComputarOimposto cal = new ComputarOimposto();
        cal.registrar(cc);
        cal.registrar(seguro);

        System.out.println(cal.getTotalImposto());
    }
}
