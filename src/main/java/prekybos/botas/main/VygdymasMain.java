package prekybos.botas.main;

public class VygdymasMain {

    public static void main(String[] args) {
                 //viska sutvarkyti paeiliui.
        double uzduotasSkirtumas = 0.051;
        double vidurkioLinija = 1.3050;
        double kursas = 1.3000;
        //       boolean pokytis = (kursas >= kreive);
        double skirtumas = (kursas - vidurkioLinija);

        System.out.println( "Kainos nuoktypis" + skirtumas);

        if (skirtumas <= uzduotasSkirtumas) {
            System.out.println("Pirkti");   // aktyvuojamas pirkimas
        }
        if (skirtumas >= uzduotasSkirtumas) {
            System.out.println("Parduoti");  // aktyvuojamas pardavimas
        }
    }           
}
//pirkimas ir padavimas aktyvus turi buti tik vienas








//    public static void main(String[] args) {
//      Langas la = new Langas();
//    la.create();

