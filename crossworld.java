public class crossworld{
	public static void main(String args[]){
		// przygotowanie struktóry dla krzyżówki
		char[][]crossworld = new char[3][];
		crossworld[0] = new char[4]; // wilk
		crossworld[1] = new char[3]; // kot
		crossworld[2] = new char[6]; // żyrafa

		// przypisanie wartości
		crossworld[0][0]= 'w';
		crossworld[0][1]= 'i';
		crossworld[0][2]= 'l';
		crossworld[0][3]= 'k';


		crossworld[1][0]= 'k';
		crossworld[1][1]= 'o';
		crossworld[1][2]= 't';


		crossworld[2][0]= 'ż';
		crossworld[2][1]= 'y';
		crossworld[2][2]= 'r';
		crossworld[2][3]= 'a';
		crossworld[2][4]= 'f';
		crossworld[2][5]= 'a';
		// wyświetlenie krzyżówki

		System.out.println("-----------------------");
		System.out.println(crossworld[0][0]+" "+crossworld[0][1]+" "+crossworld[0][2]+" "+crossworld[0][3]);
		System.out.println(crossworld[1][0]+" "+crossworld[1][1]+" "+crossworld[1][2]);
		System.out.println(crossworld[2][0]+" "+crossworld[2][1]+" "+crossworld[2][2]+" "+crossworld[2][3]+" "+crossworld[2][4]+" "+crossworld[2][5]);
		System.out.println("-----------------------");

		// pierwsza litera z drugiego słowa
		System.out.println(" Pierwsza literaz drugiego słowa: "+crossworld[1][0]);
		// długość trzeciego słowa
		System.out.println(" Długość trzeciego słowa: "+crossworld[2].length);
		// zamiana żyrafa na żyrafy
		crossworld[2][5] = 'y';
	}
}
