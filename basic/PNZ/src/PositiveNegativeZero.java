public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(4);
    }

    public static void checkNumber(int number){

        if(number > 0){
            System.out.println("Positive");
        }else if(number == 0){
            System.out.println("Zero");
        }else
            System.out.println("Negative");
    }

}
