/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_builder;

/**
 *
 * @author gotom
 */
abstract class MonteurVehicule {
    protected Vehicule vehicule;
    
    public Vehicule getVehicule(){
        return vehicule;
    }
    
    public void creerNouveauVehicule(){
        vehicule=new Vehicule();
    }
    
    abstract void setCorps();

    abstract void setPuissance();

    abstract void setMoteur();

    abstract void setFreins();

    abstract void setPlace();

    abstract void setFenetre();

    abstract void setCarburant();

}