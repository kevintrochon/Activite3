package nc.unc.kevintrochon;

/**
 * Leve une exception
 * si le caractère renseigné est différent des valeurs permises.
 */
public class CaractereInterditException extends Exception {
  /**
   * Création du message d'erreur personnaliser.
   */
  public CaractereInterditException(final String message) {
    super(message);
  }
}
