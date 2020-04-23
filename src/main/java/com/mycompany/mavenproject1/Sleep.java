package com.mycompany.mavenproject1;
public class Sleep {
    String frase;
    int hora;
    int minuto;
    int segundo;    

    void menu(){
        this.frase = "Olá! Este é o menu de aplicações automáticas!\nTeste de alinhamento";
        System.out.println(this.frase);
    }
    
    void setarhora(int h,int m,int s){
        System.out.println("Esta é a hora que você atribuiu: \n");
        System.out.println(h + ":" + m + ":" + s);
    }
}