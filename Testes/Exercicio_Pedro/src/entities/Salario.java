package entities;

public class Salario {
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    private Float valorMao = 0.0f;

    public void setVM(Float valor){
        this.valorMao = valor;
    }

    private Integer qtdMao = 0;

    public void setQtdM(Integer qtd){
        this.qtdMao = qtd;
    }

    private Float valorPe = 0.0f;

    public void setVP(Float valor){
        this.valorPe = valor;
    }

    private Integer qtdPe = 0;

    public void setQtdP(Integer qtd){
        this.qtdPe = qtd;
    }

    private Float salarioTotal() {
        float calculo, totalMao, totalPe;
        totalMao = this.qtdMao * this.valorMao;
        totalPe = (this.qtdPe * this.valorPe);
        
        calculo = (totalMao + totalPe)/2;

        return calculo;
    }

    @Override
    public String toString(){
        return "O salário da manicure " + this.nome + " é: " + this.salarioTotal();
    }
}