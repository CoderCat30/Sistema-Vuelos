package Vuelos.presentation;

import Vuelos.logic.*;
import Vuelos.presentation.VuelosController;
import Vuelos.presentation.VuelosModel;


import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Observer;

public class VuelosView implements Observer {

    private JPanel panel1;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JTextField textField1;
    private JButton buscarButton;
    private JTable table1;

    public JPanel getPanel1() {
        return panel1;
    }

    public View(){
        initComponents();
        guardarButton.setEnabled(false);
        limpiarButton.addActionListener(new ActionListener() {


        }
    }


}
