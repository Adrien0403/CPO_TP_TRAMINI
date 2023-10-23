/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author adrientramini
 */
public class Magicien extends Personnage {
    boolean confirmer;    
    
    public Magicien (String nom, int pdv, boolean a){
        super(nom , pdv);
        confirmer=a;
        
    }
 @Override
public String toString() {
String chaine_a_retourner;
if (confirmer == true){
chaine_a_retourner = ("Le magicien "+nom+" a "+pdv+ "vie confirmé et mani "+arme_en_main);
return chaine_a_retourner;
}
else {
    chaine_a_retourner = ("Le magicien "+nom+" a "+pdv+ "vie débutant et mani "+arme_en_main);

   return chaine_a_retourner; 
}
}
}
