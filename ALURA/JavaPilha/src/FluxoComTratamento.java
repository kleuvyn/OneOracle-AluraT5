public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo01();
        System.out.println("Fim do main");

    }
    private static  void metodo01() {
        System.out.println("Ini do metodo01");
        metodo02();
        System.out.println("Fim do metodo01");

    }
    private  static void metodo02() {
        System.out.println("Ini do metodo02\n");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                int a = i / 0;
                Conta c = null;
                c.deposita();
            } catch(ArithmeticException | NullPointerException ex) {
                String msg = ex.getMessage();
                System.out.println("Exception " + msg);
                ex.printStackTrace();
            }
        }
        System.out.println("Fim do metodo02");
    }

}
