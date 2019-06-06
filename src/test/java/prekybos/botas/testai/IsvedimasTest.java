package prekybos.botas.testai;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import prekybos.botas.Nuokrypis;
import prekybos.botas.modelis.MomentineKaina;
import prekybos.botas.modelis.ValiutuPoros;

public class IsvedimasTest {

    private ValiutuPoros vp;

    @Before
    public void init() {

        List<MomentineKaina> kainosIstorija = new ArrayList<>();

        kainosIstorija.add(new MomentineKaina(1.20, 1.30, 1.32, 1.40, 1.20, LocalDateTime.of(2019, Month.MARCH, 1, 9, 10, 10)));
        kainosIstorija.add(new MomentineKaina(1.52, 1.31, 1.33, 1.44, 1.24, LocalDateTime.of(2019, Month.MARCH, 1, 9, 10, 40)));
        kainosIstorija.add(new MomentineKaina(1.40, 1.37, 1.38, 1.50, 1.29, LocalDateTime.of(2019, Month.MARCH, 1, 9, 11, 40)));
        kainosIstorija.add(new MomentineKaina(1.51, 1.37, 1.38, 1.50, 1.29, LocalDateTime.of(2019, Month.MARCH, 1, 9, 12, 40)));
        kainosIstorija.add(new MomentineKaina(1.49, 1.37, 1.38, 1.50, 1.29, LocalDateTime.of(2019, Month.MARCH, 1, 9, 13, 40)));
        kainosIstorija.add(new MomentineKaina(1.10, 1.37, 1.38, 1.50, 1.29, LocalDateTime.of(2019, Month.MARCH, 1, 9, 14, 40)));
        kainosIstorija.add(new MomentineKaina(1.30, 1.37, 1.38, 1.50, 1.29, LocalDateTime.of(2019, Month.MARCH, 1, 9, 15, 40)));
        vp = new ValiutuPoros();
        vp.setKainosIstorija(kainosIstorija);
    }

    @Test                                  //patikrina ar teisingai, apkaiciuoja vidurki
    public void nuokrypis() {
        Nuokrypis n = new Nuokrypis();
        double result = n.nuokrypis(vp);
        Assert.assertTrue(Math.abs(1.36 - result) > 0.001);

    }
}
