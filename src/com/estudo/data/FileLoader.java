package com.estudo.data;

public class FileLoader implements DataLoader, RemoveLoader{
    @Override
    public void loader() {
        System.out.println("CARREGANDO ARQUIVOS DO BANCO DE DADOS");
    }

    @Override
    public void remove() {
        System.out.println("REMOVENDO ARQUIVO SELECIONADO DO BANCO DE DADOS");
    }
}
