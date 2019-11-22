package loop_B;

public class Metodo {

	private float resultado=1,x=0;;
	private int termo;
	 
	public void setQuantidade(int termo) {
			this.termo=termo;
			
		for (int i=1;i<termo;i++)
			{
				
				resultado+=x;
				x=resultado-x;
			}
		if(termo<=0) {
			resultado=0;
		}
	}
	
		public float getUltimo() {
			return resultado;
		}
}

	
	

