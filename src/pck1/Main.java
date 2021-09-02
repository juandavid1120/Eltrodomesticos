package pck1;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        boolean finalizarPrograma = true, isTDT;
        int N=-1, opc=-1;
        String marca, procedencia, consumo, TDT;
        double capacidad=-1, tamaño=-1;

        while (finalizarPrograma == true) {
            System.out.println("ingrese el nro de  eletrodomesticos a ingresar");
            N = sc.nextInt();
            Eletrodomestico vecEletro[] = new Eletrodomestico[N];
            for (int i = 0; i <= N; i++) {

                System.out.println("ingrese que tipo de eletrodomestic\n" +
                        "1: Nevera\n" +
                        "2:TV \n" +
                        "3:Otro");
                opc = sc.nextInt();

                System.out.println("Que tipo de consumo es(A,B,C)");
                consumo = sc.nextLine();
                System.out.println("Que procedencia de consumo es(NACIONAL,IMPORTADO)");
                procedencia = sc.nextLine();
                consumo.toUpperCase(Locale.ROOT);
                procedencia.toUpperCase(Locale.ROOT);

                switch (opc) {
                    case 1:
                        System.out.println("Que marca es la nevera");
                        marca = sc.nextLine();
                        System.out.println("Que capacidad es la nevera");
                        capacidad = sc.nextDouble();
                        vecEletro[i] = new Nevera(consumo, procedencia, marca, capacidad);
                        break;
                    case 2:
                        System.out.println("Que marca es la televisor");
                        marca = sc.nextLine();
                        System.out.println("Que capacidad es tamaño");
                        tamaño = sc.nextDouble();
                        System.out.println("¿Tiene TDT?(SI=0,NO=1)");
                        TDT = sc.nextLine();
                        isTDT = (TDT.compareToIgnoreCase("si") == 0) ? true : false;
                        vecEletro[i] = new Televisor(consumo, procedencia, marca, tamaño, isTDT);
                        break;
                    case 3:
                        System.out.println("que nombre tiene el eletrodomestico");
                        marca = sc.nextLine();
                        vecEletro[i] = new Eletrodomestico(consumo, procedencia);
                        break;


                    default:
                        System.out.println("ERROR! Ingreso una opcion incorrecta");
                        break;
                }


            }
            for (Eletrodomestico e:vecEletro) {
                System.out.println(e.toString());

            }
            int finalizar=-1;
            System.out.println("¿Quiere quiere finalizar el programa?(Si: 0,No: 1)");
            finalizar= sc.nextInt();
            finalizarPrograma=finalizar==1? false:true;

        }
    }


}
