import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("digite a quantidade de alunos da sala: ");
    var alunos = sc.nextInt();

    for (int i=0; i<alunos; i++) {
      System.out.println("digite a nota do " + (i + 1) + "º aluno");
      var nota = sc.nextInt();

      if (nota < 0 || nota > 10) {
        System.out.println("Nota inválida!");
      }else if (nota > 7) {
        System.out.println("Aluno Aprovado!");
      } else {
        System.out.println("Aluno reprovado!");
      }
    }

  }
}
