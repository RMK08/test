public class Tester {
    public static boolean isPrime(int x){ 
        boolean t = true; 
        for (int i = 2; i < x; i++){ 
            if (x%i==0){ 
                t = false;
            } 
         } 
         return t; 
    }
    // test comment 2
    public static int nthPrime(int n) {
        int counter = -1;
        int prime = 1; 
        while (counter < n) {
            prime++;
            if (isPrime(prime)) {
                counter++;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int[] inputs   = {0, 1, 2, 3, 5, 8, 13, 50, 100};
        int[] expected = {2, 3, 5, 7, 13, 23, 43, 233, 547};

        for (int i = 0; i < inputs.length; i++) {
            int result = nthPrime(inputs[i]);
            if (result == expected[i]) {
                System.out.println("pass");
            } else {
                System.out.println("fail expected " + expected[i] + ", but value returned was " + result);
            }
        }
    }
}
