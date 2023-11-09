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
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private Grafo<String> grafo;
    public Tela(Grafo<String> grafo) {
        this.grafo = grafo;

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grafo.BuscaEmLargura(txtPane);

            }
        });
    }
}
