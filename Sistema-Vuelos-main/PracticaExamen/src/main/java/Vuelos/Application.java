package Vuelos;

import Vuelos.logic.*;
import Vuelos.presentation.VuelosView;
import Vuelos.presentation.VuelosModel;
import Vuelos.presentation.VuelosController;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ignored) {
        };

        JFrame window = new JFrame();

        VuelosView view = new View();
        VuelosModel model = new Model();
        VuelosController controller = new Controller(model, view);


    }
}
