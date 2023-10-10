package Vuelos.presentation;

import Vuelos.logic.*;
import Vuelos.presentation.VuelosController;
import Vuelos.presentation.VuelosModel;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;

public class VuelosView implements Observer {

    private JPanel panel1;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JTextField textField1;
    private JButton buscarButton;
    private JTable table1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;

    public JPanel getPanel1() {
        return panel1;
    }


    public VuelosView() {
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }



    public View(){
        initComponents();
        guardarButton.setEnabled(false);
        limpiarButton.addActionListener(new ActionListener() {


        }
    }


}
