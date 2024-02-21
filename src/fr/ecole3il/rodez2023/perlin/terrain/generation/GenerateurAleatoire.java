import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

import java.util.Random;

public class GenerateurAleatoire extends GenerateurCarte {

    private static final Random RANDOM = new Random();

    public GenerateurAleatoire(long graine) {
        super(graine);
    }

    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        double altitude = RANDOM.nextDouble() * 2 - 1; // Altitude entre -1 et 1
        double hydrometrie = RANDOM.nextDouble(); // Hydrométrie entre 0 et 1
        double temperature = RANDOM.nextDouble(); // Température entre 0 et 1
        return new Terrain(altitude, hydrometrie, temperature);
    }
}