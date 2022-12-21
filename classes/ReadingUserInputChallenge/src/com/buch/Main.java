package com.buch;

public class Main {
    public static void main(String[] args){

        //System.out.println(getBucketCount(2.75,3.25,2.5, 1));
        //System.out.println(getBucketCount2(7.25,4.3,2.35));
        System.out.println(getBucketCount3(3.26,0.75));

        //System.out.println(Math.ceil(7.14/1.5));

        /*Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double i = 0;
        long avg = 0;


        while(true){
            //System.out.println("Enter a number");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();
                sum = sum + number;
                i = i + 1;

            }else
                break;

        }

        if (i > 0){
            avg = Math.round(sum/i);
        }else
             avg = 0;

        System.out.println("SUM = " + sum + " AVG = " +  avg);
        scanner.nextLine();
        scanner.close();*/

        /*Scanner scanner = new Scanner(System.in);

        int sum=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<=10;i++){
            System.out.println("Enter number no." + i + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int num = scanner.nextInt();
                sum = sum + num;
                if(num > max){
                    max = num;
                }
                if (num < min){
                    min = num;
                }
            }else
                System.out.println("Invalid Number");

            scanner.nextLine();

        }

        System.out.println("The sum of the numbers is : " + sum);
        System.out.println("Min is: " + min + "\nMax is : " + max);
        scanner.close();*/
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <=0 || extraBuckets < 0){
            return -1;
        }else{

            double area = width * height;
            double bucketsNeeded = Math.ceil(area/areaPerBucket);
            double buy = bucketsNeeded - extraBuckets;
            int value = (int)buy;

            return value;

        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <=0 ){
            return -1;
        }else{
            double area = width * height;
            double bucketsNeeded = Math.ceil(area/areaPerBucket);
            //double buy = bucketsNeeded - extraBuckets;
            int value = (int)bucketsNeeded;

            return value;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <=0 ){
            return -1;
        }else{
            double bucketsNeeded = Math.ceil(area/areaPerBucket);
            //double buy = bucketsNeeded - extraBuckets;
            int value = (int)bucketsNeeded;

            return value;
        }
    }

}

//    public void inputThenPrintAndAverage(){
//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//        int i = 0;
//
//        while(true){
//            System.out.println("Enter a number");
//            boolean hasNextInt = scanner.hasNextInt();
//
//            if(hasNextInt){
//                int number = scanner.nextInt();
//                sum = sum + number;
//            }else
//                break;
//
//
//        }
//
//        int avg = sum/i;
//
//        System.out.println("SUM = " + sum + "AVG = " + avg);
//
//        }
    //}
//}



























