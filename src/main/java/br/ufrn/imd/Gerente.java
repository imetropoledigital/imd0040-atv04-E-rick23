package br.ufrn.imd;

public class Gerente extends Funcionario {
    public enum Nivel {
        JUNIOR, PLENO, SENIOR
    }

    private Nivel nivel;

    public Gerente(int chMensal, double valorHora, Nivel nivel) {
        super(chMensal, valorHora);
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double bonus = 0;

        switch (nivel) {
            case JUNIOR:
                bonus = 1000;
                break;
            case PLENO:
                bonus = 2000;
                break;
            case SENIOR:
                bonus = 3000;
                break;
        }

        return salarioBase + bonus;
    }
}
