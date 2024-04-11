package br.ufrn.imd;

public class Funcionario {
    private int chMensal; // carga horária mensal
    private double hh; // valor da hora de trabalho

    public Funcionario(int chMensal, double hh) {
        this.chMensal = chMensal;
        this.hh = hh;
    }

    public double calcularSalario() {
        return chMensal * hh;
    }
}
