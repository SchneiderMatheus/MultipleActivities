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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public String toString(){
        return "Codigo: "+getCodigo()+", Nome: "+getNome()+", Preço: "+getPreço()+" Estoque do produto: "+getQuantidade();
    }
    
}
