package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> lista = new ArrayList<>();
    

    public PrintService() {
    }

    public void addValue(T value){
        lista.add(value);
    }

    public T first(){
        return lista.getFirst();
    }

    public void print(){
        System.out.println(lista);
        System.out.println("First: "+first());
    }
    
}
