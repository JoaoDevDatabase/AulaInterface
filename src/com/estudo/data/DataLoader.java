package com.estudo.data;

public interface DataLoader {
   void loader();
   default void connection(){
      System.out.println("CONECTADO AO BANCO DE DADOS MYSQL");
   }

}
