package entities;

import java.sql.Date;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;
    
    public Client(String name, String email, LocalDate birthDate) {
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

    public String getFormattedBirthDate(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return birthDate.format(fmt);
    }

    
}
