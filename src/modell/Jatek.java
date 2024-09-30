package modell;

public class Jatek {
    private Lada[] ladak;
    private int valasztas;

    public Jatek() {
        ladak = new Lada[3];
        ladak[0] =  new Lada("arany", "En nem rejtem a kicset");
        ladak[1] =  new Lada("ezust", "Nem en rejtem a kincset", true);
        ladak[2] =  new Lada("bronz", "Az arany hazudik");
                
        System.out.println(kezdes());
    }

    private String kezdes() {
        String s = "hol a kincs? csak egy allitas ista\n";
        int i = 1;
        for (Lada lada : ladak) {
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i++ + ". " + a + "Lada --> " + f + "\n";
        }
        
        return s;
    }
    
    private String ellenorzes(){
        String talalt = "Gratulalok, megtalaltad a kincset";
        String nemtalalt = "Sajnos ures a lada";
        return ladak[valasztas].isKincs() ? talalt : nemtalalt;
    }
    
    
}
