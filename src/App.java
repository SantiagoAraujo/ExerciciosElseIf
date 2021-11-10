import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
    
        // Exercicio1
        // System.out.println("Informe o primeiro lado de uma forma:");
        // int lado1 = teclado.nextInt();
        // System.out.println("Informe o segundo lado de uma forma:");
        // int lado2 = teclado.nextInt();
        // System.out.println("Informe o terceiro lado de uma forma:");
        // int lado3 = teclado.nextInt();

        // Exercicio01 exercicio01 = new Exercicio01();
        // exercicio01.verificarForma(lado1, lado2, lado3);

        // Exercicio02
        // System.out.println("Informe um ano:");
        // int ano = teclado.nextInt();

        // Exercicio02 exercicio02 = new Exercicio02();
        // System.out.println(exercicio02.verificarAno(ano));

        // Exercicio03
        // System.out.println("Digite o nome do(a) investigado(a):");
        // String nomeInvestigado = teclado.nextLine();
        // Exercicio03 exercicio03 = new Exercicio03(nomeInvestigado);

        // System.out.printf("%s telefonou para a vítima? S para Sim e N para Não?",
        // nomeInvestigado);
        // String RespostaPergunta01 = teclado.nextLine();
        // if(!RespostaPergunta01.equalsIgnoreCase("S") &&
        // !RespostaPergunta01.equalsIgnoreCase("N")) {
        // System.out.println("Opção inválida!");
        // System.exit(0);
        // }

        // System.out.printf("%s esteve no local do crime? S para Sim e N para Não?",
        // nomeInvestigado);
        // String RespostaPergunta02 = teclado.nextLine();
        // if(!RespostaPergunta02.equalsIgnoreCase("S") &&
        // !RespostaPergunta02.equalsIgnoreCase("N")) {
        // System.out.println("Opção inválida!");
        // System.exit(0);
        // }

        // System.out.printf("%s mora perto da vítima? S para Sim e N para Não?",
        // nomeInvestigado);
        // String RespostaPergunta03 = teclado.nextLine();
        // if(!RespostaPergunta03.equalsIgnoreCase("S") &&
        // !RespostaPergunta03.equalsIgnoreCase("N")) {
        // System.out.println("Opção inválida!");
        // System.exit(0);
        // }

        // System.out.printf("%s devia para a vítima? S para Sim e N para Não?",
        // nomeInvestigado);
        // String RespostaPergunta04 = teclado.nextLine();
        // if(!RespostaPergunta04.equalsIgnoreCase("S") &&
        // !RespostaPergunta04.equalsIgnoreCase("N")) {
        // System.out.println("Opção inválida!");
        // System.exit(0);
        // }

        // System.out.printf("%s já trabalhou com a vítima? S para Sim e N para Não?",
        // nomeInvestigado);
        // String RespostaPergunta05 = teclado.nextLine();
        // if(!RespostaPergunta05.equalsIgnoreCase("S") &&
        // !RespostaPergunta05.equalsIgnoreCase("N")) {
        // System.out.println("Opção inválida!");
        // System.exit(0);
        // }

        // System.out.println(exercicio03.InvestigarIndividuos(RespostaPergunta01,
        // RespostaPergunta02, RespostaPergunta03,
        // RespostaPergunta04, RespostaPergunta05));

        // Exercicio04
        System.out.println("Insira o número de litros de combustível que foram vendidos:");
        float quantidadeLitros = teclado.nextFloat();
        System.out.println("Insira o tipo de combustível que foi utilizado: A-Álcool e G-Gasolina");
        String tipoCombustivel = teclado.next();

        if(!tipoCombustivel.equalsIgnoreCase("A") && !tipoCombustivel.equalsIgnoreCase("G")) {
            System.out.println("Opção inválida!");
            System.exit(0);
        }

        Exercicio04 exercicio04 = new Exercicio04();
        System.out.printf("O valor a ser pago é de R$%s", exercicio04.calcularValor(quantidadeLitros, tipoCombustivel));


        teclado.close();
    }
}
