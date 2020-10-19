

public class Main {

	public static void main(String[] args) {
		
	
		double[] E = new double[]{0,0,0,0,1,1,1,1};
		double[] G = new double[]{1,1,1,1,1,1,1,1};
		
		System.out.println("Similaridade é de : " + Calcular.isSimilar(E,G));
		
	}

}
