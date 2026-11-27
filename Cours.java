package ecole;

public class Cours  {
    private String intitule;
    private Enseignant enseignantResponsable;
    private Etudiant[] etudiantsInscrits;
    private int nbInscrits;

    public Cours(String intitule, Enseignant enseignantResponsable) {
        this(intitule, enseignantResponsable, 50);
    }

    public Cours(String intitule, Enseignant enseignantResponsable, int capaciteMax) {
        this.intitule = intitule;
        this.enseignantResponsable = enseignantResponsable;
        this.etudiantsInscrits = new Etudiant[capaciteMax];
        this.nbInscrits = 0;
    }

    public String getIntitule() {
        return intitule;
    }

    public Enseignant getEnseignantResponsable() {
        return enseignantResponsable;
    }

    public void inscrireEtudiant(Etudiant etudiant) {
        if (etudiant == null) {
            return;
        }
        for (int i = 0; i < nbInscrits; i++) {
            if (etudiantsInscrits[i] == etudiant) {
                System.out.println("Étudiant déjà inscrit à ce cours.");
                return;
            }
        }
        if (nbInscrits >= etudiantsInscrits.length) {
            System.out.println("Cours complet : " + intitule);
            return;
        }
        etudiantsInscrits[nbInscrits] = etudiant;
        nbInscrits++;
    }

    public void afficherMeilleurEtudiant() {
        if (nbInscrits == 0) {
            System.out.println("Aucun étudiant inscrit au cours : " + intitule);
            return;
        }

        Etudiant meilleur = etudiantsInscrits[0];
        for (int i = 1; i < nbInscrits; i++) {
            if (etudiantsInscrits[i].calculerMoyenne() > meilleur.calculerMoyenne()) {
                meilleur = etudiantsInscrits[i];
            }
        }

        System.out.println("Meilleur étudiant du cours \"" + intitule + "\" (Resp. : "
                + enseignantResponsable.getNom() + ") :");
        meilleur.afficherInfos();
    }
}
