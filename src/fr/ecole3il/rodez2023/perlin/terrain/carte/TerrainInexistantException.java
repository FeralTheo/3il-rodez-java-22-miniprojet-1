package fr.ecole3il.rodez2023.perlin.terrain.carte;

// Définition d'une exception personnalisée pour signaler un terrain inexistant
public class TerrainInexistantException extends RuntimeException {
    // Constructeur prenant en paramètre un message d'erreur
    public TerrainInexistantException(String message) {
        // Appel au constructeur de la classe mère avec le message d'erreur
        super(message);
    }
}