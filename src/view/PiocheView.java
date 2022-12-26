package view;

import java.util.Stack;

import model.*;

public class PiocheView extends TuileView{
    Stack<Tuile> pioche;
    
    public PiocheView(Stack<Tuile> pioche){
        super(pioche.empty() ? null : pioche.peek());
        this.pioche = pioche;
        update();
    }

    @Override
    public void update() {
        model = pioche.empty() ? null : pioche.peek();
        super.update();
    }
}
