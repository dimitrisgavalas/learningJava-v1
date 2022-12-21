public class Main {

    public static void main(String[] args){

       /* int muVariable = 50;
        muVariable++;
        muVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +"another" + "still more.");

        int anothrVarible = 50;
        boolean gameOver = true;
        int hj;*/
       boolean gameOver = true;
       int score = 800;
       int levelCompleted = 5;
       int bonus = 100;

       calculateScore(gameOver, score, levelCompleted, bonus);

       score = 10000;
       levelCompleted = 8;
       bonus = 2000;

       calculateScore(gameOver, score, levelCompleted, bonus);

       int highScore;
       int finalScore = 1500;
       highScore = calculateHighScorePosition(finalScore);
       displayHighScorePosition("jim", highScore);

        finalScore = 900;
        highScore = calculateHighScorePosition(finalScore);
        displayHighScorePosition("bob", highScore);

        finalScore = 400;
        highScore = calculateHighScorePosition(finalScore);
        displayHighScorePosition("cam", highScore);

        finalScore = 50;
        highScore = calculateHighScorePosition(finalScore);
        displayHighScorePosition("san", highScore);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        if(gameOver){
            int finalScore;
            finalScore = score +(levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was "+finalScore);
            return finalScore;
        }

        return -1;

    }



    public static void  displayHighScorePosition(String playersName, int highScoreTablePosition){
        System.out.println(playersName +" managed to get into position " + highScoreTablePosition +" on the high score table");
    }

    public static int calculateHighScorePosition(int finalScore){

        if(finalScore >1000) {
            return 1;
        }else if(finalScore > 500 && finalScore<1000){
            return 2;
        }else if(finalScore > 100 && finalScore <500){
            return 3;
        }else{
            return 4;
        }

    }

}
