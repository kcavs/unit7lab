import java.util.*;
public class Lab{
    public static void main(String[]args){
        ArrayList<String> colors= new ArrayList<String>();
        for(int i=0;i<6;i++){
            Scanner input= new Scanner(System.in);
            System.out.print("what is your favorite color?: ");
            String userInput=input.nextLine();
            colors.add(userInput);
        }
        for(String i: colors){
            System.out.println(i);
        }
    }
}