package Entidades;

public class Aluno{

    public String name;
    public double[] notas = new double[3];

    public double NotaFinal(){
        return notas[0] + notas[1] + notas[2];
    }
    public double Falta(){
        if(NotaFinal()<60){
            return 60 - NotaFinal();
        }
        else{
            return 0.0;
        }
    }

}