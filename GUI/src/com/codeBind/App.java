package com.codeBind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    //Botones
    private JButton buttonMsg;
    private JPanel PanelMain;

    public static void main(String[] args) {
        //Objeto tipo ventana
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    //Metodo que le da funcion al boton cuando recive un clic
    public App() {
        buttonMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mensaje impreso al precionar el boton
                JOptionPane.showMessageDialog(null, "Hola mundo");
            }
        });
    }

}
