package nc.unc.kevintrochon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class de résolution de sudoku.
 */
public class Resolveur implements ResolveurInterface {
  /**
   * Grille à complèter.
   */
  protected GrilleImpl grille;
  /**
   * Liste de caratère permis.
   */
  protected List<Character> charsPossible = new ArrayList<>();


  /**
   * Constructeur à partir d'un fichier.
   */
  public Resolveur(final String file)throws IOException {
    grille = new GrilleImpl(file);
    for (final char c : grille.getTableauPossible()
         ) {
      charsPossible.add(c);
    }
    GrilleParser.parseur(file, this.grille);
  }

  /**
   * Résolution de grille de sudoku.
   */
  @Override
  public boolean solveur(int position) {
    try {
      if (position == grille.getDimension() * grille.getDimension()) {
        return true;
      }
      int ligne = position / grille.getDimension();
      int colonne = position % grille.getDimension();
      if (grille.getValue(ligne, colonne) != GrilleImpl.EMPTY) {
        return solveur(position + 1);
      }
      for (final char c : charsPossible) {
        if (grille.verifLigne(ligne, c) && grille.verifColonne(colonne, c)
            && grille.verifRegion(ligne, colonne, c)) {
          grille.initialisation(ligne, colonne, c);
          if (solveur(position + 1)) {
            return true;
          }
        }
      }
      grille.initialisation(ligne, colonne, GrilleImpl.EMPTY);
      return false;
    } catch (HorsBornesException | CaractereInterditException exception) {
      return false;
    }
  }
}
