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
    } catch (IOException ioException){
      ioException.getMessage();
    }
  }
}
