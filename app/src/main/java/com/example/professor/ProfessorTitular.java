package com.example.professor;

public class ProfessorTitular extends Professor {
    private int anosInstituicao;
    private double salarioBase;

    public ProfessorTitular(int anosInstituicao, double salarioBase) {
        this.anosInstituicao = anosInstituicao;
        this.salarioBase = salarioBase;
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcSalario() {
        int incremento = anosInstituicao / 5;
        return salarioBase * (1 + (incremento * 0.05));
    }
}
