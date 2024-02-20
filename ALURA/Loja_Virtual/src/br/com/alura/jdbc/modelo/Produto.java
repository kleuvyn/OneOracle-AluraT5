package br.com.alura.jdbc.modelo;

public class Produto {

    private String Id;
    private String nome;
    private  Float preco_lista;

    public Produto(String Id, String nome, Float preco_lista) {
        super();
        this.Id = Id;
        this.nome = nome;
        this.preco_lista = preco_lista;

    }

    public void setId(String id) {
        this.Id = this.Id;

    }

    public String getId() {
        return Id;

    }
    public String getNome() {
        return nome;

    }
    public Float getPreco_lista() {
        return preco_lista;

    }

    public String toString(){
        return String.format("O produto criado é: %s, %s, %.2f",
                this.Id, this.nome, this.preco_lista);

    }
}
