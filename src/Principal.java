public class Principal {

	public static void main(String[] args) {
		Double a[][] = new Double[2][];
		Double b[][] = new Double[3][];

		// coloca valores nasduas matrizes...
		inicializaMatrizes(a, b);

		// mostra as duas matrizes criadas...
		System.out.println(toString(a));
		System.out.println(toString(b));

		// a matriz c conter� o resultado do produto...
		Double c[][] = new Double[a.length][b[0].length];
		inicializaMatriz(c, 1.0);

		// realiza o produto matricial...
		produtoMatricial(a, b, c);

		// mostra o produto na tela...
		System.out.println(toString(c));

	}

	/**
	 * Calcula o produto de 2 matrizes e coloca o resultado em uma terceira matriz
	 * 
	 * @param m1
	 * @param m2
	 * @param mp
	 *            guarda o resultado de m1 x m2. Precisa estar inicializada ao ser
	 *            passada par este m�todo
	 */
	private static void produtoMatricial(Double[][] m1, Double[][] m2, Double[][] mp) {
		int linhasDeA = m1.length;
		int colunasDeB = m2[0].length;

		for (int i = 0; i < linhasDeA; i++) {
			for (int j = 0; j < colunasDeB; j++) {
				Double linha[] = obtemLinhaComoVetor(m1, i);
				Double coluna[] = obtemColunaComoVetor(m2, j);
				mp[i][j] = produtoEscalar(linha, coluna);
			}
		}

	}

	/**
	 * Obt�m m vetor contendo os elementos de uma linha espec�fica de uma matriz
	 * 
	 * @param m
	 *            matriz
	 * @param numeroDaLinha
	 *            n�mero da linha de onde os elementos devem ser retirados
	 * @return
	 */
	private static Double[] obtemLinhaComoVetor(Double[][] m, int numeroDaLinha) {
		return m[numeroDaLinha];
	}

	/**
	 * Obt�m um vetor contendo os elementos de uma coluna espec�fica de uma matriz.
	 * 
	 * @param m
	 *            matriz
	 * @param numeroDaColuna
	 *            n�mero da coluna de onde os elementos devem ser retirados
	 * @return
	 */
	private static Double[] obtemColunaComoVetor(Double[][] m, int numeroDaColuna) {
		int linhas = m.length;

		Double v[] = new Double[linhas];

		for (int i = 0; i < linhas; i++) {
			v[i] = m[i][numeroDaColuna];
		}

		return v;
	}

	/**
	 * Faz o produto escalar de dois vetores
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	private static Double produtoEscalar(Double[] v1, Double[] v2) {
		int colunas = v1.length;

		Double acumulador = 0.0;

		for (int i = 0; i < colunas; i++) {
			acumulador += v1[i] * v2[i];
		}

		return acumulador;
	}

	/**
	 * Inicializa uma matriz com os valores passados
	 * 
	 * @param m
	 * @param valor
	 */
	private static void inicializaMatriz(Double[][] m, Double valor) {
		int linhas = m.length;
		int colunas = m[0].length;

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				m[i][j] = valor;
			}
		}
	}

	/**
	 * Inicializa as matrizes passadas como par�metro. O produto m1 e m2 deve ser
	 * poss�vel e o c�digo n�o est� verificando isso, portanto, cuidado na hora de
	 * inserir as matrizes.
	 * 
	 * @param m1
	 * @param m2
	 */
	private static void inicializaMatrizes(Double m1[][], Double m2[][]) {
		m1[0] = new Double[] { 1.0, 2.0, 3.0 };
		m1[1] = new Double[] { 2.0, 4.0, 2.0 };

		m2[0] = new Double[] { 3.0, 4.0 };
		m2[1] = new Double[] { 3.0, 1.0 };
		m2[2] = new Double[] { 2.0, 3.0 };
	}

	/**
	 * Gera uma string da matriz m em formato amig�vel.
	 * 
	 * @param m
	 * @return
	 */
	private static String toString(Double m[][]) {
		String str = "";

		int linhas = m.length;

		for (int i = 0; i < linhas; i++) {
			System.out.println();
			toString(m[i]);
		}

		return str;

	}

	/**
	 * Gera uma string do vetor v em formato amig�vel.
	 * 
	 * @param v
	 * @return
	 */
	private static String toString(Double v[]) {
		String str = "";

		int elementos = v.length;

		for (int i = 0; i < elementos; i++) {
			System.out.print(v[i] + " ");
		}

		return str;

	}

}
