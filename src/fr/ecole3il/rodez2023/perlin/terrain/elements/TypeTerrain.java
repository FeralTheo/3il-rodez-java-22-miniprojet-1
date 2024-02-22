package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;
import fr.ecole3il.rodez2023.perlin.Utils;

// Énumération définissant les différents types de terrain avec leur nom et leur fichier d'image associé
public enum TypeTerrain {
    COLLINES("Collines", "hills.png"),
    DESERT("Désert", "desert.png"),
    FORET_CONIFÈRES("Forêt de conifères", "coniferous_forest.png"),
    FORET_FEUILLUS("Forêt de feuillus", "deciduous_forest.png"),
    MARAIS("Marais", "marsh.png"),
    MONTAGNE("Montagne", "mountain.png"),
    OCEAN("Océan", "ocean.png"),
    PLAINE("Plaine", "plain.png"),
    TOUNDRA("Toundra", "tundra.png");

    // Variables finales pour le nom et le fichier d'image associé à chaque type de terrain
    private final String nom;
    private final String fichierImage;

    // Constructeur privé pour initialiser les variables finales avec le nom et le fichier d'image
    private TypeTerrain(String nom, String fichierImage) {
        this.nom = nom;
        this.fichierImage = fichierImage;
    }

    // Méthode pour obtenir l'image associée au type de terrain à partir du fichier
    public BufferedImage getImage() {
        return Utils.chargerTuile(fichierImage);
    }

    // Redéfinition de la méthode toString pour obtenir le nom du type de terrain
    @Override
    public String toString() {
        return nom;
    }
}
