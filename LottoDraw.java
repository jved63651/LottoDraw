import java.util.Scanner;

public class LottoDraw
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
   
    int[] number = {0,0,0,0,0,0, 0};
    int firstnum, secondnum, thirdnum, forthnum, fifthnum, sixthnum, bonusball = 0;
    int matching = 0;
    int jackpot = 0;
    int bonus1 = 0;
    boolean bonus = false;
    
    
    number[0] = (int)Math.ceil(Math.random()) * 49;
    number[1] = (int)Math.ceil(Math.random()) * 49;
    number[2] = (int)Math.ceil(Math.random()) * 49;
    number[3] = (int)Math.ceil(Math.random()) * 49;
    number[4] = (int)Math.ceil(Math.random()) * 49;
    number[5] = (int)Math.ceil(Math.random()) * 49;
    number[6] = (int)Math.ceil(Math.random()) * 49;
    
    System.out.println("Enter your first number");
    firstnum = sc.nextInt();
    if (firstnum<1 || firstnum>49) {
        System.out.println("Number is out of range");
    }
    
    System.out.println("Enter your second number");
    secondnum = sc.nextInt();
     if (secondnum<1 || secondnum>49) {
        System.out.println("Number is out of range");
    }
    
    System.out.println("Enter your third number");
    thirdnum = sc.nextInt();
     if (thirdnum<1 || thirdnum>49) {
        System.out.println("Number is out of range");
    }
    
    System.out.println("Enter your forth number");
    forthnum = sc.nextInt();
     if (forthnum<1 || forthnum>49) {
        System.out.println("Number is out of range");
    }
    
    System.out.println("Enter your fifth number");
    fifthnum = sc.nextInt();
     if (fifthnum<1 || fifthnum>49) {
        System.out.println("Number is out of range");
    }
    
    System.out.println("Enter your sixth number");
    sixthnum = sc.nextInt();
     if (sixthnum<1 || sixthnum>49) {
        System.out.println("Number is out of range");
    }
    
    System.out.println("Enter your bonusball number");
    bonusball = sc.nextInt();
     if (bonusball<1 || bonusball>49) {
        System.out.println("Number is out of range");
    }
    
    if (firstnum == number[0]|| firstnum == number[1]|| firstnum == number[2]
    || firstnum == number[3] || firstnum == number[4]|| firstnum == number[5]) {
        matching++;
    }
    
    if (secondnum == number[0]|| secondnum == number[1]|| secondnum == number[2]
    || secondnum == number[3] || secondnum == number[4]|| secondnum == number[5]) {
        matching++;
    }
    
    if (thirdnum == number[0]|| thirdnum == number[1]|| thirdnum == number[2]
    || thirdnum == number[3] || thirdnum == number[4]|| thirdnum == number[5]) {
        matching++;
    }
    
    if (forthnum == number[0]|| forthnum == number[1]|| forthnum == number[2]
    || forthnum == number[3] || forthnum == number[4]|| forthnum == number[5]) {
        matching++;
    }
    
    if (fifthnum == number[0]|| fifthnum == number[1]|| fifthnum == number[2]
    || fifthnum == number[3] || fifthnum == number[4]|| fifthnum == number[5]) {
        matching++;
    }
    
    if (sixthnum == number[0]|| sixthnum == number[1]|| sixthnum == number[2]
    || sixthnum == number[3] || sixthnum == number[4]|| sixthnum == number[5]) {
        matching++;
    }
    
    if (bonusball == number[6]) {
        bonus = true;
        bonus1 = 1;
    }
    
    if (matching == 6 ) {
        jackpot = 1000000;
     } else if (matching == 5 && bonus1 == 1) {
       jackpot = 100000;
     } else if (matching == 5) {
        jackpot = 10000;
     } else if (matching == 4) {
        jackpot = 100;
     } else if (matching == 3) {
        jackpot = 10;
     } else {
        jackpot = 0;
     }
    System.out.println("Your winnings are £"+jackpot);
  }
}
