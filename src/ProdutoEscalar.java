
public class ProdutoEscalar extends Thread {
	Double m1[];
	Double m2[];
	Double produtoEscalar;
	int linha;
	int coluna;

	public ProdutoEscalar(Double m1[], Double m2[], Double r, int linha, int coluna) {
		this.m1 = m1;
		this.m2 = m2;
		this.produtoEscalar = r;
		this.linha = linha;
		this.coluna = coluna;
	}

	@Override
	public void run() {
		this.produtoEscalar = this.produtoEscalar(this.m1, this.m2);
		System.out.println("\nThread: linha " + this.linha + ", coluna " + this.coluna);
	}

	/**
	 * Faz o produto escalar de dois vetores
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	private Double produtoEscalar(Double[] v1, Double[] v2) {
		int colunas = v1.length;

		Double acumulador = 0.0;

		for (int i = 0; i < colunas; i++) {
			acumulador += v1[i] * v2[i];
		}

		return acumulador;
	}
}
