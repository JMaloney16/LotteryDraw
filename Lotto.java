import java.util.Scanner;

public class Lotto
{
    public static void numberCompare(int[] lottoNumbers, int[] chosenNumbers){
        int correctNum = 0;
        int bonus = 0;
        for (int i=0; i < 6;){
            if (chosenNumbers[i] == lottoNumbers[0] | chosenNumbers[i] == lottoNumbers[1] | chosenNumbers[i] == lottoNumbers[2] | chosenNumbers[i] == lottoNumbers[3] | chosenNumbers[i] == lottoNumbers[4] | chosenNumbers[i] == lottoNumbers[5]){
                correctNum++;
            }
            if (chosenNumbers[i] == lottoNumbers[6]){
                bonus = 1;
            }
            i++;
        }
        if (correctNum == 3){
            System.out.println("You won £10!");
        } else if (correctNum == 4){
            System.out.println("You won £100!");
        } else if (correctNum == 5){
            System.out.println("You won £10,000!");
            if (bonus == 1){
                System.out.println("BONUS BALL! You won £100,000!");
            }
        } else if (correctNum == 6){
            System.out.println("You won £1,000,000!");
        } else{
            System.out.println("You didn't win anything! Better luck next time!");
        }
    }
    public static void main(String[] args){
        int userCounter = 0;
        int[] lottoNumbers;
        lottoNumbers = new int[7];
        lottoNumbers[0] = (int)Math.ceil(Math.random() * 49);
        lottoNumbers[1] = (int)Math.ceil(Math.random() * 49);
        lottoNumbers[2] = (int)Math.ceil(Math.random() * 49);
        lottoNumbers[3] = (int)Math.ceil(Math.random() * 49);
        lottoNumbers[4] = (int)Math.ceil(Math.random() * 49);
        lottoNumbers[5] = (int)Math.ceil(Math.random() * 49);
        lottoNumbers[6] = (int)Math.ceil(Math.random() * 49);
        
        int[] chosenNumbers;
        chosenNumbers = new int[6];
        
        Scanner input = new Scanner(System.in);
        //System.out.println(lottoNumbers[6]);
        //System.out.println(lottoNumbers[5]);
        while (userCounter < 6){
            System.out.println("Enter a number between 1 and 49: ");
            int currentNo = input.nextInt();
            if (0 < currentNo && currentNo < 50){
                chosenNumbers[userCounter] = currentNo;
                //System.out.println(lottoNumbers[userCounter]);
                userCounter ++;
            }else{
                System.out.println("Not a valid number!");
            }
        }
        numberCompare(lottoNumbers, chosenNumbers);
    }
}
