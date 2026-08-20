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

    public String imcResult(){
        double imc = calcularImc(altura, peso);
        if (imc >= 25) {
            return"Voce está fortinho seu IMC é"+imc;
        } 
        if (imc >=19 && imc<=24){
            return "Ta saúdavel e seu IMC é "+imc;
        }
        if (imc<19){
            return "Ta fino de mais paizão seu imc é "+imc;
        }
        return null;
        
    }
}
