public class Teste02Caneta {
    public static void main(String [] args){
        Caneta caneta02 = new Caneta();
        caneta02.modelo = "Bic Cristal";
        caneta02.cor = "Azul";
        //caneta02.ponta = 0.5f;
        caneta02.carga = 80;
        //caneta02.tampada =  false;
        caneta02.status();
        //caneta02.rabiscar();
        caneta02.tampar ();
    }
}
