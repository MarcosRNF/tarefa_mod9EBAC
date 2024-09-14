import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        System.out.println("Valor digitado e armazenado na variavel do tipo primitivo: " + valor);
        Integer valor2 = valor;
        System.out.println("Valor convertido para uma classe Wrapper: " + valor2);
        sc.close();

        // Decidi também fazer do Wrapper para o primitivo
        int valor3 = valor2;
        System.out.println("Valor convertido de Wrapper para primitivo: " + valor3);
    }

}