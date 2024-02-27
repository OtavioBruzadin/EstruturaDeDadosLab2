package org.example;

public class CarroDePasseio extends VeiculoTerrestre{
//    Nome: Arthur Ryuiti Sato Furukawa
//    TIA: 42209013 // RA: 10409106
//
//    Nome: Guilherme Florio Vieira
//    TIA: 42227917 // RA: 10409698
//
//    Otavio Augusto Freire de Andrade Bruzadin
//    TIA: 42208165 // RA: 10409053
    private int totalDePassageiros;
    CarroDePasseio(int ano, String cor, int totalDePassageiros) {
        super(ano, cor);
        this.totalDePassageiros = totalDePassageiros;
    }

    public int getTotalDePassageiros() {
        return totalDePassageiros;
    }

    public void setTotalDePassageiros(int totalDePassageiros) {
        this.totalDePassageiros = totalDePassageiros;
    }
    @Override
    public String toString() {
        String string = "Carro de Passeio: ano = "+this.getAno()+", cor = "+ this.getCor() +", Passageiros = "+ this.getTotalDePassageiros()+";";
        return string;
    }
}
