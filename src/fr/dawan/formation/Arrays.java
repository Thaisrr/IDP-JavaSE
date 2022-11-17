package fr.dawan.formation;

public class Arrays {

    public static void main(String[] args) {
        
        double[] tab = new double[3];
        
        System.out.println( tab[0] ); // les valeurs sont initialisées par défaut
        
        char[] chars = new char[2];
        System.out.println( chars[0]);
        
    
        /* Initialisations par défaut : 
         * double : 0.0
         * int : 0
         * char : \u0000 
         * boolean : false
         * référence : null
         */
    
        
        //tab[0] = 1.5;  [0.0, 0.0, 0.0 ]
        
       
        for(double el : tab) {
            el++; // Ne modifie pas dans le tableau : el est une variable locale
            System.out.println("Foreach : " + el); // [1.0, 1.0, 1.0 ]
        }
        
        for(int i = 0; i < tab.length; i++) {
            System.out.println("tab de " + i + " = " + tab[i]); // [0.0, 0.0, 0.0 ]
        }
        
        
        int entiers[] = {1, 2, 3};
        // int entiers[]  ===  int[] entiers
        
       // System.out.println( entiers[3] ); // => Soulève une exception Out of range
        
        
        int tablo[][] = new int[3][3]; 
        // Un tableau de 3 lignes, contenant chacune un tableau de 3 zéros
        
        
        int tablooo[][] = { 
                {1, 2, 3},  // index 0
                {4 },     // index 1
                {5, 6},    // index 2
                {7, 8, 9, 10}  // index 3
        };
        
        int cinq = tablooo[2][0];
        int sept = tablooo[3][0];
        
        
        for( int[] subtablo : tablooo ) {
            for(int value: subtablo) {
                System.out.println(value);
            }
        }
    
        

    }

}
