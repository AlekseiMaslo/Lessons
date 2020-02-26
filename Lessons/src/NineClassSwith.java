import java.util.Scanner;

public class NineClassSwith {
    public static void  main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedi vozrast");
        int age = scanner.nextInt();
        switch (age) {
            case 0 :
                System.out.println("ti rodilsya");
                break;
            case 7 :
                System.out.println("ti poshel v shkolu");
                break;
            case 18 :
                System.out.println("ti zakonchil shkolu");
                break;
            default:
                System.out.println("nicego ne vipolnilos");
        }
    }
}
