package nc.unc.kevintrochon;

import java.io.*;

public class GrilleParser {
  /**
   * Rempli une grille à partir d'un fichier txt.
   * @param in path du fichier.
   * @param grille Grille à remplir
   * @throws IOException
   *          Erreur si le fichier n'existe pas.
   */
  public static void parse(String in, GrilleImpl grille) throws IOException {
    try
    {
      // Le fichier d'entrée
      File file = new File(in);
      // Créer l'objet File Reader
      FileReader fr = new FileReader(file);
      // Créer l'objet BufferedReader
      BufferedReader br = new BufferedReader(fr);
      StringBuffer sb = new StringBuffer();
      String line;
      while((line = br.readLine()) != null)
      {
        // ajoute la ligne au buffer
        sb.append(line);
      }
      sb.append("\n");
      fr.close();
      int j=0;
        for (int k = 0; k < grille.getDimension(); k++) {
          for (int l = 0; l < grille.getDimension(); l++) {
            grille.initialisation(k,l,sb.charAt(j++));
          }
        }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }


  public static void parseur(String f, GrilleImpl grille) throws IOException {
    parse(f, grille);
  }

}
