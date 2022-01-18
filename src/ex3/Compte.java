package ex3;

public abstract class Compte {
    public Compte() {

    }

    public Compte(String nomProp) {
        this.numCompte = Integer.toString(++cpt);
        this.nomProp = nomProp;
        this.solde=0.0;
    }

    protected static Integer cpt=0;
    protected String numCompte;
    protected String nomProp;
    protected Double solde;

    public String getNumCompte() {
        return numCompte;
    }

    public abstract String getNomProp() ;

    public abstract Double getSoldeCompte() ;

    public abstract void setNomProp(String nomProp) ;

    public abstract Boolean deposer(Double psome);

    public abstract Boolean retire(double psomme);

    @Override
    public String toString() {
        return "compte{"+'\t' +
                "numCompte='" + numCompte + '\t' +
                ", nomProp='" + nomProp + '\t' +
                ", solde=" + solde +'\t'+
                '}'+'\t';
    }


}
