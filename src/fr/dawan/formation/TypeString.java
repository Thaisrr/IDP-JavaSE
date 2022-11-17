package fr.dawan.formation;

import java.util.Scanner;

public class TypeString {

    public static void main(String[] args) {
        
        /* Les caractères : type primitif
         * type char
         *      - 16bits / 2octets
         *      - Accepte : 
         *          - 1 un caractère
         *          - caractères unicode 
         *          - ou hexadecimal
         *      - valeur par défaut : 'a'    
         * 
         */
        
        char a = 'a'; // On utilise des simples quotes
        System.out.println(a);
        
        a = 0x00061; // 'a' en hexadécimal
        
        a = '\u0061'; // 'a' en unicode
        // https://fr.wikipedia.org/wiki/Table_des_caract%C3%A8res_Unicode_(0000-0FFF)
        
        System.out.println(a); // a
        a++;
        System.out.println(a); // b
       
        
        // Caractères d'échappement
        /*
         * Certains caractères servent à passer des instructions particulère au compiler
         * Ces caractères sont précédés d'un backslash \ qui sert à les échapper
         * Echapper : modifier son sens classique
         */
        
        char quote = '\''; // le caractère '
        String guillemet = "\""; // le caractère "
        char backslash = '\\'; // le caractère \
        
        char esc = 'n'; // caractère n
        esc = '\n'; // saut de ligne
        /*
         * \n new line
         * \t tabulation
         * ...
         */
        
        
        
        // String 
        /*
         * Chaîne de caractères
         */
        
        String name = "Jane Doe";
        String greetings = "Bonjour";
        
        // Concaténation
        System.out.println(greetings + " " + name );
        // 3 strings collées
        
        int age = 121;
        System.out.println(name + " a " + age + " ans");
        // Le caste d'un int vers une String est implicite
        
        // int nope = (int) name;
        // On ne peut pas caster une String en int
        
                
        // String est une classe
        // Elle nous offre différentes méthodes : 
        
        
        System.out.println(name.toUpperCase()); // MAJUSCULES
        System.out.println(name); // normal, non modifiée
        
        System.out.println(name.toLowerCase()); // minuscules
        
        System.out.println(name.length()); // taille de la string
        System.out.println(name.equals("Jane Doe")); // true ou false
        
        System.out.println(name.compareTo("Jane Doe !")); // -2 : nameà 2 caractères différents de la chaine comparée
        System.out.println(name.compareToIgnoreCase("Jane doe")); // 0
        
    
    
        String[] splitted = name.split(" "); // ["Jane", "Doe"]
        splitted = name.split(""); // Coupe caractère par caractère ["J", "a", "n", ....]
        
        String sub = name.substring(5); // Va chercher, à partir du char 5, tout le reste de la chaîne
        System.out.println(sub); // Doe
        
        System.out.println(name.charAt(0)); // "J"
        
        System.out.println(name.indexOf("e")); //Va chercher l'index du 1er char trouvé correspondant
        
        // Toutes les méthodes de string
       // https://www.w3schools.com/java/java_ref_string.asp
        
        
        // Communiquer avec l'utilisateur⋅trice
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entrez votre prenom : ");
        String firstname = scan.next();
        String lastname = scan.next();
        
        scan.nextLine();
        
        System.out.println("Bonjour " + firstname + " | " + lastname);
        
        System.out.println("Entrez votre prenom : (again)");
        
        String username = scan.nextLine();
       
        System.out.println("Vous êtes " + username);
        
        System.out.println("Age ?");
        
        int userage = scan.nextInt();
        System.out.println("Vous avez " + userage);

        

    }

}
