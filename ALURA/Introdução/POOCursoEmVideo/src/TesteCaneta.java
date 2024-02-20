public class TesteCaneta {
    public static void main(String[] args){
        Caneta caneta01 = new Caneta();
        caneta01.cor = "Azul";
//        caneta01.ponta = 0.5f;
        //caneta01.tampada = false;
        caneta01.tampar();
        caneta01.status();
        caneta01.rabiscar();
    }
}