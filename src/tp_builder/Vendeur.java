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
public class Vendeur {

    private MonteurVehicule monteurVehicule;

    public void setMonteurVehicule(MonteurVehicule mv) {
        monteurVehicule = mv;
    }

    public Vehicule getVehicule() {
        return monteurVehicule.getVehicule();
    }

    public void construireVehicule() {
        monteurVehicule.creerNouveauVehicule();
        monteurVehicule.setCorps();
        monteurVehicule.setMoteur();
        monteurVehicule.setPuissance();
        monteurVehicule.setPlace();
        monteurVehicule.setFreins();
        monteurVehicule.setCarburant();
        monteurVehicule.setFenetre();
    }
}
