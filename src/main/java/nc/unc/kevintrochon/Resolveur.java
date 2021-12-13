package nc.unc.kevin.trochon;

import java.io.File;
import java.io.IOException;

public class Resolveur {
  GrilleImpl grille;

  public Resolveur() {
    this.grille = new GrilleImpl("src/main/src/sudoku-9x9.txt");
    try {
      GrilleParser.parse(new File("src/main/src/sudoku-9x9.txt"), this.grille);
    }catch (IOException exception){
      exception.getMessage();
    }
  }

  public void afficheGrille(){
    for (int i = 0; i < this.grille.getDimension(); i++) {
      for (int j = 0; j < grille.getDimension(); j++) {
        try{
          System.out.print(this.grille.getValue(i,j));
        }catch (HorsBornesException horsBornesException){
          horsBornesException.getMessage();
        }
      }
    }
  }

  public void afficheValue(int i,int j){
    try{
      System.out.print(this.grille.getValue(i,j));
    }catch (HorsBornesException horsBornesException){
      horsBornesException.getMessage();
    }
  }

  public static void main(String[] args) {
    Resolveur resolveur = new Resolveur();
    resolveur.afficheGrille();
  }
}
