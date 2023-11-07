package yazevedo;

import java.util.ArrayList;

public class Main {

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
        //pakli.pakliKiir();

        jatekosKez.add(pakli.getKartya(0));
        robot1Kez.add(pakli.getKartya(1));
        robot2Kez.add(pakli.getKartya(2));
        pakli.kartyaKivesz(0);
        pakli.kartyaKivesz(1);
        pakli.kartyaKivesz(2);

        kiir();
//        System.out.println("Játékos:");
//        mutat(jatekosKez);
//        System.out.println("Robot1:");
//        mutat(robot1Kez);
//        System.out.println("Robot2:");
//        mutat(robot2Kez);
    }

    public void kiir() {
        System.out.println("Húzó kártyák száma: " + pakli.getPakli().size());
        if (eldobottKartya == null) {
            System.out.println("Eldobott kártya: " + "-");
        } else {
            System.out.println("Eldobott kártya: " + eldobottKartya.getSzam());
        }
        System.out.println("--------------------");
        System.out.println("robot1 kártyái: ?");
        System.out.println("robot2 kártyái: ?");
        System.out.println("");
        System.out.print("A te kártyáid: ");
        mutat(jatekosKez);
    }

    public void mutat(ArrayList<Kartya> kez) {
        for (Kartya kartya : kez) {
            System.out.print(kartya.getSzam() + " ");
        }
    }

//    public ArrayList<Kartya> getKez(ArrayList<Kartya> kez) {
//        for (Kartya kartya : kez) {
//            kez.add(kartya);
//        }
//        
//        return kez;
//    }
}
