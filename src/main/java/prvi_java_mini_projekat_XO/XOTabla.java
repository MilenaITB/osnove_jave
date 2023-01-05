package prvi_java_mini_projekat_XO;

public class XOTabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeXIgraca;
    private String imeOIgraca;

    private String naPotezu;
    private String igraSledeci;

    // geteri
    public String getImeXIgraca() {
        return this.imeXIgraca;
    }

    public String getImeOIgraca() {
        return this.imeOIgraca;
    }

    public String getIgraSledeci() {
        return this.igraSledeci;
    }

    // seteri

    public void setImeXIgraca(String imeXIgraca) {
        this.imeXIgraca = imeXIgraca;
    }

    public void setImeOIgraca(String imeOIgraca) {
        this.imeOIgraca = imeOIgraca;
    }

    public void setNaPotezu(String naPotezu) {
        this.naPotezu = naPotezu;
    }

    public void pokreniIgru() {
        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";
        this.igraSledeci = "X";
    }

    public void stampaj() {
        System.out.println(polje1 + " |" + polje2 + " |" + polje3);
        System.out.println(polje4 + " |" + polje5 + " |" + polje6);
        System.out.println(polje7 + " |" + polje8 + " |" + polje9);
        System.out.println("Igrac X: " + imeXIgraca);
        System.out.println("Igrac O: " + imeOIgraca);

        if (popunjenaTabla() == false && pobednikX() == false && pobednikO() == false){
            System.out.println("Na potezu igrac " + igraSledeci);
        }
    }

    public boolean poljePrazno(int index) {
        if (index == 1 && polje1.equals(" ")) {
            return true;
        } else if (index == 2 && polje2.equals(" ")) {
            return true;
        } else if (index == 3 && polje3.equals(" ")) {
            return true;
        } else if (index == 4 && polje4.equals(" ")) {
            return true;
        } else if (index == 5 && polje5.equals(" ")) {
            return true;
        } else if (index == 6 && polje6.equals(" ")) {
            return true;
        } else if (index == 7 && polje7.equals(" ")) {
            return true;
        } else if (index == 8 && polje8.equals(" ")) {
            return true;
        } else if (index == 9 && polje9.equals(" ")) {
            return true;
        } else
            return false;
    }

    public void zameniIgraca() {
        if (igraSledeci.equals("X")) {
            igraSledeci = "O";
        } else if (igraSledeci.equals("O")) {
            igraSledeci = "X";
        }
    }

    public void odigrajPotez(int index) {
        if (index == 1) {
            polje1 = naPotezu;
        } else if (index == 2) {
            polje2 = naPotezu;
        } else if (index == 3) {
            polje3 = naPotezu;
        } else if (index == 4) {
            polje4 = naPotezu;
        } else if (index == 5) {
            polje5 = naPotezu;
        } else if (index == 6) {
            polje6 = naPotezu;
        } else if (index == 7) {
            polje7 = naPotezu;
        } else if (index == 8) {
            polje8 = naPotezu;
        } else if (index == 9) {
            polje9 = naPotezu;
        }
    }

    public boolean popunjenaTabla() {
        if (!polje1.equals(" ") && !polje2.equals(" ") && !polje3.equals(" ")
                && !polje4.equals(" ") && !polje5.equals(" ") && !polje6.equals(" ")
                && !polje7.equals(" ") && !polje8.equals(" ") && !polje9.equals(" ")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pobednikX() {
        if ((polje1.equals("X") && polje2.equals("X") && polje3.equals("X")) ||
                (polje4.equals("X") && polje5.equals("X") && polje6.equals("X")) ||
                (polje7.equals("X") && polje8.equals("X") && polje9.equals("X")) ||
                (polje1.equals("X") && polje5.equals("X") && polje9.equals("X")) ||
                (polje1.equals("X") && polje4.equals("X") && polje7.equals("X")) ||
                (polje2.equals("X") && polje5.equals("X") && polje8.equals("X")) ||
                (polje3.equals("X") && polje6.equals("X") && polje9.equals("X")) ||
                (polje3.equals("X")) && polje5.equals("X") && polje7.equals("X")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pobednikO() {
        if ((polje1.equals("O") && polje2.equals("O") && polje3.equals("O")) ||
                (polje4.equals("O") && polje5.equals("O") && polje6.equals("O")) ||
                (polje7.equals("O") && polje8.equals("O") && polje9.equals("O")) ||
                (polje1.equals("O") && polje5.equals("O") && polje9.equals("O")) ||
                (polje1.equals("O") && polje4.equals("O") && polje7.equals("O")) ||
                (polje2.equals("O") && polje5.equals("O") && polje8.equals("O")) ||
                (polje3.equals("O") && polje6.equals("O") && polje9.equals("O")) ||
                (polje3.equals("O")) && polje5.equals("O") && polje7.equals("O")) {
            return true;
        } else {
            return false;
        }

    }
}
