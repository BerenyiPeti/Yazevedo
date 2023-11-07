package yazevedo;

import java.util.ArrayList;
import java.util.List;

public class Pakli {

    private ArrayList<Kartya> pakli;

    public Pakli() {
        this.pakli = feltolt();
    }

    public ArrayList<Kartya> feltolt() {
        ArrayList<Kartya> kartyak = new ArrayList<>();
        
        int ijjaszok = 1;
        int papok = 3;
        int harcosok = 3;
        int lovagok = 2;
        int lekvarok = 2;
        int kiralyok = 1;
        int kiralyfik = 1;
        int milulu = 1;
        
        kartyaHozzaad(ijjaszok, ijasz(), kartyak);
        //kartyaHozzaad(papok, ijasz(), kartyak);
        

        return kartyak;

    }
    
    public void kartyaHozzaad(int db, Kartya kartya, ArrayList<Kartya> kartyak) {
        for (int i = 0; i < db; i++) {
            kartyak.add(kartya);
        }
    }

    public Kartya ijasz() {
        return new Kartya(1, "Íjász", "Válassz valakit, "
                + "mondj egy számot 2 és 8 között. Ha az a szám van a kezében, "
                + "az ellenfeled kiesett");
    }

    public List<Kartya> getPakli() {
        return pakli;
    }

    public void pakliKiir() {
        for (Kartya kartya : pakli) {
            System.out.println("--------------------------------");
            System.out.println("Kártya száma: " + kartya.getSzam());
            System.out.println("Kártya neve: " + kartya.getNev());
            System.out.println("Kártya képessége: " +kartya.getKepesseg());
        }
    }

}
