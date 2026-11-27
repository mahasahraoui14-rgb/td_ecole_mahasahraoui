package ecole;

public class Etudiant extends personne {
    private String matricule;
    private double[] notes;
    private int nbNotes =0;

    public Etudiant(String nom, String prenom, String email, String matricule) {
        this(nom, prenom, email, matricule, 20);
    }

    public Etudiant(String nom, String prenom, String email, String matricule, int capaciteNotes) {
        super(nom, prenom, email);
        this.matricule = matricule;
        this.notes = new double[capaciteNotes];
        this.nbNotes = 0;
    }

    public String getMatricule() {
        return matricule;
    }

    public void ajouterNote(double note) {
        if (note < 0 || note > 20) {
            System.out.println("Note invalide : " + note);
            return;
        }
        if (nbNotes >= notes.length) {
            System.out.println("Tableau de notes plein pour " + getNom());
            return;
        }
        notes[nbNotes] = note;
        nbNotes++;
    }

    public double calculerMoyenne() {
        if (nbNotes == 0) {
            return 0.0;
        }
        double somme = 0.0;
        for (int i = 0; i < nbNotes; i++) {
            somme += notes[i];
        }
        return somme / nbNotes;
    }

    @Override
    public String getRole() {
        return "Étudiant";
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("   Matricule : " + matricule
                + " | Moyenne : " + String.format("%.2f", calculerMoyenne()));
    }
}