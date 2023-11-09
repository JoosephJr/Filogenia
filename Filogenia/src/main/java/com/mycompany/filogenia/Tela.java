package com.mycompany.filogenia;

import com.mycompany.filogenia.grafo.Grafo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela {
    public JPanel panelMain;
    private JLabel Teste;
    private JButton button1;
    private JTextPane txtPane;
    private JRadioButton rbtn7;
    private JRadioButton rbtn6;
    private JRadioButton rbtn5;
    private JRadioButton rbtn4;
    private JRadioButton rbtn3;
    private JRadioButton rbtn2;
    private JRadioButton rbtn1;
    private Grafo<String> grafo;
    public Tela(Grafo<String> grafo) {
        this.grafo = grafo;

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                grafo.BuscaEmLargura(txtPane);

            }
        });
        rbtn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPane.setText(" ");
                grafo.setFiltroPeso(7.0);
            }
        });
        rbtn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPane.setText(" ");
                grafo.setFiltroPeso(6.0);
            }
        });
        rbtn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPane.setText(" ");
                grafo.setFiltroPeso(5.0);
            }
        });
        rbtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPane.setText(" ");
                grafo.setFiltroPeso(4.0);
            }
        });
        rbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPane.setText(" ");
                grafo.setFiltroPeso(3.0);
            }
        });
        rbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPane.setText(" ");
                grafo.setFiltroPeso(2.0);
            }
        });
        rbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPane.setText(" ");
                grafo.setFiltroPeso(1.0);
            }
        });
    }
}
