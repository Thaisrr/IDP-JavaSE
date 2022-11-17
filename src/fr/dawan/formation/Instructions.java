package fr.dawan.formation;

public class Instructions {

    public static void main(String[] args) {
        
        // Les Conditions
        
        int a = 10;
        
        if(a > 50) {
            System.out.println("C'est un grand nombre");
        } else if(a == 50) {
            System.out.println("C'est un nombre moyen");
        } else if(a < 50 && a >= 0) {
            System.out.println("C'est un petit nombre");
        } else {
            System.out.println("C'est plus petit que 0");
        }
        
        
        String day = "samedi";
        
        // Switch
        switch (day) {
        case "lundi":
            System.out.println("Oh no !");
            break;
        case "mardi" :
        case "mercredi" :
            System.out.println("Demain est un autre jour"); 
            break;
        case "jeudi" :
            System.out.println("*Dead*");
        case "vendredi" :
            System.out.println("Almost the end !");
            break;
        default:
            System.out.println("Week End !");
        }
        
        
        int age = 30;
        
        // Le ternaire : retourne 2 valeurs possibles en fonction d'une condition
        
        // WTF ::          What ?      True             False
        String ternaire = (true)? "valeur si true" : "valeur si false";
        
        String message = (age > 140)? "Vous êtes vachement vieux⋅vieille !" : "ça passe !";
        
        int truc = true? 10 : 20;
        
        
        /****** Les Boucles ************************/
        
        
        for(int i = 1; i <= 10; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i); 

        }
        
        for(int i = 0; i < 5; i++) {
            System.out.println("\u001B[34m First Boucle : " + i + "\u001B[0m");
            for(int k = 0; k < 5; k++) {
                if(k == 3) {
                    break; // Stop la boucle k
                }
                System.out.println("I : " + i + "--- K : " + k);
            }
        }
        
        
        System.out.println("-------------------- \n");

        FIRST_LOOP: 
        for(int i = 0; i < 5; i++) {
            System.out.println("\u001B[34m First Boucle : " + i + "\u001B[0m");
            for(int k = 0; k < 5; k++) {
                if(k == 3) {
                    break FIRST_LOOP; // Stop la boucle i                
                }
                System.out.println("I : " + i + "--- K : " + k);
            }
        }
        
        
        
        // While
        int l = 0;
        while(l > 0) {
            System.out.println("-- while : " + l);
            l--;
        }
        
        do {
            System.out.println("-- while : " + l);
            l++;
        } while (l < 5);
        
        

    }

}
