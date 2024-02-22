package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

// Interface pour déterminer le type de terrain en fonction de l'altitude, de l'hydrométrie et de la température
public interface DetermineurTerrain {

    // Méthode pour déterminer le type de terrain
    public TypeTerrain determinerTerrain(double altitude, double hydrometrie, double temperature);

}
