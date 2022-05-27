import java.util.Scanner;

public class usalmaRecursive {

    static int result = 1;
    static int temp (int exp, int base){
        if (exp == 0)
            return 1;

        result *= base;
        temp(exp-1,base);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int exp, base;

        System.out.print("İlk değeri girin: ");
        base = scan.nextInt();

        System.out.print("İkinci değeri girin: ");
        exp = scan.nextInt();

        System.out.println("Sonuç : "+temp(exp,base));
    }
}