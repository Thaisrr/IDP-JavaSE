package fr.dawan.formation.POO;
import java.util.ArrayList;
import java.util.List;

import fr.dawan.formation.POO.interfaces.EstDomestique;
import fr.dawan.formation.POO.models.Animal;
import fr.dawan.formation.POO.models.Chat;
import fr.dawan.formation.POO.models.Chien;
import fr.dawan.formation.POO.models.Felin;

public class Main {

    public static void main(String[] args) {
        
        Chien chien = new Chien();
        chien.setName("Medor");
        
        
        Chat chat = new Chat("Cactus", "tabby", 10);
        System.out.println(chat.getName());
        chat.manger();
        
        
        chat.crier();
        chien.crier();
        
        Felin felin = new Felin("Jean Michel", "roux", 103);
        felin.crier();
        chien.demanderDesCaresses();
        chat.demanderCroquettes();
    
        System.out.println(chat.getPelage());
        
        System.out.println(Animal.getCount());
        System.out.println(Chat.getCount());
        System.out.println(Felin.getCount());
        
        chat.switchPelage();
        
        
        
        
        
        // Polymorphisme
        Animal cat1 = new Chat();
        Animal felin1 = new Felin();
        
        System.out.println(cat1.getPelage()); // Fourrure
        System.out.println(felin1.getPelage()); // Fourrure
        cat1.crier(); // Miaou
        /*
         *Pas accès aux attributs et méthodes qui ne viennent pas de la classe Animal 
         */
        
        List<Animal> mes_animaux = new ArrayList<>();
        
        mes_animaux.add(felin1);
        mes_animaux.add(cat1);
        mes_animaux.add(chien); // Chien contenu dans la liste sera caster en Animal
        
       EstDomestique chien2 = new Chien();
       EstDomestique chat2 = new Chat();
      // EstDomestique felin = new Felin();
       chien2.demanderDesCaresses();
       chat2.jouerALaBalle();
       
       // mes_animaux.add(chien2); -> n'est pas un Animal
       
       /*
        * C'est le typage de la variable qui défini sont type, et pas le constructor utilisé.
        * Les Objets sont des instances de leur classe, mais aussi des classes et interfaces dont
        * ils héritent
        */
       
       // Chien chien = new Chien();
       System.out.println("Chien est un animal ? " + (chien instanceof Animal));
       System.out.println("Chien est un chien ? " + (chien instanceof Chien));
       System.out.println("Chien estDomestique ? " + (chien instanceof EstDomestique));
       
       // EstDomestique chien2 = new Chien();
       System.out.println("Chien2 est un animal ? " + (chien2 instanceof Animal));
       System.out.println("Chien2 est un chien ? " + (chien2 instanceof Chien));
       System.out.println("Chien2 estDomestique ? " + (chien2 instanceof EstDomestique));
       
       
       

       
       
       
       
       
       
       
        
    
    }

}
