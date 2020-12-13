public class student {
    public static void main(String[] args) {
        int[] gradesMath = new int[5];
        int temp;

        gradesMath[0] = 1;
        gradesMath[1] = 2;
        gradesMath[2] = 3;
        gradesMath[3] = 1;
        gradesMath[4] = 2;

        System.out.println("Ostatnie trzy oceny to: ");
        System.out.print(gradesMath[2] + ", ");
        System.out.print(gradesMath[3] + ", ");
        System.out.print(gradesMath[4] + ", ");

        gradesMath[1] = 5;
        System.out.println("");

        temp = gradesMath[1];
        gradesMath[1] = gradesMath[4];
        gradesMath[4] = temp;
        temp = gradesMath[1];
        gradesMath[1] = gradesMath[3];
        gradesMath[3] = temp;
        temp = gradesMath[2];
        gradesMath[2] = gradesMath[3];
        gradesMath[3] = temp;

    }
}