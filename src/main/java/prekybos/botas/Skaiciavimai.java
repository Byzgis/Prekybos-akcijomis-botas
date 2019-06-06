//
//package prekybos.botas;
//
//import prekybos.botas.duomenys.DuomenuTiekejas;
//import prekybos.botas.duomenys.TestiniaiDuomenys;
//import prekybos.botas.modelis.ValiutuPoros;
//
//
//public class Skaiciavimai {
//    double skirtumas = 0.04;
//    double skirtumas2 = 0.00;
//    double skirtumas3 = skirtumas *-1;
//    
//    DuomenuTiekejas duomenys = new TestiniaiDuomenys();
//      ValiutuPoros vp = duomenys.loadValiutuPoros("");
//    
//    Nuokrypis n = new Nuokrypis();
//    double nuokrypis =n.nuokrypis(vp);
//
//    
//                                       
//       if (nuokrypis >= 0.04) {
//            System.out.println("Laikas parduoti");
//        } else if (nuokrypis >= -0.04) {       //  if (nuokrypis <= 0.04) {
//            System.out.println("Dar palauk");
//        }
//
//        if (nuokrypis <= -0.04) {
//           System.out.println("Laikas pirkti");
//        }
//
//            System.out.println(nuokrypis);
//    
//    
//    
//    
//}
