package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Integer> lista = new ArrayList<>();

    public void addValue(int value){
        lista.add(value);
    }

    public int first(){
        return lista.getFirst();
    }

    public void print(){
        System.out.println(lista);
        System.out.println("First: "+first());
    }
    
}
