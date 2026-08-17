package br.com.senai.patrimonio.model;

public class Endereco {

    private String rua;
    private String numero;
    private String compemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(){
    }

    public Endereco(String rua, String numero, String compemento, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.compemento = compemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
}
