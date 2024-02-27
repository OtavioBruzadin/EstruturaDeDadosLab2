package org.example;

public class VeiculoTerrestre {

    //    Nome: Arthur Ryuiti Sato Furukawa
//    TIA: 42209013 // RA: 10409106
//
//    Nome: Guilherme Florio Vieira
//    TIA: 42227917 // RA: 10409698
//
//    Otavio Augusto Freire de Andrade Bruzadin
//    TIA: 42208165 // RA: 10409053
    private int ano;
    private String cor;

    VeiculoTerrestre(int ano, String cor){
        this.ano = ano;
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        String string ="Cor:"+ this.getCor() + " Ano:"+this.getAno();
        return string;
    }
}
