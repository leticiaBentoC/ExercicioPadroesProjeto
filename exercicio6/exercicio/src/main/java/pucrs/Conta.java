package pucrs;

enum Categoria {
	NORMAL, ADVANCED, PREMIUM
};

public class Conta {

	public static class Builder {
		private Long numero;
		private String nomeCorrentista;
		private int saldoLivreInicial = 0;
		private int salAplicacaoInicial = 0;
		private double taxaRemuneracao = 0;
		private double taxaSaldoNegativo = 0;
		private Categoria categoriaInicial = Categoria.NORMAL;

		public Builder() {
		}

		public Builder numero(Long numero) {
			this.numero = numero;
			return this;
		}

		public Builder nomeCorrentista(String nome) {
			this.nomeCorrentista = nome;
			return this;
		}

		public Builder saldoLivreIni(int saldo) {
			this.saldoLivreInicial = saldo;
			return this;
		}

		public Builder saldoAplicacaoIni(int saldo) {
			this.salAplicacaoInicial = saldo;
			return this;
		}

		public Builder taxaRemuneracao(Double taxa) {
			this.taxaRemuneracao = taxa;
			return this;
		}

		public Builder taxaSaldoNeg(Double taxa) {
			this.taxaSaldoNegativo = taxa;
			return this;
		}

		public Builder categoriaInicial(Categoria categoria) {
			this.categoriaInicial = categoria;
			return this;
		}

		public Conta build() {
			return new Conta(this);
		}
	}

	private Conta(Builder builder) {
		this.numero = builder.numero;
		this.nomeCorrentista = builder.nomeCorrentista;
		this.saldoLivreInicial = builder.saldoLivreInicial;
		this.salAplicacaoInicial = builder.salAplicacaoInicial;
		this.taxaRemuneracao = builder.taxaRemuneracao;
		this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
		this.categoriaInicial = builder.categoriaInicial;
	}
}