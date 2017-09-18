package troco;

public class Troco {

		private float troco = 0;
		private float valorTotal, valorPago;

		private int qtdeCem, qtdeCinquenta, qtdeVinte, qtdeDez, qtdeCinco, qtdeDois, qtdeUm, qtdeCinqCentavos,
				qtdeVinteCincoCentavos, qtdeDezCentavos, qtdeCincoCentavos;

		public Troco(float valorTotal, float valorPago) {
			this.valorTotal = valorTotal;
			this.valorPago = valorPago;

			troco = valorPago - valorTotal;

			int troco100 = 0;
			int troco50 = 0;
			int troco20 = 0;
			int troco10 = 0;
			int troco5 = 0;
			int troco2 = 0;
			int troco1 = 0;
			float resto100 = 0;
			float resto50 = 0;
			float resto20 = 0;
			float resto10 = 0;
			float resto5 = 0;
			float resto2 = 0;
			float resto1 = 0;
			

			troco100 = (int) troco / 100;
			resto100 = troco % 100;
			qtdeCem = troco100;
			
			troco50 = (int) resto100 / 50;
			resto50 = resto100 % 50;
			qtdeCinquenta = troco50;
			
			troco20 = (int) resto50 / 20;
			resto20 = resto50 % 20;
			qtdeVinte = troco20;
			
			troco10 = (int) resto20 / 10;
			resto10 = resto20 % 10;
			qtdeDez = troco10;
			
			troco5 = (int) resto10 / 5;
			resto5 = resto10 % 5;
			qtdeCinco = troco5;
			
			troco2 = (int) resto5 / 2;
			resto2 = resto5 % 2;
			qtdeDois = troco2;
			
			troco1 = (int) resto2 / 1;
			resto1 = resto2 % 1;
			qtdeUm = troco1;
			
		}
		
		public int qtdeCem() {
			return qtdeCem;
		}
		
		public int qtdeCinquenta() {
			return qtdeCinquenta;
		}

		public int qtdeVinte(){
			return qtdeVinte;
		}
		
		public int qtdeDez(){
			return qtdeDez;
		}
		
		public int qtdeCinco(){
			return qtdeCinco;
		}
		
		public int qtdeDois(){
			return qtdeDois;
		}
		
		public int qtdeUm(){
			return qtdeUm;
		}
	}

