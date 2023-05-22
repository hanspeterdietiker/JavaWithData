package Aplicação;
import Entidades.Funcionario;
import Entidades.FuncionarioTerceirizado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();


        System.out.print("Qual é o numero de funcionarios?");
        int Func = sc.nextInt();

        for (int i = 1; i <= Func; i++) {
            System.out.println("Informe os Dados do funcionario " + i );

            System.out.print("O funcionario e terceirizado? (S/N) ");
            char FuncT = sc.next().charAt(0);

            System.out.println("Nome do funcionario:");
            sc.nextLine();
            String Nome = sc.nextLine();

            System.out.println("Horas de Expediente: ");
            int Horas = sc.nextInt();

            System.out.print("Valor por Horas: ");
            double valorPorHora = sc.nextDouble();

            if (FuncT == 'S') {
                System.out.print("Adicional: ");
                double Adicional = sc.nextDouble();
                Funcionario funCionario = new FuncionarioTerceirizado(Nome, Horas, valorPorHora, Adicional);
                list.add(funCionario);
            } else {
                Funcionario funCionario = new Funcionario(Nome, Horas, valorPorHora);
                list.add(funCionario);
            }
            System.out.println();
            System.out.println("Pagamentos: ");
            for (Funcionario funcionario : list) {
                System.out.println(funcionario.getNome() + " - R$ " + funcionario.pagamento());


            }

        }
        sc.close();
    }
}