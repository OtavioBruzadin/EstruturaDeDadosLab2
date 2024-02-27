package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        Nome: Arthur Ryuiti Sato Furukawa
//        TIA: 42209013 // RA: 10409106
//
//        Nome: Guilherme Florio Vieira
//        TIA: 42227917 // RA: 10409698
//
//        Otavio Augusto Freire de Andrade Bruzadin
//        TIA: 42208165 // RA: 10409053

        VeiculoTerrestre veiculoTerrestre = new VeiculoTerrestre(89,"preto");
        List<VeiculoTerrestre> listaVeiculos = new ArrayList<>();


        CarroDePasseio carroDePasseio1 = new CarroDePasseio(1990,"Azul",5);
        listaVeiculos.add(carroDePasseio1);

        CarroDePasseio carroDePasseio2 = new CarroDePasseio(2004,"Cinza",4);
        listaVeiculos.add(carroDePasseio2);

        CarroDePasseio carroDePasseio3 = new CarroDePasseio(2010,"Preta",5);
        listaVeiculos.add(carroDePasseio3);

        CarroDePasseio carroDePasseio4 = new CarroDePasseio(2009,"Preta",7);
        listaVeiculos.add(carroDePasseio4);

        Caminhao caminhao1 = new Caminhao(1999,"Verde",4);
        listaVeiculos.add(caminhao1);

        Caminhao caminhao2 = new Caminhao(2011,"Verde",4);
        listaVeiculos.add(caminhao2);

        Caminhao caminhao3 = new Caminhao(2000,"Azul",4);
        listaVeiculos.add(caminhao3);

        Caminhao caminhao4 = new Caminhao(2005,"Preto",5);
        listaVeiculos.add(caminhao4);
        System.out.println("Carros de passeios de antes de 2010 e que comportam 5 passageiros:\n");
        for (int i = 0; i < listaVeiculos.size(); i++) {

            if (listaVeiculos.get(i) instanceof CarroDePasseio ){
                    if (((CarroDePasseio) listaVeiculos.get(i)).getTotalDePassageiros() >= 5 && listaVeiculos.get(i).getAno()<2010){
                        System.out.println(listaVeiculos.get(i));
                    }
            }
        }
        int total = 0;
        System.out.println("\n");
        for (int i = 0; i < listaVeiculos.size(); i++) {

            if (listaVeiculos.get(i) instanceof Caminhao ){
                if (((Caminhao) listaVeiculos.get(i)).getTotalDeEixos() == 4 && Objects.equals(listaVeiculos.get(i).getCor(), "Verde")){
                    total++;
                }
            }
        }
        System.out.println("total de caminhoes que tem 4 eixos e sao verdes: "+ total);
    }
}