package ex3;

public class Compte {
    public Compte() {

    }

    public Compte(String nomProp) {
        this.numCompte = Integer.toString(++cpt);
        this.nomProp = nomProp;
        this.solde=0.0;
    }

    private static Integer cpt=0;
    private String numCompte;
    private String nomProp;
    private Double solde;

    public String getNumCompte() {
        return numCompte;
    }

    public String getNomProp() {
        return nomProp;
    }

    public Double getSoldeCompte() {
        return solde;
    }

    public void setNomProp(String nomProp) {
        this.nomProp = nomProp;
    }

    public Boolean deposer(Double psome) {
        if (psome>0){
            this.solde += psome;
            return true;
        }else return false;
    }

    public Boolean retire(double psomme){
        if (this.solde>0){
            if (solde>psomme){
                this.solde-=psomme;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "compte{"+'\t' +
                "numCompte='" + numCompte + '\t' +
                ", nomProp='" + nomProp + '\t' +
                ", solde=" + solde +'\t'+
                '}'+'\t';
    }

    public static void main(String[] args) {
        Compte c1= new Compte("Anasse");
        System.out.println(c1);
    }
}
