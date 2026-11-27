package ecole;

public class main {
    public static void main(String[] args) {
        // Création des étudiants et ajout de leurs notes
        Etudiant e1 = new Etudiant("Ben Ali", "Sami", "sami.benali@ecole.tn", "MAT001");
        e1.ajouterNote(15.5);
        e1.ajouterNote(14.0);
        e1.ajouterNote(16.0);

        Etudiant e2 = new Etudiant("Trabelsi", "Amira", "amira.trabelsi@ecole.tn", "MAT002");
        e2.ajouterNote(17.5);
        e2.ajouterNote(18.5);
        e2.ajouterNote(16.5);

        // Création des enseignants
        Enseignant p1 = new Enseignant("Mansouri", "Karim", "karim.mansouri@ecole.tn", "POO Java", 36);
        Enseignant p2 = new Enseignant("Gharbi", "Leila", "leila.gharbi@ecole.tn", "Bases de données", 28);

        // Polymorphisme : tableau de Personne contenant étudiants et enseignants
        personne[] personnes = { e1, e2, p1, p2 };

        System.out.println("=== Liste des personnes (Polymorphisme) ===");
        for (personne p : personnes) {
            p.afficherInfos();
        }

        // Bonus : test de la classe Cours
        System.out.println("\n=== Test du cours (Bonus) ===");
        Cours coursJava = new Cours("Programmation Orientée Objet", p1, 10);
        coursJava.inscrireEtudiant(e1);
        coursJava.inscrireEtudiant(e2);
        coursJava.afficherMeilleurEtudiant();
    }
}