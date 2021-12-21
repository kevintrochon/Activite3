package nc.unc.kevintrochon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestResolveur {
  @Test
  public void solveurTest(){
    try {
      Resolveur resolveur = new Resolveur("src/main/ressources/sudoku-9x9.txt");
      Assertions.assertTrue(resolveur.solveur(0));
      Resolveur resolveur1 = new Resolveur("src/main/ressources/sudoku-16x16.txt");
      Resolveur resolveur2 = new Resolveur("src/main/ressources/sudoku-25x25.txt");
    } catch (IOException ioException){
      ioException.getMessage();
    }
  }
}
