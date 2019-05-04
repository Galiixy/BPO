package AppliJeu;

public interface AppliJeu {
  public Etat jouer(String[] args);
  public enum Etat{
	  gagné, perdu, égalité, erreur
  }
}
