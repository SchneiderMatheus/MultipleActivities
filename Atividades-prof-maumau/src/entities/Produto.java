package entities;

public class Produto {
    private Integer codigo;
    private String nome;
    private Double preço;
    private Integer quantidade;

    public Produto(Integer codigo, String nome, Double preço, Integer quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    

    
}
