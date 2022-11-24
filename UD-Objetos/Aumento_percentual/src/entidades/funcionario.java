package entidades;

public class funcionario {

    public String nome;
    public double salario;
    public double imposto;

    public double SalarioBruto(){
        return salario - imposto;
    }
    public void AumentaSalario(double per){
        salario = salario + (salario*(per/100.00));
    }
    public String toString(){
        return nome
        + ", $ "
        +String.format("%.2f",SalarioBruto());
    }

}