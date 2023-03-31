public class Math {
    
    public int sum(int valueA, int valueB){
        int total;
        total = valueA + valueB;
        return total;
    }

    public int subtraction(int valueA, int valueB) {
        int total; 
        total = valueA - valueB;
        return total;
    }

    public int division(int valueA, int valueB) {
        int total;
        total = valueA / valueB;
        return total;
    }

    public int multiplication(int valueA, int valueB) {
        int total;
        total = valueA * valueB;
        return total;
    }

    public static void main(String [] args) {
        Math sum = new Math();
        Math min = new Math();
        Math division = new Math();
        Math multiplication = new Math();
        int sumResult;
        int minResult;
        int divResult;
        int multiResult;
        sumResult = sum.sum(10,20);
        minResult = min.subtraction(10,5);
        divResult = division.division(10, 2);
        multiResult = multiplication.multiplication(2, 2);

        System.out.println("Sum otal is " + sumResult);
        System.out.println("Min total is " + minResult);
        System.out.println("Division total is "+ divResult);
        System.out.println("Multiplication total is " + multiResult);
    }
}
