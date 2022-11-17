package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.EstDomestique;

public final class Chat extends Felin implements EstDomestique {
    
    private static int count = 0;
    
    public Chat() {
        count++;
    }

    public Chat(String name, String color, int age) {
        super(name, color, age, true, true);
        count++;
    }
    
    
    @Override
    public void crier() {
        System.out.println("Miaou Miaou");
    }
    
    public void demanderCroquettes() {
        System.out.println("Nourris moi, humain⋅e !");
    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("Tu approches ta main, je te bouffe !");
        
    }

    @Override
    public void jouerALaBalle() {
        System.out.println("Va chercher la baballe humain⋅e !");
        
    }
    
    
    public static int getCount() {
        return count;
    }
    
    

}
