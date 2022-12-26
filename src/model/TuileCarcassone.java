package model;
import java.awt.image.BufferedImage;

public class TuileCarcassone extends Tuile{
    BufferedImage i ;

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
