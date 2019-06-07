package prekybos.botas;

import prekybos.botas.modelis.ValiutuPoros;



public class Vidurkis {

    public double nuokrypis(ValiutuPoros vp) {   //skirtumas tarp kainos ir vidurkio
       

        return vidurkis(vp) -vp.getKainosIstorija().get(vp.getKainosIstorija().size()-1).getKaina();

    }
    private double vidurkis(ValiutuPoros vp) {
    
        double suma = 0;
        for (int i = 0; i < vp.getKainosIstorija().size(); i++) {        //issikvieciam vp, per getKainosIstorija().size()
            suma = suma +  vp.getKainosIstorija().get(i).getKaina();
        }
        return suma / vp.getKainosIstorija().size();
       
    }
     
}
