package yazevedo;

public class Kartya {
    private int szam;
    private String nev;
    private String kepesseg;

    public Kartya(int szam, String nev, String kepesseg) {
        this.szam = szam;
        this.nev = nev;
        this.kepesseg = kepesseg;
    }

    public int getSzam() {
        return szam;
    }

    public String getNev() {
        return nev;
    }

    public String getKepesseg() {
        return kepesseg;
    }

    public void setSzam(int szam) {
        this.szam = szam;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKepesseg(String kepesseg) {
        this.kepesseg = kepesseg;
    }
    
    
}
