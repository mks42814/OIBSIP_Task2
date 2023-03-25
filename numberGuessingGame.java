import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pcNum=0;
        int userNum;

        byte guessAttempts, score=0;

        System.out.println("== * Welcome to number guessing game * ==");

        System.out.print("Enter the total attempts: ");
        guessAttempts = input.nextByte();

            pcNum = (int)(Math.random()*100);
            System.out.println("Pc: " + pcNum);

            do{

                if(guessAttempts <= 0){
                    System.out.println("\nYou have exhausted your total attempts!");
                    break;
                }

                System.out.println("To quit please enter -1 or guess a number between 1 to 100");
                guessAttempts--;

                System.out.print("Please enter your guess: ");
                userNum = input.nextInt();

                if(userNum == -1){

                    System.out.println("\nQuiting game!");
                    break;
                } else if (userNum > 0 && userNum <= 100){
                    if(userNum == pcNum) {
                        System.out.println("\nYou win! you guessed the number.\n");
                        score += guessAttempts;
                       break;
                    } else if(userNum > pcNum ){
                        System.out.println("The number is lower\n");
                    } else if (userNum < pcNum) {
                        System.out.println("The number is higher\n");
                    }
                }else{
                    System.out.println("Error ! Please enter a correct input");
                    break;
                }

            }while(userNum > 0);


        System.out.println("Your score is: " + score);
        System.out.println("\nThank you for playing");


    }
}



