import java.util.Scanner;

public class KastRörelse {
    public static void main(String[] args) {
        double y = 0, x = 0, a, g = (9.82), v;
        Scanner scan = new Scanner(System.in);
        System.out.println("hastighet? vinkel(grader)?");
        v = scan.nextDouble();//4,75
        a = scan.nextDouble();//60

        for(double i = 0; y>=(-0.72); i+= 0.001){

            x = (v * i * Math.cos((a*Math.PI/180)));
            y = (v * i * Math.sin((a*Math.PI/180))) - (((g*Math.pow(i, 2))/2));

            System.out.println("(" + x + ", " + y + ")");
        }

    }
}
