package nc.unc.kevintrochon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class d'import d'une grille via fichier .txt.
 */
public class GrilleParser {

  /**
   * Rempli une grille à partir d'un fichier txt.
   */
  public static void parse(String in, GrilleImpl grille) throws IOException {
    try {
      // Le fichier d'entrée
      File file = new File(in);
      // Créer l'objet File Reader
      FileReader fr = new FileReader(file);
      // Créer l'objet BufferedReader
      BufferedReader br = new BufferedReader(fr);
      StringBuffer sb = new StringBuffer();
      String line;
      while ((line = br.readLine()) != null) {
        // ajoute la ligne au buffer
        sb.append(line);
      }
      sb.append("\n");
      fr.close();
      int j = 0;
      for (int k = 0; k < grille.getDimension(); k++) {
        for (int l = 0; l < grille.getDimension(); l++) {
          grille.initialisation(k, l, sb.charAt(j++));
        }
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public static void parseur(String f, GrilleImpl grille) throws IOException {
    parse(f, grille);
  }

}
