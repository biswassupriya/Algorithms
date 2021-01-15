public class RecursionDataStructureExample {

    public static void main(String[] args){
        int x = 7 ;
        int result = x;
        function(x);
    }
    public static void function(int x){
       if(x == 0){
           System.out.println("Done");
       }else{
           System.out.println(x);
           function(x-1);
           System.out.println("Flower");
       }

    }
}
