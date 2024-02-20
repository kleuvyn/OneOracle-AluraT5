public class Pen {
        public String modelo;
        private float ponta;

        public String getModelo() {
                return this.modelo;
        }

        public void setModelo(String m) {
                this.modelo = m;
        }

        public float getPonta() {
                return this.ponta;
        }

        public void setPonta(float p) {
                this.ponta = p;
        }

        public void status() {
                System.out.println("Descrição da Caneta");
                System.out.println("Modelo: " + this.getModelo());
                //System.out.println("Cor: " + this.cor);
                System.out.println("Ponta: " + this.getPonta());
                //System.out.println("Carga: " + this.carga);
                //System.out.println("Está tampada? " + this.tampada);

        }

}