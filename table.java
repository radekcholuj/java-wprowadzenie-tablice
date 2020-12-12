class table{
	public static void main(String args[]){
		int [][] table = new int [3][3];
		
		// ustawienie wartoœci pierwszego wiersza i kolumny
		table [0][0] = 1;
		table [0][1] = table [1][0] = 2;
		table [0][2] = table [2][0] = 3;
		
		// obliczenie drugiego wiersza
		table [1][1] = table [0][1] * table[1][0];
		table [1][2] = table [1][0] * table[2][0];
		
		// obliczenie trzeciego wiersza
		table [2][1] = table [0][1] * table[2][0];
		table [2][2] = table [2][0] * table[0][2];
		
		// wyœwietlenie tabliczki
		System.out.println ("--------------------");
		System.out.println (table [0][0]+" "+table [0][1]+" "+table [0][2]);
		System.out.println (table [1][0]+" "+table [1][1]+" "+table [1][2]);
		System.out.println (table [2][0]+" "+table [2][1]+" "+table [2][2]);
		System.out.println ("--------------------");
	}
}