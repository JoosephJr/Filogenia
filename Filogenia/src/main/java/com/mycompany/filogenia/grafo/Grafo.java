package com.mycompany.filogenia.grafo;

import javax.swing.*;
import java.util.ArrayList;

public class Grafo<TIPO> {

    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;
    private double filtroPeso;

    public Grafo() {
        setFiltroPeso(7.0);
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.arestas = new ArrayList<Aresta<TIPO>>();
    }


    public void setFiltroPeso(double filtroPeso) {
        this.filtroPeso = filtroPeso;
    }

    public double getFiltroPeso() {
        return filtroPeso;
    }

    public void adicionarVertice(TIPO dado) {
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Double peso, TIPO dadoInicio, TIPO dadoFim) {
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public Vertice<TIPO> getVertice(TIPO dado) {
        Vertice<TIPO> vertice = null;
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getDado().equals(dado)) {
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }

    public void BuscaEmLargura(JTextPane txtPane){
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();
        Vertice<TIPO> atual = this.vertices.get(0);
        marcados.add(atual);


        System.out.println(atual.getDado());
        txtPane.setText(atual.getDado()+"\n");
        fila.add(atual);

        while(fila.size() > 0){
            Vertice<TIPO> visitado = fila.get(0);

                for (int i = 0; i < visitado.getArestaSaida().size(); i++) {
                    Vertice<TIPO> proximo = visitado.getArestaSaida().get(i).getFim();
                    Aresta<TIPO> aresta = visitado.getArestaSaida().get(i);

                    if(!marcados.contains(proximo) && aresta.getPeso() >= filtroPeso){
                        marcados.add(proximo);
                        System.out.println(proximo.getDado());
                        txtPane.setText(txtPane.getText() + proximo.getDado() + "\n");
                        txtPane.setCaretPosition(txtPane.getDocument().getLength());
                        fila.add(proximo);
                    }
                }
            fila.remove(0);
        }
    }
}