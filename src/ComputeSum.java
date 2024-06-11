import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe 10 numeros.");
        System.out.println("Informe 0 para sair.");
        
        int sum = 0;
        int count = 0;
        
        while (count < 10) {
            int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            }
            
            sum += number;
            count++;
        }
        
        System.out.println("A soma dos números informados é " + sum + ".");
        
        scanner.close();
    }
}