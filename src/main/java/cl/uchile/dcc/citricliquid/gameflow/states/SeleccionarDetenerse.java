package cl.uchile.dcc.citricliquid.gameflow.states;

import cl.uchile.dcc.citricliquid.gameflow.Controller;

public class SeleccionarDetenerse extends AbstractState{
    public boolean detenerse;
    public int movimientosRestantes;

    public SeleccionarDetenerse(Controller controller, int movimientosRestantes) {
        super(controller);
        this.movimientosRestantes = movimientosRestantes;

    }

    public void decidirDetenerse(boolean decision){
        this.detenerse = decision;
    }

    public void activateState(){
        if(detenerse == true){
            this.controller.setState(new Detenido(this.controller, true));
        }
        else{
            this.controller.setState(new Desplazar(this.controller, this.movimientosRestantes));
        }
    }
}