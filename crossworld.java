public class crossworld{
	public static void main(String args[]){
		char[][]crossworld = new char[3][];
		
		char[] wolf = new char [4];
		wolf[0] = 'W';
		wolf[1] = 'I';
		wolf[2] = 'L';
		wolf[3] = 'K';
		
		char[] cat = new char [3];
		cat[0] = 'K';
		cat[1] = 'O';
		cat[2] = 'T';
		
		char[] giraffe = new char [6];
		giraffe[0] = '¯';
		giraffe[1] = 'Y';
		giraffe[2] = 'R';
		giraffe[3] = 'A';
		giraffe[4] = 'F';
		giraffe[5] = 'A';
		
		System.out.println("-----------------------");
		
		System.out.print(wolf[0]);
		System.out.print(wolf[1]);
		System.out.print(wolf[2]);
		System.out.println(wolf[3]);
		
		System.out.print(cat[0]);
		System.out.print(cat[1]);
		System.out.print(cat[2]);
		System.out.println(" ["+cat.length+"] ");
		
		System.out.print(giraffe[0]);
		System.out.print(giraffe[1]);
		System.out.print(giraffe[2]);
		System.out.print(giraffe[3]);
		System.out.print(giraffe[4]);
		System.out.print(giraffe[5]);
		
		System.out.println("-----------------------");
	}
}
