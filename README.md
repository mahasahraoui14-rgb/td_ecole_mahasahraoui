# td_ecole_mahasahraoui
# TP Java POO — Gestion d'une École (`TP-Java-Ecole`)

Projet pratique de **Programmation Orientée Objet (POO)** en Java réalisé sous **Eclipse IDE**, portant sur les classes abstraites, l'héritage, la redéfinition de méthodes (`@Override`), le polymorphisme et la gestion de cours avec tableaux.

## Auteur & Informations
* **Étudiant(e) :** [Votre Nom et Prénom]
* **Groupe :** [Votre Groupe]
* **Projet Eclipse :** `TP_Ecole_NomPrenom` (package `ecole`)
* **Environnement :** Java (JDK 17+), Eclipse IDE

## Objectifs du TP
* Modéliser les personnes d'un établissement (`Etudiant` et `Enseignant`) à partir d'une classe abstraite `Personne`.
* Utiliser l'héritage (`extends`, `super`) et la redéfinition (`@Override`).
* Exploiter le polymorphisme à travers un tableau de type `Personne[]`.
* Implémenter la classe bonus `Cours` avec gestion des inscriptions et recherche du meilleur étudiant à l'aide de tableaux (`double[]` et `Etudiant[]`).

## Structure du projet (`src/ecole`)
* `Personne.java` : classe abstraite contenant les attributs communs (`nom`, `prenom`, `email`), leurs getters, la méthode abstraite `getRole()` et `afficherInfos()`.
* `Etudiant.java` : sous-classe de `Personne` ajoutant le `matricule` et un tableau de `notes` (`double[]`), avec `ajouterNote(double)`, `calculerMoyenne()`, `getRole()` et `afficherInfos()`.
* `Enseignant.java` : sous-classe de `Personne` ajoutant `specialite` et `nbHeures`, avec redéfinition de `getRole()` et `afficherInfos()`.
* `Cours.java` *(Bonus)* : modélise un cours (`intitule`, `enseignantResponsable`, tableau `etudiantsInscrits`), permet d'inscrire des étudiants et d'afficher le meilleur étudiant selon sa moyenne.
* `Main.java` : point d'entrée du programme testant le polymorphisme sur `Personne[]` ainsi que le fonctionnement de `Cours`.

## Exécution sous Eclipse
1. Ouvrir le projet `TP_Ecole_NomPrenom` dans **Eclipse IDE**.
2. Ouvrir la classe `Main.java` dans le package `ecole`.
3. Exécuter via **Run As > Java Application** (`Ctrl + F11`) et consulter le résultat dans la console.

## Dépôt GitHub
* **Lien du dépôt :** `[Lien vers votre dépôt GitHub]`
