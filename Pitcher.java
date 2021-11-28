import java.util.Scanner;
// import java.util.*;
public class Pitcher{
    public static void main(String args[]){
        Pitcher test = new Pitcher();
        Scanner scan = new Scanner(System.in);
        int pitchNum = test.getPitchNum(scan);
        while(pitchNum > 0){
            String pitchType = test.getPitchType(scan);
            int pitchSpeed = test.getPitchSpeed(scan);
            pitchNum--;
        }
        scan.close();
    }

    public String getPitchType(Scanner scan){
        // gets pitch that was thrown last
        System.out.println("Please enter the type of pitch thrown:");
        String pitchType = scan.nextLine();
        System.out.println("The pitch was a " + pitchType);
        return pitchType;
    }
    
    public int getPitchNum(Scanner scan){
        // this get current pitchcount of the pitcher
        System.out.println("How many pitches have been thrown:");
        int pitchCount = scan.nextInt();
        System.out.println("The total pitches thrown is " + pitchCount);
        return pitchCount;
       
    }

    public int getPitchSpeed(Scanner scan){
        System.out.println("Enter the pitch speed:");
        int pitchSpeed = scan.nextInt();
        System.out.println("The pitch speed is: " + pitchSpeed);
        return pitchSpeed;
        
    }
    
}