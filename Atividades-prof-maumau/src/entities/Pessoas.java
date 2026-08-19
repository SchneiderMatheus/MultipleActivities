package entities;

public class Pessoas {
    private Double altura;
    private Double peso;

    
    public Pessoas(Double altura, Double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double calcularImc(Double altura,Double peso){
        return peso / (altura *altura);
    }

    public Double imcResult(){
        double imc = calcularImc(altura, peso);
        if (imc >= 25) {
            System.out.print("Voce está fortinho seu IMC é");
        } 
        if (imc >=19 && imc<=24){
            System.out.print("Ta saúdavel e seu IMC é ");
        }
        if (imc<19){
            System.out.print("Ta fino de mais paizão seu imc é ");
        }
        
        return imc;
    }
}
