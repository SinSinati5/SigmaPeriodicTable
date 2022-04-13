package com.company;

import java.awt.*;
import javax.swing.*;

public class popUp extends JFrame  {

    //Fields
    private JPanel contentPane;
    private JTable tab;
    //Constructor
    public popUp(String atom, String weight, String name, String sym, String mel, String boi, String group, String ion, String elec){
        this.setTitle("Sigma " + name);
        this.setSize(1000,500);

        contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1300,35));
        contentPane.setBackground(new Color(192,192,192));
        String[] columnNames = { "Atomic Number", "Weight", "Name", "Symbol", "Melting Point", "Boiling Point", "Group", "Ionization Energy", "Electron Configuration" };

        String[][] data = {
                columnNames,
                { atom, weight, name, sym, mel, boi, group, ion, elec}
        };



        tab = new JTable(data, columnNames);
        tab.setBounds(0, 0, 1300, 35);
        contentPane.add(tab);
        //THIS SECTION OF CODE MUST BE AT THE VERY BOTTOM OF YOUR CONSTRUCTOR!
        //setting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
}

