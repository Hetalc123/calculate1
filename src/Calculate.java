import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        //calculate percentage
        Scanner sc = new Scanner(System.in);
        System.out.println("----Student Name----");
        String name = sc.nextLine();
        System.out.println("Enter Marks:");
        System.out.print("English:");
        Float eng = sc.nextFloat();
        System.out.print("Physics:");
        Float phy = sc.nextFloat();
        System.out.print("History:");
        Float his = sc.nextFloat();
        System.out.print("Biology:");
        Float bio = sc.nextFloat();
        Float Total = eng + phy + his + bio;
        Float average = Total/4;
        Float Percentage = (Total/400)*100;
        System.out.print("Total:");
        System.out.println((Total) + "/400");
        System.out.print("Average:");
        System.out.println(average);
        System.out.print("Percentage:");
        System.out.println(Percentage);


    }
}
