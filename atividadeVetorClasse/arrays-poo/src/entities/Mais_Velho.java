package entities;

public class Mais_Velho {
    private String name;
    private int age;
    
    public Mais_Velho(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Nome: "+name+", Idade: "+ age;
    }
}
