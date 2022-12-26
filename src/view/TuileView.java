package view;

import javax.swing.*;
import java.awt.*;
import model.*;

public class TuileView extends JPanel implements Updatable{
    Dimension preferredSize = new Dimension(100, 100);
    int x = 0;
    int y = 0;

    public TuileView(Tuile m) {
     if(m instanceof TuileDominos){
        add(new TuileDominosView((TuileDominos) m));
     }else if(m instanceof TuileCarcassone){
        add(new TuileCarcassonneView());
     }
    }

    @Override
    public void setPreferredSize(Dimension d) {
        preferredSize = d;
    }

    public Dimension getPreferredSize() {
        return preferredSize;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }

}
