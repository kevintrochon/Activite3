package nc.unc.kevintrochon;

/**
 * Leve une exception
 * si le caractère renseigné est différent des valeurs permises.
 */
public class CaractereInterditException extends Exception {
  public CaractereInterditException(String message) {
    super(message);
  }
}
