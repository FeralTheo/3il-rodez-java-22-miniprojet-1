package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

// Définition de la classe Terrain
public class Terrain {
    // Déclaration des variables d'instance : hydrométrie, température et altitude
    private double hydrometrie, temperature, altitude;

    // Constructeur de la classe Terrain prenant en paramètre l'hydrométrie, la température et l'altitude
    // et lançant une exception si les valeurs ne sont pas valides
    public Terrain(double hydrometrie, double temperature, double altitude) throws MauvaiseValeurException {
        super();
        // Vérification des valeurs d'hydrométrie, de température et d'altitude
        if (hydrometrie < 0 || hydrometrie > 1) {
            throw new MauvaiseValeurException("L'hydrométrie doit être comprise entre 0 et 1.");
        }
        if (temperature < 0 || temperature > 1) {
            throw new MauvaiseValeurException("La température doit être comprise entre 0 et 1.");
        }
        if (altitude < -1 || altitude > 1) {
            throw new MauvaiseValeurException("L'altitude doit être comprise entre -1 et 1.");
        }
        // Initialisation des variables d'instance avec les valeurs valides
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
        this.altitude = altitude;
    }

    // Méthode permettant de récupérer l'hydrométrie
    public double getHydrometrie() {
        return hydrometrie;
    }

    // Méthode permettant de récupérer la température
    public double getTemperature() {
        return temperature;
    }

    // Méthode permettant de récupérer l'altitude
    public double getAltitude() {
        return altitude;
    }
    
    // Méthode permettant de déterminer le type de terrain en fonction de l'altitude, de l'hydrométrie
    // et de la température, en utilisant un objet DetermineurTerrain
    public TypeTerrain getTypeTerrain(DetermineurTerrain dt) {
        return dt.determinerTerrain(altitude, hydrometrie, temperature);
    }
}
