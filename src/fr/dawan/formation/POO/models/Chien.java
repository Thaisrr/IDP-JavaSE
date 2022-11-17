package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.EstDomestique;
import fr.dawan.formation.POO.interfaces.Truc;

public class Chien extends Animal implements EstDomestique, Truc {
    
    @Override
    public void crier() {
        System.out.println("Wouaff Wouaff");
        
    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("Yeah !");
        
    }

    @Override
    public void jouerALaBalle() {
        System.out.println("Oui la babablle");
        
    }

    @Override
    public void faitDesTrucs() {
        // TODO Auto-generated method stub
        
    }
}
