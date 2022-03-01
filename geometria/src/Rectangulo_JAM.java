/**
 * 
 * @author Jesús Ayala Milán
 * @version 1.2
 */
public class Rectangulo_JAM extends FiguraGeometrica_JAM {
	private double l1;
	private double l2;
	
	/**
	 * método que da valor a los lados
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_JAM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	/**
	 * método que calcula el área
	 * @param l1
	 * @param l2
	 */
	public double area() {
		return l1 * l2;
	}
	
	
	@Override
	/**
	 * método que calcula el perímetro
	 * @param l1
	 * @param l2
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
