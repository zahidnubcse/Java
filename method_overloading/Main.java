class MathUtils {
    int add (int a, int b){
    return a + b;
    
    }

    double add (double a, double b){
         return a + b;
    }

    int add (int a, int b, int c){
        return a + b + c;
    }

}

public class Main {
    public static void main(String[] args) {
        MathUtils MU = new MathUtils();
        System.out.println(MU.add(1,2));
        System.out.println(MU.add(5.5,2.5));
        System.out.println(MU.add(5,2,8));
    }
}