import java.util.Scanner;
import java.util.logging.Logger;
public class Main
{
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        Logger log = Logger.getLogger(Main.class.getName());
        int materialStandards;
        float houseArea;
        boolean automated=false;
        log.info("Choose Material Standards\n1.standard\n2.above standard\n3.high standard\n");
        materialStandards=scanner.nextInt();
        log.info("Enter Area of House");
        houseArea=scanner.nextFloat();
        log.info("Do you want fully automated house?(Yes/No)");
        String s=scanner.next();
        if(s.equals("Yes") || s.equals("yes"))
            automated = true;
        Construction constructioncost = new Construction();
        log.info("Estimated Construction Cost : ");
        log.info(String.valueOf((int)constructioncost.gethouseConstructionCost(materialStandards, houseArea, automated)));
        scanner.close();
    }
}