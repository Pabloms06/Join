package com.cbellmont;

import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
try{
        Camarero camarero = new Camarero();
        Cliente cliente = new Cliente(camarero);
        // Es importante que empiece el camarero ya que se queda esperando.
        camarero.start();
        cliente.start();
        camarero.join();
        cliente.join();
    }catch(InterruptedException e){
          e.printStackTrace();
}


}
