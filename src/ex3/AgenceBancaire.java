package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AgenceBancaire {
    private String nomAgence;
    private String locaAgence;
    private List<Compte> Comptes;

    public AgenceBancaire(String nomAgence, String locaAgence) {
        this.nomAgence = nomAgence;
        this.locaAgence = locaAgence;
        Comptes=new ArrayList<>();
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public String getLocaAgence() {
        return locaAgence;
    }

    public int getNbCompte(){
        return Comptes.size();
    }

    public Compte getCompte(String numCompte){
        Compte newCompte = new Compte();

        for ( Compte compte : Comptes  ) {

            if (compte.getNumCompte()==numCompte){

                newCompte= compte;

            }else {
                newCompte= null;
            }

        }
        return newCompte;

    }
    //ADD Compte
    public Boolean addCompte(Compte newCompte){
            try {
                return Comptes.add(newCompte);

            }catch (Exception ex){
                System.out.println(ex);
                return false;
            }

    }
    //REMOVE Compte BY NUMCOMPTE
    public Boolean removeCompte(String numCompte){
        try{
            return Comptes.removeIf(compte -> compte.getNumCompte() == numCompte);
        }catch (Exception ex){
            System.out.println(ex);
            return false;
        }


    }

    @Override
    public String toString() {
        return "AgenceBancaire{" +
                "nomAgence='" + nomAgence + '\n' +
                ", locaAgence='" + locaAgence + '\n' +
                "Comps : "+Comptes+'\n'+
                '}';
    }

    public List<Compte> getCompteByPropName(String nomPropriteaire){
        try{
            List<Compte> result = Comptes.stream()
                    .filter(
                            compte -> nomPropriteaire.equals(compte.getNomProp())
                    )
                    .collect(Collectors.toList());


            return result;
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }

    }

    public static void main(String[] args) {
        AgenceBancaire AgenceVillEljadida = new AgenceBancaire("Agence centre Ville El jadida","Av. Abderrahmane Doukkali El jadida");
        Compte c1= new Compte("Anasse");
        Compte c2= new Compte("Mohamed");
        c1.deposer(1000.00);
        c2.deposer(500.00);


        AgenceVillEljadida.addCompte(c1);
        AgenceVillEljadida.addCompte(c2);
        AgenceVillEljadida.removeCompte("1");




        System.out.println(AgenceVillEljadida);

    }
}
