package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        String nombre = null;
        int nota;
        BufferedReader t1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese su nombre:  ");
        try {
            nombre= t1.readLine();              //TryCatch para controlar la variable del nombre
        } catch (IOException e) {
            nombre="A";
        }

        System.out.print("Ingrese su nota:  ");
        try{
            nota=Integer.parseInt(t1.readLine());
        }catch (Exception e) {
            System.out.println("Calificacion invalida");   //TryCatch para controlar la nota
            nota=-1;
        }
        if(nombre.matches(".*\\d+.*")){
            System.out.println("Tiene un numero en algun lugar");           //If para controlar el tipo de nombre
            System.out.println("Nombre invalido");
        }else{
            System.out.println("Su nombre es : " + nombre);
        }

        if (nota >0 && nota<101){
            if(nota>=91){
                System.out.println("Calificacion es: A");
            } else if (nota >= 81) {
                System.out.println("Calificacion es: B");             //Calculo de la letra de la calificaión
            }else if (nota >= 71) {
                System.out.println("Calificacion es: C");
            }else
                System.out.println("Calificación: F");
        }else{
            System.out.println("Valores invalidos");
        }

    }
}

