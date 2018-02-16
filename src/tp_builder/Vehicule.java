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
public class Vehicule {

    private String corps = "";
    private String puissance = "";
    private String moteur = "";
    private String freins = "";
    private String place = "";
    private String fenetre = "";
    private String carburant = "";

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }

    public void setFreins(String freins) {
        this.freins = freins;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setFenetre(String fenetre) {
        this.fenetre = fenetre;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void afficheVoiture() {
        System.out.println("CORPS=\n" + corps + "\n"
                + "PUISSANCE=\n" + puissance + "\n"
                + "MOTEUR=\n" + moteur + "\n"
                + "FREINS=\n" + freins + "\n"
                + "PLACE=\n" + place + "\n"
                + "FENETRE=\n" + fenetre + "\n"
                + "CARBURANT=\n" + carburant + "\n");
    }

}
