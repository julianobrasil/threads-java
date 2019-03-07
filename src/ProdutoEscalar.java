
public class ProdutoEscalar {
	Double m1[];
	Double m2[];
	Container resultado;

	public ProdutoEscalar(Double m1[], Double m2[], Container r) {
		this.m1 = m1;
		this.m2 = m2;
		this.resultado = r;
	}

	/**
	 * Faz o produto escalar de dois vetores
	 * 
	 * @param v1
	 * @param v2
	 * @param r
	 * @return
	 */
	public void produtoEscalar() {
		int colunas = m1.length;

		Double acumulador = 0.0;

		for (int i = 0; i < colunas; i++) {
			acumulador += m1[i] * m2[i];
		}

		resultado.valor = acumulador;
	}

}
