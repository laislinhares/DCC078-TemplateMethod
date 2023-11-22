package org.example;

public class Aposentado extends Funcionario {

    @Override
    public String getTipo() {
        return "Aposentado";
    }

    @Override
    public int calcularPlanoSaude() {
        return (int) (this.getSalario()*0.2);
    }

}
