package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.enums.Peau;

abstract public class Animal { 
    // POJO - Plain Old Java Object -> Classe sans restrictions
    // Java Beans, type de POJO -> classe qui contient un constructor, attributs privés, getters / setters, serializable
    // Bonne pratique, convention d'écriture
    
    /*
     * Public -> utilisable dans tous le projet
     * Private -> utilisable uniquement dans la classe
     * Protected (default) -> utilisable uniquement dans le package
     */
    
    private int nbLegs, age;
    private String color, name;
    private Peau pelage;
    private static int count = 0;


    public Animal() {
        count++;
    }
    
    public Animal(String name, String color, int age) {
        
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
        
    } 
    
    
    public Animal(String name, String color, int age, int nbLegs) {
        this.nbLegs = nbLegs;
        this.age = age;
        this.color = color;
        this.name = name;
        count++;
    }

    // Type de pelage
    // Type alimentation
    // Cri
    
    public void manger() {
        System.out.println(this.name + " dit Miam Miam");
    }
    
    
    
    public void switchPelage() {
        
        switch(this.pelage) {
        
        case FOURRURE:
            System.out.println("Perd ses poils partouts");
            break;
        case ECAILLES:
            System.out.println("Pas agréable à caresser");
            break;
        case CARAPASSES:
            System.out.println("Change de carapasse tous les 4 matins !");
            break;
        default:
            System.out.println("Plus d'idées");
            break;
        
        }
        
    }
    
    
    public abstract void crier();
    
    
    public int getNbLegs() {
        return nbLegs;
    }

    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name;  }
    
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
    
    public Peau getPelage() {
        return pelage;
    }

    public void setPelage(Peau pelage) {
        this.pelage = pelage;
    }
    
    
    public static int getCount() {
        return count;
    }
    
    
    
    
    
    
}
