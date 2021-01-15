public class MathRecursionCalculationPowerFunction {
    public static void main(String[] args){
        int num ;
        int powerfornumber;
        System.out.println(power(5,3));
        System.out.println(power(1,5));
        System.out.println(factorial(4));
        System.out.println(factorial(0));

    }

    public static int power(int num, int powerfornumber) {
        if (powerfornumber == 0){
            return 1;
    }else{
            return num*power(num,powerfornumber-1);
        }
    }
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }

}
