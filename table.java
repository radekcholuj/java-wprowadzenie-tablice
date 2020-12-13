class table{
	public static void main(String args[]){
		/**********************Zadanie1***************/
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
		System.out.println ("Zadanie 2");
		/************************Zadanie2***************/
		char[][] product = new char[3][];
		product[0] = new char[4];
		product[1] = new char[2];
		product[2] = new char[5];
		
		// wpisz buty
		product[0][0] = 'b';
		product[0][1] = 'u';
		product[0][2] = 't';
		product[0][3] = 'y';
		
		
		// wpisz rozmiar
		product [1][0] = 52;
		product [1][1] = 50;
		
		// wpisz cenê
		product [2][0] = '2';
		product [2][1] = '3';
		product [2][2] = '.';
		product [2][3] = '4';
		product [2][4] = '2';
		
		//wyœwietlenie produktu
		System.out.println ("--------------------");
		System.out.println (product[0][0]+" "+product[0][1]+" "+product[0][2]+" "+product[0][3]);
		System.out.println (product[1][0]+" "+product[1][1]);
		System.out.println (product[2][0]+" "+product[2][1]+" "+product[2][2]+" "+product[2][3]+" "+product[2][4]);
		System.out.println ("--------------------");
		
		
		
	}
}