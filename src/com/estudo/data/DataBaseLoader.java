package com.estudo.data;

public class DataBaseLoader implements DataLoader, RemoveLoader, AddQuery{
    @Override
    public void loader() {
        System.out.println("CARREGANDO BANCO DE DADOS");
    }

    @Override
    public void remove() {
        System.out.println("REMOVENDO QUERY DO BANCO DE DADOS");
    }

    @Override
    public void add() {
        System.out.println("ADICIONANDO NOVA QUERY NESTE BANCO DE DADOS");
    }
}
