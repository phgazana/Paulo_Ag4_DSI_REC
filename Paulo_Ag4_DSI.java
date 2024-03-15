package ficharios;

import java.util.Scanner;

public class Paulo_Ag4_DSI {
  public static void main(String[] args) {

    // declaração das variáveis
    String carro;
    double diaria;
    int dias;
    double km;
    Scanner leitor = new Scanner(System.in);

    // inicio do programa
    System.out.print("Digite o modelo do carro alugado: ");
    carro = leitor.next();

    System.out.print("Digite o valor da díaria para locação: ");
    diaria = leitor.nextDouble();

    System.out.print("Digite a quantidade de dias de locação: ");
    dias = leitor.nextInt();

    System.out.print("Digite a quantidade de Km percorridos: ");
    km = leitor.nextDouble();

    // saida de dados
    double total = (diaria * dias) + (km * 0.79);
    System.out.println("O modelo do carro é: " + carro);
    System.out.println("O valor total a pagar é: " + total);

    leitor.close();
  }
}
