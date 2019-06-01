package prekybos.botas.duomenys;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import prekybos.botas.modelis.MomentineKaina;
import prekybos.botas.modelis.ValiutuPoros;

public class TestiniaiDuomenys implements DuomenuTiekejas {

    @Override
    public ValiutuPoros loadValiutuPoros(String valiutuPorosKodas) {

        ValiutuPoros vp = new ValiutuPoros();

        List<MomentineKaina> kainosIstorija = new ArrayList<>();

        kainosIstorija.add(new MomentineKaina(1.31, 1.30, 1.32, 1.40, 1.20, LocalDateTime.of(2018, Month.MARCH, 1, 9, 10, 10)));   // pagal pirma skaiciuka(1.31), bus toliau apskaiciuojamas vidurkis
        kainosIstorija.add(new MomentineKaina(1.32, 1.31, 1.33, 1.44, 1.24, LocalDateTime.of(2018, Month.MARCH, 1, 9, 10, 40)));
        kainosIstorija.add(new MomentineKaina(1.38, 1.37, 1.38, 1.50, 1.29, LocalDateTime.of(2018, Month.MARCH, 1, 9, 11, 40)));

        vp.setKainosIstorija(kainosIstorija);

        return vp;

    }

}
