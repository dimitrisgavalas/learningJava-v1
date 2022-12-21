public class Main {

    public static void main(String[] args){

        double ena = 20.00d;
        double duo = 80.00d;
        double sum;

        sum = (ena + duo) * 100.00d;
        System.out.println(sum);

        double neo = sum % 40.00d;
        System.out.println(neo);
        boolean kat = neo==0 ? true : false;
        System.out.println(kat);

        System.out.println("The boolean variable is " +kat);
        if (kat == false){
            System.out.println("Got some reminder");
        }

    }
}
