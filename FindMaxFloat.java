package NewPackage;

public class FindMaxFloat {

    public static float compareTo(float a,float b,float c){
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        FindMaxFloat s = new FindMaxFloat();
        System.out.println("max Number for 1st test case="+s.compareTo(4.1f,2.6f,1.7f));  //Test case 1 :given max number for 1st position.
        System.out.println("max Number for 2nd test case="+s.compareTo(2.7f,6.0f,3.70f)); // for 2nd position.
        System.out.println("max Number for 3rd test case="+s.compareTo(1.1f,2.1f,1.2f));  //for 3rd position.
    }
}
