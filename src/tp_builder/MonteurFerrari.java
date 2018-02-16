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
public class MonteurFerrari extends MonteurVehicule{

    @Override
    void setCorps() {
        vehicule.setCorps("longueur : 4.57 metre\n"
                + "largeur : 1.95 metre\n"
                + "hauteur : 1.20 metre\n"
                + "poids : 1445 kg\n");
    }

    @Override
    void setPuissance() {
        vehicule.setPuissance("Vitesse maximum : 325 km/h \n"
                + "Accéleration 0/100km/h : 3 sec\n");
    }

    @Override
    void setMoteur() {
        vehicule.setMoteur("Nombre de cylindres : 8\n"
                + "Nombre de soupapes par cylindre : 4\n"
                + "Cylindrée : 4497 cc\n"
                + "Puissance din : 605 ch au régime de 9000 tr/min\n"
                + "Couple moteur : 540 Nm au régime de 6000 tr/min\n");
    }

    @Override
    void setFreins() {
        vehicule.setFreins("Freins : 4 freins a disque dont 4 ventiles\n");
    }

    @Override
    void setPlace() {
        vehicule.setPlace("Nombre de places : 2\n");
    }

    @Override
    void setFenetre() {
        vehicule.setFenetre("Nombre de fenêtre : 2\n");
    }

    @Override
    void setCarburant() {
        vehicule.setCarburant("Réservoir : 86 L \n"
                + "Consommation urbaine : 19.7 L / 100 km \n"
                + "Consommation mixte : 13.3 L / 100 km\n");
    }
    
}
