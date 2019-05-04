package AppliJeu;

public interface AppliJeu {
  public Etat jouer();
  public enum Etat{
	  gagné, perdu, égalité, erreur
  }
}
