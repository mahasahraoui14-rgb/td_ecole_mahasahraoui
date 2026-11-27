package ecole;

public class Enseignant extends personne {
    private String specialite;
    private int nbHeures;

    public Enseignant(String nom, String prenom, String email, String specialite, int nbHeures) {
        super(nom, prenom, email);
        this.specialite = specialite;
        this.nbHeures = nbHeures;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }

    @Override
    public String getRole() {
        return "Enseignant";
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("   Spécialité : " + specialite
                + " | Heures : " + nbHeures + "h");
    }
}