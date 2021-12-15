package nc.unc.kevintrochon;

import java.util.ArrayList;
import java.util.List;

public interface ResolveurInterface {
  GrilleImpl grille = new GrilleImpl(9);
  List<Character> charsPossible = new ArrayList<>();

  public boolean solveur(int position);
}
