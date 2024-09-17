package src.domin;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private Long id;
    private String nome;
    private String cor;
    private String dataFabricacao;
    private List<Periferico> perifericos;

    public Computador(Long id, String nome, String cor, String dataFabricacao) {
        this.id = id;
        this.nome = nome;
        this.cor = cor;
        this.dataFabricacao = dataFabricacao;
        this.perifericos = new ArrayList<>();
    }

    // adicionar e remover
    public void addPeriferico(Periferico item) {
        perifericos.add(item);
        System.out.println("Periférico " + item.getNome() + " adicionado.");
    }

    public void removePeriferico(Periferico item) {
        if (perifericos.remove(item)) {
            System.out.println("Periférico " + item.getNome() + " removido.");
        } else {
            System.out.println("Periférico " + item.getNome() + " não encontrado.");
        }
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public List<Periferico> getPerifericos() {
        return perifericos;
    }
}

