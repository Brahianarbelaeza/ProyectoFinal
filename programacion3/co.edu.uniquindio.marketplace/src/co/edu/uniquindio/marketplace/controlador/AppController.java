package controlador;

import modelo.Administrador;
import modelo.Cuenta;


import java.util.ArrayList;

public enum AppController {

    INSTANCE;
    private final Administrador model;

    AppController() {model = new Administrador("Bra","Arb","1234", "brahiana",new ArrayList<>());
    }

    public Administrador getModel() {
        return model;
    }
}
