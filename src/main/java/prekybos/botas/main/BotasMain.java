package prekybos.botas.main;

import prekybos.botas.Vidurkis;
import prekybos.botas.duomenys.DuomenuTiekejas;
import prekybos.botas.duomenys.NuokrypisNuoVidurkio;
import prekybos.botas.duomenys.TestiniaiDuomenys;
import prekybos.botas.modelis.ValiutuPoros;

public class BotasMain {

    public static void main(String[] args) {

        DuomenuTiekejas duomenys = new TestiniaiDuomenys();
        ValiutuPoros vp = duomenys.loadValiutuPoros("");

        Vidurkis v = new Vidurkis();
        double vidurkis = v.nuokrypis(vp);

        NuokrypisNuoVidurkio nnv = new NuokrypisNuoVidurkio();
        double kreive = nnv.kk;

        if (vidurkis >= kreive) {
            System.out.println("Laikas parduoti");
        } else if (vidurkis >= kreive) {       //  if (nuokrypis <= 0.04) {
            System.out.println("Dar palauk");
        }

        if (vidurkis <= kreive) {
            System.out.println("Laikas pirkti");
        }

        System.out.println(vidurkis);
    }
}
