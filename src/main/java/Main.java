public class Main {
     public static void main(String[] args) {

         Ints calc = new IntsCalculator();
         System.out.println(calc.sum(2,2).result);
         System.out.println(calc.mult(22,32).result);
         System.out.println(calc.pow(10,20).result);



    }
}
