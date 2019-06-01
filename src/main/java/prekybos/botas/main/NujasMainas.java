package prekybos.botas.main;

import prekybos.botas.Nuokrypis;
import prekybos.botas.duomenys.DuomenuTiekejas;
import prekybos.botas.duomenys.TestiniaiDuomenys;
import prekybos.botas.modelis.ValiutuPoros;

public class NujasMainas {

    public static void main(String[] args) {

        DuomenuTiekejas duomenys = new TestiniaiDuomenys(); //baigta
        ValiutuPoros vp = duomenys.loadValiutuPoros("");

        Nuokrypis n = new Nuokrypis();
        double nuokrypis = n.nuokrypis(vp);
        if (nuokrypis >= 0.04) {
            System.out.println("Parduoti");
        }

        if (nuokrypis <= -0.04) {
            System.out.println("Pirkti");
        }

    }
}
