package prekybos.botas.main;

import prekybos.botas.Nuokrypis;
import prekybos.botas.duomenys.DuomenuTiekejas;
import prekybos.botas.duomenys.TestiniaiDuomenys;
import prekybos.botas.modelis.ValiutuPoros;

public class BotasMain {

    public static void main(String[] args) {

        DuomenuTiekejas duomenys = new TestiniaiDuomenys();
        ValiutuPoros vp = duomenys.loadValiutuPoros("");

        Nuokrypis n = new Nuokrypis();
        double nuokrypis = n.nuokrypis(vp);
       
        if (nuokrypis >= 0.04) {
            System.out.println("Laikas parduoti");
        } else if (nuokrypis >= -0.04) {       //  if (nuokrypis <= 0.04) {
            System.out.println("Dar palauk");
        }

        if (nuokrypis <= -0.04) {
            System.out.println("Laikas pirkti");
        }

        System.out.println(nuokrypis);
    }
}
