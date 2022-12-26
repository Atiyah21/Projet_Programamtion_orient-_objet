package view;

import javax.swing.*;

import java.awt.*;
import model.*;

public class TuileView extends UpdatableView{
    Dimension preferredSize = new Dimension(100, 100);
    int x = 0;
    int y = 0;
    UpdatableView t;
    Tuile model;

    public TuileView(Tuile m) {
        model = m;
     if(m instanceof TuileDominos){
        t = new TuileDominosView((TuileDominos) m);
     }else if(m instanceof TuileCarcassone){
        t = new TuileCarcassonneView();
     }
     add(t);
    }

    public TuileView(){}

    public TuileView(boolean isReachable){
        add(new TuileDominosView(isReachable));
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
        t.update();
    }

}
