package d_27_12_2022;

//   2.	Kreirati klasu SmartAirConditioning koja ima:
//        //•	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        //•	atribut za izabranu temperaturu
//        //•	atribut za mod (hladi/greje) - string

    public class SmartAirConditioning {

        public String marka;
        public int temperatura;
        public String mod;

        public void print(){
            System.out.println("Marka klime: " + this.marka);
            System.out.println("Temperatura: " + this.temperatura);
            System.out.println("Mod: " + this.mod);
        }

        public boolean temperaturaNapolju(int napolju){
            return napolju > this.temperatura;
        }

    }
