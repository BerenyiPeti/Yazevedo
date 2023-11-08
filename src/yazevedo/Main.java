package yazevedo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    private final Pakli pakli = new Pakli();
    private Kartya eldobottKartya;
    private final ArrayList<Kartya> jatekosKez = new ArrayList<>(2);
    private final ArrayList<Kartya> robot1Kez = new ArrayList<>(2);
    private final ArrayList<Kartya> robot2Kez = new ArrayList<>(2);

    public static void main(String[] args) {
        new Main().jatek();

    }

    public void jatek() {
        pakli.megkever();

//MINDENKI HÚZ A LEGELEJÉN
        
        huzas(jatekosKez);
        huzas(robot1Kez);
        huzas(robot2Kez);

//KIÍRÁS        
        
        kiir();
        
//JÁTÉKOS HÚZ
        System.out.println("Húzáshoz nyomd meg az ENTER-t!");
        sc.nextLine();
        huzas(jatekosKez);
        kiir();
        
//JÁTÉKOS DOB

        System.out.println("Írd be, melyik kártyát szeretnéd eldobni!");
        dobas(jatekosKez, sc.nextInt()); 
        kiir();
        
//ROBOT1 HÚZ, MAJD DOB
        System.out.println("Folytatáshoz nyomd meg az ENTER-t!");
        sc.nextLine();
        
        huzas(robot1Kez);
        kiir();
    }

    public void kiir() {
        System.out.println("Húzó kártyák száma: " + pakli.getPakli().size());
        
        if (eldobottKartya == null) {
            System.out.println("Eldobott kártya: " + "-");
        } else {
            System.out.println("Eldobott kártya: " + eldobottKartya.getSzam());
        }
        
        System.out.println("--------------------");
        if (robot1Kez.size() == 2) {
            System.out.println("robot1 kártyái: ? ?");
        } else {
            System.out.println("robot1 kártyái: ?");
        }
        
        if (robot2Kez.size() == 2) {
            System.out.println("robot2 kártyái: ? ?");
        } else {
            System.out.println("robot2 kártyái: ?");
        }
        
        System.out.println("");
        System.out.print("A te kártyáid: ");
        mutat(jatekosKez);
        System.out.println("");
        System.out.println("");
    }

    public void mutat(ArrayList<Kartya> kez) {
        for (Kartya kartya : kez) {
            System.out.print(kartya.getSzam() + " ");
        }
    }

    public void huzas(ArrayList<Kartya> jatekos) {
        jatekos.add(pakli.getKartya(0));
        pakli.kartyaKivesz(0);
    }
    
    public void dobas(ArrayList<Kartya> jatekos, int kartya) {
        eldobottKartya = jatekos.get(kartya);
        jatekos.remove(kartya);
    }
   

//    public ArrayList<Kartya> getKez(ArrayList<Kartya> kez) {
//        for (Kartya kartya : kez) {
//            kez.add(kartya);
//        }
//        
//        return kez;
//    }
}
