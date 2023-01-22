package p19_01_2023;

//	Kreirati klasu PoreskaUprava koja za atribute ima:
//ime grada u kom se nalazi
//niz objekata

import java.util.ArrayList;
import java.util.List;

public class PoreskaUprava {

    private String grad;
    private ArrayList<Objekat> objekti;

    public PoreskaUprava() {
        super();
        objekti = new ArrayList<>();
    }

    public PoreskaUprava(String grad) {
        super();
        this.grad = grad;
        objekti = new ArrayList<>();
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public void dodajObjekat(Objekat o) {

        this.objekti.add(o);
    }


    public double ukupanPorez() {
        double suma = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            suma += this.objekti.get(i).racunajPorez();
        }
        return suma;
    }

    public void stampajSve() {
        for (int i = 0; i < this.objekti.size(); i++) {
            this.objekti.get(i).stampaj();
//			if (this.objekti.get(i) instanceof Lokal) {
//				System.out.println("Jeste lokal");
//			} else if (this.objekti.get(i) instanceof Kuca) {
//
//			}
        }
        System.out.println("Ukupan porez" + this.ukupanPorez());
    }
    //	public Integer najveciPorez() {
//		ArrayList<Integer> niz = new ArrayList<>();
//		niz.add(1);
//		niz.add(2);
//		niz.add(3);
//		niz.add(4);
//		int max = niz.get(0);
//		int pozicija = 0;
//		for (int i = 0; i < niz.size(); i++) {
//			if (max < niz.get(i)) {
//				max = niz.get(i);
//				pozicija = i;
//			}
//		}
//		return niz.get(pozicija);
//	}
    public Objekat najveciPorez() {
//		double maxPorez = this.objekti.get(0).racunajPorez();
//		int pozicija = 0;
//		for (int i = 0; i < this.objekti.size(); i++) {
//			if (this.objekti.get(i).racunajPorez() > maxPorez) {
//				maxPorez = this.objekti.get(i).racunajPorez();
//				pozicija = i;
//			}
//		}
//
//		return objekti.get(pozicija);

        Objekat najveci = this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).racunajPorez() > najveci.racunajPorez()) {
                najveci = this.objekti.get(i);
            }
        }
        return najveci;

    }
}