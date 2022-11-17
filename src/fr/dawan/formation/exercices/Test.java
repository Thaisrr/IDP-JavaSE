package fr.dawan.formation.exercices;

import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int nombreSaisi, nombreDevine;

        final int MAX = 100;

        Scanner in = new Scanner(System.in);

        Random rand;

        boolean correct = false;

        
        
        //System.out.println(nombreDevine);

        do {
            correct = false;
            rand = new Random();
            nombreDevine = rand.nextInt(MAX) + 1;


            while (!correct) {

                System.out.println("Devinez un nombre entre 0 et 100 : ");

                nombreSaisi = in.nextInt();

                if (nombreSaisi < nombreDevine) {

                    System.out.println("Trop bas");

                } else if (nombreSaisi > nombreDevine) {

                    System.out.println("Trop haut");

                } else if (nombreSaisi == nombreDevine) {

                    System.out.println("!! gagné !!");

                    correct = true;
                 
                } else {

                    System.out.println("error");
                }

            }

            System.out.println("Réessayer ? y: yes, n: no");

        } while (in.next().toLowerCase().equals("y") || in.next().toLowerCase().equals("yes"));

        System.out.println("Bye !");

    }
    
    }