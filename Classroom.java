import java.util.Arrays;
public class Classroom {

    public static void main(String[] args) {
        String[] students = {"Sade", "Alexus", "Sam", "Koma"}; // creates string array with 4 values

        double[] mathScores = new double[4]; // Creates empty array with size of 4
        mathScores[0] = 94.5;
        mathScores[2] = 76.8;

        System.out.println("The number of students in the class is " + students.length);
        System.out.println("The classroom contains the following students: " + Arrays.toString(students)); // must use Arrays.toString to display values
    }
}
