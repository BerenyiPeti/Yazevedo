package yazevedo;

import java.util.List;

public class Pakli {
    private List<Kartya> pakli;

    public Pakli(List<Kartya> pakli) {
        this.pakli = pakli;
    }

    
    public Pakli() {
        feltolt();
    }
    
    
    
    public void feltolt() {
        for (int i = 0; i < 5; i++) {
            ijasz();
        }
        
        
    }
    
    public void ijasz() {
        this.pakli.add(new Kartya(1, "Íjász", "Válassz valakit, "
                + "mondj egy számot 2 és 8 között. Ha az a szám van a kezében, "
                + "az ellenfeled kiesett."));
    }

    public List<Kartya> getPakli() {
        return pakli;
    }
    
    
   
}
