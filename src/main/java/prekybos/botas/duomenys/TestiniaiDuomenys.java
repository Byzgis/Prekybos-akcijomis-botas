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
        
        kainosIstorija.add(new MomentineKaina(1.3,1.3, 1.3,1.4,1.2, LocalDateTime.of(2018, Month.MARCH, 1, 9, 10, 10)));
        kainosIstorija.add(new MomentineKaina(1.3,1.3, 1.3,1.4,1.2, LocalDateTime.of(2018, Month.MARCH, 1, 9, 10, 40)));
        
        vp.setKainosIstorija(kainosIstorija);
        
        
        
        
        return vp;

    }

}
