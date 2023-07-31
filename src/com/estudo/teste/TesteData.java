package com.estudo.teste;

import com.estudo.data.DataBaseLoader;
import com.estudo.data.FileLoader;

public class TesteData {
    public static void main(String[] args) {
        //VAMOS IMPORTAR NOSSAS INTERFACES E OS METODOS QUE NA QUAL CRIAMOS !!
        DataBaseLoader data = new DataBaseLoader();
        FileLoader file = new FileLoader();
        data.connection();
        data.loader();
        data.remove();
        file.loader();
        file.remove();
        data.add();
    }
}
