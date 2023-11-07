package yazevedo;

import java.util.ArrayList;
import java.util.Collections;

public class Pakli {

    private final ArrayList<Kartya> pakli;

    public Pakli() {
        this.pakli = feltolt();
    }

    private ArrayList<Kartya> feltolt() {
        ArrayList<Kartya> kartyak = new ArrayList<>();
        
        int revolverDb = 5;
        int tavcsoDb = 3;
        int kardDb = 3;
        int kopenyDb = 2;
        int soretesDb = 2;
        int merlegDb = 1;
        int aranyDb = 1;
        int bombaDb = 1;
        
        kartyaHozzaad(revolverDb, revolver(), kartyak);
        kartyaHozzaad(tavcsoDb, tavcso(), kartyak);
        kartyaHozzaad(kardDb, kard(), kartyak);
        kartyaHozzaad(kopenyDb, kopeny(), kartyak);
        kartyaHozzaad(soretesDb, soretes(), kartyak);
        kartyaHozzaad(merlegDb, merleg(), kartyak);
        kartyaHozzaad(aranyDb, arany(), kartyak);
        kartyaHozzaad(bombaDb, bomba(), kartyak);
       

        return kartyak;

    }
    
    public void kartyaHozzaad(int db, Kartya kartya, ArrayList<Kartya> kartyak) {
        for (int i = 0; i < db; i++) {
            kartyak.add(kartya);
        }
    }

    public ArrayList<Kartya> getPakli() {
        return pakli;
    }
    
    public Kartya getKartya(int index) {
        return pakli.get(index);
    }
    
    public void megkever() {
        Collections.shuffle(pakli);
    }
    
    public void kartyaKivesz(int index) {
       pakli.remove(index);
    }

    public void pakliKiir() {
        System.out.println("Kártyák száma: " + pakli.size());
        for (Kartya kartya : pakli) {
            System.out.println("--------------------------------");
            System.out.println("Kártya száma: " + kartya.getSzam());
            System.out.println("Kártya neve: " + kartya.getNev());
            System.out.println("Kártya leírása: " + kartya.getLeiras());
            System.out.println("Kártya képessége: " +kartya.getKepesseg());
        }
    }
    
    public Kartya revolver() {
        return new Kartya(1, "Revolver", "Válassz valakit, "
                + "mondj egy számot 2 és 8 között. Ha az a szám van a kezében, "
                + "az ellenfeled kiesett", "Akár csak az orosz rulettnél, egy lövésed van, gondold meg jól.");
    }
    
    public Kartya tavcso() {
        return new Kartya(2, "Távcső", "Válassz egy játékost, "
                + "akinek meg kell mutatnia a kezbében lévő lapot.", "Megláthatod ellenfeleid titkait akaratuk ellenére.");
    }
    
    public Kartya kard() {
        return new Kartya(3, "Kard", "Válassz egy játékost. "
                + "Hasonlítsd össze a válaszott játékos lapjának az "
                + "értékét a kezedben maradt lap értékével. A kisebb értékkel "
                + "rendelkező játékos kiesik.", "Magabiztos vagy képességeidben, az igazságos harchoz folyamodsz.");
    }
    
    public Kartya kopeny() {
        return new Kartya(4, "Varázsköpeny", "Védelmet nyújt bármilyen"
                + "hatás alól egy körig.", "E láthatatlanná tevő köpennyel ellenfeled orra előtt bújkálhatsz.");
    }

    public Kartya soretes() {
        return new Kartya(5, "Sörétes", "Válassz egy játékost. "
                + "A választott játékosnak el kell dobnia a lapját.", "Gyorsan és igazságtalanul vethetsz véget ellenfelednek.");
    }
    
    public Kartya merleg() {
        return new Kartya(6, "Mérleg", "Cseréléld meg a kártyád "
                + "egy általad válaszott játékossal.", "Valamivel ki kell egyenlíteni a mérleg két oldalát. Egyelnítsd ki két kártyával.");
    }
    
    public Kartya arany() {
        return new Kartya(7, "Arany", "Ha van egy 5-ös, vagy "
                + "6-os kártyád, rakd le ezt a kártyát.", "Akármennyire is sokat ér, nem bírod el egy sörétes, vagy mérleg mellett.");
    }
    
    public Kartya bomba() {
        return new Kartya(8, "Bomba", "Ha megjátszod ezt a kártyát, "
                + "kiestél.", "Veszélyes fegyver. De rád is...");
    }

}
