public class AulaFor {
	public static void main(String[] args) {
		
		String [][] tabela = new String [3][3];
		
		//for(int z=0; z<tabela.length; z++) {
			//tabela[][] = "o";
		//}
		tabela[0][0] = "x";
		tabela[2][2] = "x";
		
		int i, x;
		
		for(i=0; i<tabela.length; i++) {
			System.out.println("");
			for(x=0; x<tabela.length; x++) {
				System.out.printf(tabela[i][x] + "  ");
			}
		}
		
		
		
		
	}

}
