package org.example;

public abstract class Funcionario {

    private String nome;
    private int salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTipo() {
        return "Ativo";
    }

    public int calcularPlanoSaude() {
        return (int) (this.salario*0.1);
    }

    public String getInfo() {
        return getTipo() + "{" +
               "nome='" + this.nome + '\'' +
                ", salario=" + this.salario +
                ", plano saúde=" + this.calcularPlanoSaude() +
                '}';
    }
}
