import java.util.Locale;
import java.util.Scanner;

public class raio {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi,raio,a;
        raio=sc.nextDouble();
        pi=3.14159;
        a= pi*(raio*raio);
        System.out.printf("A=%.4f",a);

        sc.close();
    }
}
