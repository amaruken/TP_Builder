/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_builder;

import java.util.Scanner;

/**
 *
 * @author Kevin MATHY
 */
public class TP_Builder {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vendeur vendeur= new Vendeur();
        
        
        Scanner sc = new Scanner(System.in);
        int str=1;
        
        while(str!=0){
            MonteurVehicule monteur = null;
            System.out.println("_____________________________________________________");
            System.out.println("Choisissez le numéro d'un vehicule : \n"
                    + "1 - Ferrari\n"
                    + "2 - Mercedes\n"
                    + "3 - Elephant\n"
                    + "0 - Quitter\n");

            str = sc.nextInt();

            switch (str) {
                case 1:
                    monteur = new MonteurFerrari();
                    System.out.println("Vous avez choisie la Ferrari");
                    break;
                case 2:
                    monteur = new MonteurMercedes();
                    System.out.println("Vous avez choisie la Mercedes");
                    break;
                case 3:
                    monteur = new MonteurElephant();
                    System.out.println("Vous avez choisie l'élephant");
                    break;
                case 0:
                    System.out.println("Merci. Au revoir !");
                    break;
                default:
                    System.out.println("Il faut choisir parmis les vehicules proposés.\n");
            }

            try{
            vendeur.setMonteurVehicule(monteur);
            vendeur.construireVehicule();

            System.out.println("Ses statistiques sont les suivantes :\n");
            vendeur.getVehicule().afficheVoiture();
            }catch(Exception e){
                
            }
            
        
        }
    }
    
}
