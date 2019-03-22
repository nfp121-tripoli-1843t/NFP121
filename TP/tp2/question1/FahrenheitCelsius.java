package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 *            
	 */
	public static void main(String[] args) {
		// pour tous les paramètres de la ligne de commande
		int fahrenheit = 0;
		float celsius = 0;
		for(int i = 0; i<args.length; i++){
            fahrenheit = java.lang.Integer.parseInt(args[i]);
            celsius = fahrenheitEnCelsius(fahrenheit);
		System.out.println(fahrenheit + "\u00B0F -> " +((int)(celsius*10)/10.0) + "\u00B0C");
		// ligne,
																				// format
																}																		// imposés
																				
	}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
	       float F= (float)5/9*(f-32);
		return F;
	}

}
