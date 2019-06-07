package prekybos.botas.main;

import prekybos.botas.Vidurkis;
import prekybos.botas.duomenys.DuomenuTiekejas;
import prekybos.botas.duomenys.TestiniaiDuomenys;
import prekybos.botas.main.output.UserInteraction;
import prekybos.botas.main.output.UserInteractionFactory;
import prekybos.botas.modelis.ValiutuPoros;

public class BotasMain {

    public static void main(String[] args) {

        UserInteraction userIO = UserInteractionFactory.createInstance(false);

        DuomenuTiekejas duomenys = new TestiniaiDuomenys();
        ValiutuPoros vp = duomenys.loadValiutuPoros("");

        Vidurkis v = new Vidurkis();
        double vidurkis = v.nuokrypis(vp);
        double kreive = Double.parseDouble(userIO.userInput("Ivesk atstuma"));


        Sprendimas spr = new Sprendimas(userIO);
        spr.sprendimas(vidurkis, kreive);

    }


}
