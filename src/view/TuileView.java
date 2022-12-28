package view;

import javax.swing.*;

import java.awt.*;
import model.*;

public class TuileView extends UpdatableView {
    Dimension preferredSize = new Dimension(100, 100);
    int x = 0;
    int y = 0;
    UpdatableView t;
    Tuile model;

    public TuileView(Tuile m) {
        model = m;
        resetT();
        add(t);
    }

    public TuileView() {
    }

    public void resetT(){
        if(model instanceof TuileDominos){
            t = new TuileDominosView((TuileDominos) model);
        }else if (model instanceof TuileCarcassone) {
            t = new TuileCarcassonneView((TuileCarcassone) model);
        }
    }

    public TuileView(boolean isReachable) {
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
        remove(t);
        resetT();
        add(t);
        revalidate();
        repaint();
    }

}
