package prekybos.botas.main;

import prekybos.botas.Vidurkiai;
import prekybos.botas.duomenys.DuomenuTiekejas;
import prekybos.botas.duomenys.TestiniaiDuomenys;
import prekybos.botas.modelis.ValiutuPoros;

public class NujasMainas {

    public static void main(String[] args) {

        DuomenuTiekejas duomenys = new TestiniaiDuomenys(); //baigta
        ValiutuPoros vp = duomenys.loadValiutuPoros("");
        Vidurkiai vidurkiai = new Vidurkiai();
        double vidurkis = vidurkiai.vidurkis(vp);
        System.out.println(vidurkis);
    }
}
