package entities;

public class Alunos {
    private String name;
    private Integer matricula;
    private Double nota1;
    private Double nota2;
    private Double media;

    public Alunos(String name, Integer matricula, Double nota1, Double nota2) {
        this.name = name;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        calcularMedia(nota1, nota2);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    public Double getNota1() {
        return nota1;
    }
    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }
    public Double getNota2() {
        return nota2;
    }
    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    public void calcularMedia(Double nota1, Double nota2){
        this.media = (nota1 + nota2)/2;
    }
    public Double getMedia() {
        return media;
    }
   
    public String toString(){
        return "Name: "+getName() +"\nMatrícula: "+ getMatricula()+"\nMédia: " + getMedia();
    }
}
