package prekybos.botas;

import prekybos.botas.modelis.ValiutuPoros;

public class Vidurkiai {

    public double vidurkis(ValiutuPoros vp) {
    
        double suma = 0;
        for (int i = 0; i < vp.getKainosIstorija().size(); i++) {        //issikvieciam vp, per getKainosIstorija().size()
            suma = suma +  vp.getKainosIstorija().get(i).getKaina();
        }
        return suma / vp.getKainosIstorija().size();
    }
}
