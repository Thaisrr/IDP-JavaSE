package fr.dawan.formation;

public class TypeBoolean {

    public static void main(String[] args) {
        
        /* Boolean : true / false
         * Valeur binaire, qui ne peut avoir que 2 valeurs possible : vrai ou faux
         * 
         */

        boolean bool = true;
        
        /* Opérateurs conditionnels
         *     == égalité
         *     != différence
         *     > < supérieur à / inférieur à 
         *     >= <=   supérieur ou égal / inférieur ou égal
         *     
         *     ||   OU
         *     && et
         *     ! Non logique -> retourne true si une condition est fausse
         */
        
        
        bool = !bool;
        
        bool = 4 < 10; // true
        
        bool = !false; // true
        bool = !(4 < 10); // false
        
        bool= 10 == 9 || 10 < 20; // true
        bool = 10 == 9 && 10 < 20; // false
        
        bool = true == !false; // true
        bool = true == !false && !true; // false
        
        System.out.println(bool);
        
        
        /*************/
        
        String a = "Hello World";
        String b = "Hello ";
        b += "World";
        
        System.out.println(a == b);  // false : vérifie en mémoire

    
        System.out.println(a.equals(b)); // true : vérifie le contenu de la string
        
    }

}
