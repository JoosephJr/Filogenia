package com.mycompany.filogenia;

import com.mycompany.filogenia.grafo.Grafo;

public class Filogenia {

    public static void main(String[] args) {
        Grafo filogenia = new Grafo();

        filogenia.adicionarVertice("Sahelanthropus tchadensis");
        filogenia.adicionarVertice("Orrorin tugenensis");
        filogenia.adicionarVertice("Ardipithecus kadabba");
        filogenia.adicionarVertice("Ardipithecus ramidus");
        filogenia.adicionarVertice("Australopithecus anamensis");
        filogenia.adicionarVertice("Australopithecus afarensis");
        filogenia.adicionarVertice("Australopithecus garhi");
        filogenia.adicionarVertice("Paranthropus aethiopicus");
        filogenia.adicionarVertice("Australopithecus bahrelghazali");
        filogenia.adicionarVertice("Australopithecus africanus");
        filogenia.adicionarVertice("Paranthropus boisei");
        filogenia.adicionarVertice("Kenyanthropus platyops");
        filogenia.adicionarVertice("Homo georgicus");
        filogenia.adicionarVertice("Homo habilis");
        filogenia.adicionarVertice("Homo rudolfensis");
        filogenia.adicionarVertice("Paranthropus robustus");
        filogenia.adicionarVertice("Homo ergaster");
        filogenia.adicionarVertice("Homo erectus");
        filogenia.adicionarVertice("Homo cepranensis");
        filogenia.adicionarVertice("Homo heidelbergensis");
        filogenia.adicionarVertice("Homo neanderthalensis");
        filogenia.adicionarVertice("Homo antecessor");
        filogenia.adicionarVertice("Homo floresiensis");
        filogenia.adicionarVertice("Homo sapiens");

        //7 MYA
        filogenia.adicionarAresta(7.0, "Sahelanthropus tchadensis", "Orrorin tugenensis");

        //6 MYA
        filogenia.adicionarAresta(6.0, "Sahelanthropus tchadensis", "Ardipithecus kadabba");
        filogenia.adicionarAresta(6.0, "Sahelanthropus tchadensis", "Ardipithecus ramidus");

        //5 MYA
        filogenia.adicionarAresta(5.0, "Ardipithecus ramidus", "Australopithecus anamensis");

        //4 MYA
        filogenia.adicionarAresta(4.0, "Australopithecus anamensis", "Australopithecus afarensis");
        filogenia.adicionarAresta(4.0, "Australopithecus anamensis", "Australopithecus bahrelghazali");

        //3 MYA
        filogenia.adicionarAresta(3.0, "Australopithecus afarensis", "Paranthropus aethiopicus");
        filogenia.adicionarAresta(3.0, "Australopithecus afarensis", "Australopithecus garhi");
        filogenia.adicionarAresta(3.0, "Australopithecus afarensis", "Australopithecus africanus");

        filogenia.adicionarAresta(3.0, "Paranthropus aethiopicus", "Paranthropus boisei");
        filogenia.adicionarAresta(3.0, "Paranthropus aethiopicus", "Paranthropus robustus");

        //2 MYA
        filogenia.adicionarAresta(2.0, "Australopithecus africanus", "Homo habilis");
        filogenia.adicionarAresta(2.0, "Australopithecus garhi", "Homo habilis");
        filogenia.adicionarAresta(2.0, "Australopithecus garhi", "Homo rudolfensis");
        filogenia.adicionarAresta(2.0, "Homo habilis", "Homo georgicus");
        filogenia.adicionarAresta(2.0, "Homo georgicus", "Homo ergaster");

        //1 MYA
        filogenia.adicionarAresta(1.0, "Homo ergaster", "Homo erectus");
        filogenia.adicionarAresta(1.0, "Homo ergaster", "Homo antecessor");
        filogenia.adicionarAresta(1.0, "Homo ergaster", "Homo cepranensis");
        filogenia.adicionarAresta(1.0, "Homo antecessor", "Homo heidelbergensis");
        filogenia.adicionarAresta(1.0, "Homo heidelbergensis", "Homo neanderthalensis");
        filogenia.adicionarAresta(1.0, "Homo heidelbergensis", "Homo sapiens");



        filogenia.BuscaEmLargura();

    }
}
