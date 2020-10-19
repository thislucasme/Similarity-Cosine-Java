import java.util.ArrayList;
import java.util.List;


public class Calcular {
	
	public static double[] A;
	public static double[] B;
	public  static java.util.List<String> C = new ArrayList<>();
	public static double total;
	public static double raizA;
	public static double raizB;
	
	public static List<String> lista = new ArrayList<String>();
	
	public static double isSimilar(double[] a, double[] b) {
		A = a;
		B = b;
		
		for(int i = 0; i < A.length; i++) {
			total += A[i]*B[i];
		}
		return raiz();
	}
	public void limparLista() {
		lista.clear();
	}
	public static double raiz() {
		for(int i = 0; i < A.length; i++) {
			if(i == 0 || i % 2 == 0) {
				raizA += Math.pow(A[i], 2) + Math.pow(A[i + 1], 2);
				raizB += Math.pow(B[i], 2) + Math.pow(B[i + 1], 2);
			
			}
		}
		raizA = Math.sqrt(raizA);
		raizB = Math.sqrt(raizB);
		return last();
		
	}
	private static double last() {
		double mult = raizA * raizB;
		double similaridade = total / mult;
		return similaridade;
	}
	public static void limpar() {
		lista.clear();
	}
	public static String[] toArray(String s) {
		limpar();
		String[] arrayTexto;
		arrayTexto = s.split(" ");
		return arrayTexto;
	}
	public static  java.util.List<String> ttirarPalavras(String[] array) {
		
		for(String s: array) {
			if(C.size() > 0 ) {
				for(String ar: C) {
					if(!ar.equals(s)) {
						if(s.length() >2) {
							C.add(s);
						}
					}
				}
			}else {
				for(String ar: C) {
					if(!ar.equals(s)) {
						if(s.length() >2) {
							C.add(s);
						}
					}
				}
			}
		}
		System.out.println(C.size());
		return C;
		
	}
	public static boolean verificarIgual() {
		return true;
	}
	
	//tirar palavras menores
	public static List<String> tirarPalavrasMenores(String [] vetor) {
		for(int i = 0; i< vetor.length; i++) {
			if(vetor[i].length() > 2) {
				boolean isIn = verificarLista(vetor[i]);
				if(isIn == false) {
					lista.add(vetor[i]);
				}
			}
		}
		
		return lista;
		
	}
	private static boolean verificarLista(String vetor) {
		
		for(String ss : lista) {
			if(ss.equals(vetor)) {
				return true;
			}
		}
		return false;
	}
	//fim

}
