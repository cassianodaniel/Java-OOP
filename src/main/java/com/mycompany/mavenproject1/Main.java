
package com.mycompany.mavenproject1;

public class Main {
    public static void main(String[] args){
        System.out.println("It is working!!");
        Sleep s1 = new Sleep();
        int horas = 2, minutos = 44, segundos = 30;
        s1.menu();
        s1.setarhora(horas, minutos, segundos);
    }
}
