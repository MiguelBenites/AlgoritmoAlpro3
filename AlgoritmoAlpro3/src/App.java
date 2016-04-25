import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> lst = new ArrayList<>();

		lst.add(1);
		lst.add(5);
		lst.add(6);
		lst.add(2);
		lst.add(9);
		lst.add(5);
		lst.add(2);
		lst.add(4);
		lst.add(2);

		System.out.println("Testando");
		System.out.println("procura 2 :" + procura(lst, 2));
		System.out.println("somaTudo  :" + somaTudo(lst));
		System.out.println("somaTudo2 :" + somaTudo2(lst));
		System.out.println("aoQuadrado:" + aoQuadrado(4));
		System.out.println("somatorio :" + somatorio(4));
		System.out.println("somatorio2:" + somatorio2(4));
		System.out.println("somatorio3:" + somatorio3(4));
		System.out.println("funcao    :" + funcao(4));
		
		
		Matriz mat = new Matriz();
		
		System.out.println("Matriz colunas: "+mat.getTotalColunas());
		System.out.println("Matriz linhas : "+mat.getTotalLinhas());
		
		
		
	}

	public static int procura(ArrayList<Integer> lst, int elem) {
		int res = 0;
		for (int i = 0; i < lst.size(); i++)
			if (lst.get(i) == elem)
				res++;
		return res;
	}

	public static int somaTudo(ArrayList<Integer> lst) {
		int res = 0;
		for (int i = 0; i < lst.size(); i++) {
			res = res + lst.get(i);
			for (int j = 0; j < lst.size(); j++)
				res = res + lst.get(j);
		}
		return res;
	}

	public static int somaTudo2(ArrayList<Integer> lst) {
		int res = 0;
		for (int i = 0; i < lst.size(); i++) {
			res = res + lst.get(i) * (1 + lst.size());
		}
		return res;
	}

	/**
	 * T(n) = 2 Ordem: Constante
	 * 
	 * @param n
	 * @return
	 */
	public static int aoQuadrado(int n) {
		return n * n;
	}

	/**
	 * T(n) = 5n + 4 Ordem: Linear
	 * 
	 * @param n
	 * @return
	 */
	public static int somatorio(int n) {
		int soma = 0;
		for (int i = 1; i <= n; i++)
			soma += i;
		return soma;
	}

	/**
	 * T(n) = 6n2 + 5n + 4 Ordem: Quadrática
	 * 
	 * @param n
	 * @return
	 */
	public static int somatorio2(int n) {
		int soma = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				soma += i + j;
		return soma;
	}

	/**
	 * T(n) = 8n4 + 5n3 + 5n2 + 5n + 4 Ordem: Polinomial
	 * 
	 * @param n
	 * @return
	 */
	public static int somatorio3(int n) {
		int res = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				for (int k = 0; k < n; k++)
					for (int l = 0; l < n; l++)
						res += (i + j) * (k + l);
		return res;
	}

	/**
	 * T(n) = 5(2n) + 5n + 6 Ordem: Exponencial
	 * 
	 * @param n
	 * @return
	 */
	public static int funcao(int n) {
		int s = 0, cont = 1;
		while (n > 0) {
			cont *= 2;
			n -= 1;
		}
		for (int i = 0; i < cont; i++) {
			s += i;
		}
		return s;
	}

	public static int logaritmo(int n) {
		int cont = 0;
		
		while (n > 0) {
			n = n / 2;
			cont += 1;
		}
		cont++;
		return cont;
	}

}
