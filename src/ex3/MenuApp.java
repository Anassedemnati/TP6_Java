package ex3;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        AgenceBancaire AgenceVilleEljadida = new AgenceBancaire("Agence centre Ville El jadida","centre Ville El jadida");
        Compte c1= new Compte("Anasse");
        Compte c3= new Compte("Mohamed");
        Compte c2= new Compte("idriss");
        String ln = System.getProperty("line.separator");
        String menu = "Operations autorisees :" + ln
                + "1 Ajout compte" + ln
                + "2 Deposer" + ln
                + "3 Retirer" + ln
                + "4 Afficher Compte" + ln
                + "5 get compte" + ln
                + "6 get comptes de" + ln
                + "7 remove compte" + ln
                + "8 Afficher tous les comptes" + ln
                + "9 Trouver compte" + ln

                ;
        String prompt = "Entrer une operation : 1,2,3,4,5,6,7,8,9" +ln +"si vous voulez quitter tappez q et retourner au menu h" ;
        Scanner lecteur = new Scanner(System.in);
        String operation ;
        System.out.println(menu);
        Boolean continuer = true ;
        while (continuer) {
            try {
                System.out.println(prompt);
                operation = lecteur.next();
                switch (operation) {
                    case "1" :
                        AgenceVilleEljadida.addCompte(c1);
                        AgenceVilleEljadida.addCompte(c3);
                        AgenceVilleEljadida.addCompte(c2);
                        break;
                    case "2" :
                        c1.deposer(1000.00);
                        break;
                    case "3" :
                        c1.retire(10);
                        break;
                    case "4" :
                        System.out.println(c1);
                        break;
                    case "5" :
                        System.out.println(AgenceVilleEljadida.getCompte("2"));
                        break;
                    case "6" :
                        System.out.println(AgenceVilleEljadida.getCompteByPropName("Boutaina"));
                        break;
                    case "7" :
                        AgenceVilleEljadida.removeCompte("0");
                        break;
                    case "8" :
                        System.out.println(AgenceVilleEljadida);
                        break;
                    case "9" :
                        System.out.println("vous n'avez pas le droit desole");
                        break;
                    case "q" :
                        continuer = false ;
                        break;
                    case "h" :
                        System.out.println(menu);
                        break;
                    default:
                        System.out.println("Erreur de saisie : "+operation+" inconnue.");
                }
            } catch (Error e) {System.out.println("Operation refusee : "+e.getMessage());}

        } // while
        System.out.println("Fin du programme.");
        //System.out.println(AgenceVilleEljadida);
        //AgenceVilleEljadida.afficher();
        //System.out.println(" jhjgkyfghd ");
        //System.out.println(AgenceVilleEljadida.trouveCompte(2));
    }





    }


