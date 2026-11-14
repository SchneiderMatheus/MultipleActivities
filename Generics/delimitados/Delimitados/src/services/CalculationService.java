package services;

import java.util.List;

import entities.Product;

public class CalculationService {
    public static Integer max(List<Product> list){ // está recendo como argumento uma lista inteira?
        if (list.isEmpty()) {
            throw new IllegalStateException("List Can't be amppty");
        }
        Product max = list.get(0);
        for (Product product : list) {
            if (product.compareTo(max)>0) {
                max = product;
            }
        }
        return max;
    }
}
