package org.example;

public class Caminhao extends VeiculoTerrestre{
    //    Nome: Arthur Ryuiti Sato Furukawa
//    TIA: 42209013 // RA: 10409106
//
//    Nome: Guilherme Florio Vieira
//    TIA: 42227917 // RA: 10409698
//
//    Otavio Augusto Freire de Andrade Bruzadin
//    TIA: 42208165 // RA: 10409053
    private int totalDeEixos;
    Caminhao(int ano, String cor, int totalDeEixos) {
        super(ano, cor);
        this.totalDeEixos = totalDeEixos;
    }

    public int getTotalDeEixos() {
        return totalDeEixos;
    }

    public void setTotalDeEixos(int totalDeEixos) {
        this.totalDeEixos = totalDeEixos;
    }
    @Override
    public String toString() {
        String string = "Caminhao: ano = "+this.getAno()+", cor = "+ this.getCor() +", Eixos = "+ this.getTotalDeEixos()+";";
        return string;
    }
}
