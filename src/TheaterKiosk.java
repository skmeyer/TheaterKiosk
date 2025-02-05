import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int userAge = 0;
        int WRIST_BAND_AGE = 21;

        System.out.print("Enter your age: ");
        userAge = in.nextInt();
        if(userAge >= WRIST_BAND_AGE)
        {
            System.out.println("You get a paper wrist band!");
        }

        
    }
}