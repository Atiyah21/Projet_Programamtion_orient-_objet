package model;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;


public class TuileCarcassone extends Tuile{
    BufferedImage i ;
    boolean bouclier;

    public TuileCarcassone(SideCarcassonne.Sike n, SideCarcassonne.Sike e, SideCarcassonne.Sike s, SideCarcassonne.Sike w, boolean bouclier){
        this.n = new SideCarcassonne(n);
        this.e = new SideCarcassonne(e);
        this.s = new SideCarcassonne(s);
        this.w = new SideCarcassonne(w);
        this.bouclier = bouclier;
        try{
            i = ImageIO.read(new File("src/assets/" + n.value + e.value + s.value + w.value + (bouclier ? "_" : "") + ".png"));
        
        } catch (IOException exn) {
            System.out.println("Erreur lors du chargement de l'image");
            System.exit(0);
        }
        
    }

    public BufferedImage getI() {
        return i;
    }

    @Override
    public void rotate() {
        Utils.rotate(i);    
        w.revert();
        e.revert();
        Side tmp = n;
        n = w;
        w = s;
        s = e;
        e = tmp;
    }

}
