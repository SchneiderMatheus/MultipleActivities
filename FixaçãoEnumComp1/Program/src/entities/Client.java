package entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private String email;
    private String birthDate;
    
    public Client(String name, String email, String birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getBirthDate() {
        return birthDate;
    }

    public LocalDate getFormattedBirthDate(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConvertida = LocalDate.parse(birthDate,fmt);
        return  dataConvertida;
    }
    public String toString(){
        return name + ", " + email + "," + birthDate;
    }

    
}
