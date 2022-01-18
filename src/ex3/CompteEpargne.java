package ex3;

public class CompteEpargne extends Compte{

    public CompteEpargne(String nomProp) {
        super(nomProp);
    }

    @Override
    public String getNomProp() {
        return nomProp;
    }

    @Override
    public Double getSoldeCompte() {
        return null;
    }

    @Override
    public void setNomProp(String nomProp) {

    }

    @Override
    public Boolean deposer(Double psome) {
        if (psome>0){
            this.solde += psome;
            return true;
        }else return false;
    }

    @Override
    public Boolean retire(double psomme) {
        if (this.solde>0){
            if (solde>psomme){
                this.solde-=psomme;
                return true;
            }
        }
        return false;
    }
}
