import java.util.Scanner;

    public class Menu {
    Scanner scan = new Scanner(System.in);
    private int opcao;

    /*Fórmula para Cálculo da Velocidade de Download (em Mbps): A velocidade de download estimada (VD) será dada pela fórmula:
    VD = VelocidadePlano / (1 + (DistanciaServidores / 100))*/

    public void loopPrincipal() {
        do {
            mostrarMenu();
            try {
                switch (opcao) {
                    case 1:
                        calculadoraVelocidadeDownload();
                        break;

                    default:
                    limpa();
                    System.out.println("Opção inválida!");
                    voltarMenu();
                    break;
                    }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                voltarMenu();
            }

        } while (opcao != 0);
        }
    

    public void mostrarMenu() {
        limpa();
        System.out.println("*** Menu de Internet ***");
        System.out.println("1- Calcular a velocidade estimada");
        System.out.println("0- Sair");
        System.out.print("Opção: ");
        opcao = scan.nextInt(); scan.nextLine();
    }

    public void calculadoraVelocidadeDownload() {
        limpa();
        double distanciaServidores;
        double velocidadePlano;

        System.out.println("*** Calcular o download da internet ***");
        System.out.print("Informe a distancia de Servidores: ");
        distanciaServidores = scan.nextInt(); scan.nextLine();
        System.out.print("Informe a velocidade do Plano: ");
        velocidadePlano = scan.nextInt(); scan.nextLine();

        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");
        voltarMenu();
    }

    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        double VD = velocidadePlano / (1 + (distanciaServidores / 100));
        return VD;

    }
    public void limpa(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void voltarMenu(){
        System.out.println("Digite [ENTER] para voltar ao menu");
        scan.nextLine();
        scan.nextLine();
    }
}