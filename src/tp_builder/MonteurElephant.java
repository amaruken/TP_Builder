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
public class MonteurElephant extends MonteurVehicule{
    
    @Override
    void setCorps() {
        vehicule.setCorps("longueur : 5.50 metre\n"
                + "largeur : 1.80 metre\n"
                + "hauteur : 3.5 metre\n"
                + "poids : 5500 kg\n");
    }

    @Override
    void setPuissance() {
        vehicule.setPuissance("Vitesse maximum : 20 km/h \n"
                + "Accéleration 0/100km/h : Non Applicable\n");
    }

    @Override
    void setMoteur() {
        vehicule.setMoteur("Type de moteur : Organique\n");
    }

    @Override
    void setFreins() {
        vehicule.setFreins("Freins : Reflexes variables\n");
    }

    @Override
    void setPlace() {
        vehicule.setPlace("Nombre de places : 3\n");
    }

    @Override
    void setFenetre() {
        vehicule.setFenetre("Nombre de fenêtre : 0 (mais belle vue)\n");
    }

    @Override
    void setCarburant() {
        vehicule.setCarburant("Carburant = herbes, plantes, feuilles, fruits, racines et tubercules.\n"
                + "Mange de 16 à 20 heures par jours\n");
    }
    
    
}
