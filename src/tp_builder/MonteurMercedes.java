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
public class MonteurMercedes extends MonteurVehicule{
    @Override
    void setCorps() {
        vehicule.setCorps("longueur : 5.10 metre\n"
                + "largeur : 1.87 metre\n"
                + "hauteur : 1.42 metre\n"
                + "poids : 2120 kg\n");
    }

    @Override
    void setPuissance() {
        vehicule.setPuissance("Vitesse maximum : 250 km/h \n"
                + "Accéleration 0/100km/h : 4.9 sec\n");
    }

    @Override
    void setMoteur() {
        vehicule.setMoteur("Nombre de cylindres : 8 \n"
                + "Nombre de soupapes par cylindre : 4 Cylindrée : 4663 cc\n"
                + "Puissance din : 435 ch au régime de 5250 tr/min\n" 
                + "Couple moteur : 700 Nm au régime de 1800 tr/min\n");
    }

    @Override
    void setFreins() {
        vehicule.setFreins("Freins : 4 freins a disque dont 4 ventiles\n");
    }

    @Override
    void setPlace() {
        vehicule.setPlace("Nombre de places : 4\n");
    }

    @Override
    void setFenetre() {
        vehicule.setFenetre("Nombre de fenêtre : 2\n");
    }

    @Override
    void setCarburant() {
        vehicule.setCarburant("Réservoir : 83 L \n"
                + "Consommation urbaine : 13.9 L / 100 km \n"
                + "Consommation mixte : 9.9 L / 100 km\n");
    }
    
}
