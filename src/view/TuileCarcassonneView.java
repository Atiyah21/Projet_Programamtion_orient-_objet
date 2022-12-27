package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Tuile;
import model.TuileCarcassone;

public class TuileCarcassonneView extends TuileView {
    TuileCarcassone model;

    public TuileCarcassonneView(TuileCarcassone m) {
        super();
        model = m;
      
        ImageIcon icon = new ImageIcon(model.getI());

		JLabel j = new JLabel(icon);
        j.setVisible(true);
        add(j);
    }

    @Override
    public void update() {
        
    }
    
}
