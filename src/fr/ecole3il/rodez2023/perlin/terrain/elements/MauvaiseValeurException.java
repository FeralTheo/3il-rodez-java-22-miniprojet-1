package fr.ecole3il.rodez2023.perlin.terrain.elements;

// Définition d'une exception personnalisée pour gérer les valeurs invalides dans la classe Terrain
public class MauvaiseValeurException extends IllegalArgumentException {
    // Constructeur prenant en paramètre un message d'erreur
    public MauvaiseValeurException(String message) {
        // Appel au constructeur de la classe mère avec le message d'erreur
        super(message);
    }
}
