package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Object> lista = new ArrayList<>();
    

    public PrintService() {
    }

    public void addValue(Object value){
        lista.add(value);
    }

    public Object first(){
        return lista.getFirst();
    }

    public void print(){
        System.out.println(lista);
        System.out.println("First: "+first());
    }
    
}
