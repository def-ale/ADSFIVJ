import java.util.Scanner;
import java.util.ArrayList;

public class Program
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();
        
        System.out.println("Quantos Funcionários irá cadastrar? Qtd: ");
        int qtd = sc.nextInt();
        
        for (int i = 0; i < qtd; i++){
            System.out.println("Funcionario #" + (i+1));
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Horas trabalhadas: ");
            int horas = sc.nextInt();
            System.out.println("Valor por hora: R$");
            Double valorHora = sc.nextDouble();
            System.out.println("É terceirizado? (S/N): ");
            char resp = sc.next().charAt(0);
            if (resp == 'S' || resp == 's'){
                System.out.println("Valor da despesa adicional: R$");
                Double despesaAdicional = sc.nextDouble();
                Funcionario f = new FuncionarioTerceirizado(nome, horas, valorHora, despesaAdicional);
                lista.add(f);
            }else if (resp == 'N' || resp == 'n'){
                Funcionario f = new Funcionario(nome, horas, valorHora);
                lista.add(f);
            }
        }
        
        System.out.println("#- PAGAMENTOS -#");
        for (Funcionario f : lista){
            System.out.println(f);                      
        }
        
        sc.close();
    }
}
