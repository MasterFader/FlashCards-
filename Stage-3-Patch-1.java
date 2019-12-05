package flashcards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("Input the number of cards:");
        int numOfCards = scannerInt.nextInt();
        String[][] flashCard = new String[numOfCards][2];

        for(int i=0;i<numOfCards;i++){
//
            for(int j=0;j<2;j++){

                switch(j){
                    case 0:
                        System.out.println("The card #"+ (i+1) +":");
                        flashCard[i][j] = scanner.nextLine();
                        break;
                    case 1:
                        System.out.println("The definition of the card #"+ (i+1) +":");
                        flashCard[i][j] = scanner.nextLine();
                        break;
                    default:
                        break;
                }
            }
        }

        for(int i=0;i<numOfCards;i++){

            System.out.println("Print the definition of " + "\"" + flashCard[i][0]+ "\"");
            String answer = scanner.nextLine();
            checkDefinition(flashCard[i][1],answer);

        }

    }

    private static void checkDefinition(String definitionOfCard, String answer) {
        if(definitionOfCard.equals(answer)){
            System.out.println("Correct answer.");
        }else{
            System.out.println("Wrong answer. The correct one is " + "\"" +definitionOfCard + "\"");
        }
    }
}
