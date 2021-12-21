package nc.unc.kevintrochon;

/**
 * Interface pour la contruction d'une grille.
 */
public interface Grille {
  /** Caractere de case vide. */
  char EMPTY = '@';


  /**
   * Method qui donne la dimension de la grille.
   */
  int getDimension();

  /**
   * Affecte une valeur dans la grille.
   * @param ligne position x dans la grille
   * @param colonne position y dans la grille
   * @param value valeur a mettre dans la case
   * @throw HorsBornesException
   *  si x ou y sont hors bornes (0-8)
   * @throw ValeurImpossibleException
   *  si la valeur est interdite aux vues des autres valeurs de la grille
   * @throw CaractereInterditException
   *  si value n'est pas un caractere autorise ('1',...,'9')
   */
  void setValue(int ligne, int colonne, char value) throws HorsBornesException, ValeurImpossibleException,
      CaractereInterditException;
  /**
   * Recupere une valeur de la grille
   * @param ligne position x dans la grille
   * @param colonne position y dans la grille
   * @return valeur dans la case x,y
   * @throw HorsBornesException si x ou y sont hors bornes (0-8)
   */
  char getValue(int ligne, int colonne) throws HorsBornesException;
  /**
   * Test si une grille est terminee
   * @return true si la grille est complete
   */
  boolean complete();
  /**
   * Test si une valeur est possible dans la grille par rapport a ce qu'elle
   * contient deja
   * @param ligne position x dans la grille
   * @param colonne position y dans la grille
   * @param value valeur a mettre dans la case
   * @throw HorsBornesException si x ou y sont hors bornes (0-8)
   * @throw CaractereInterditException si value n'est pas un caractere autorise ('1', ..., '9', ...)
   */
  boolean possible(int ligne, int colonne, char value) throws HorsBornesException, CaractereInterditException;
}
