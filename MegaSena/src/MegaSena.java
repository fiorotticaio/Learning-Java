import java.util.Random;
import java.util.Scanner;
// import br.com.caio.megasena.User;

public class MegaSena {

    // variaveis que nao de escopo local de funcoes
    // padrao (default)
    static int num1;

    // public (visibilidade publica p/ todas as packages)
    public static int num2;

    // private (visibilidade privada p/ todas as packages, somenta a calsse atual pode acessar essa variavel)
    private static int num3;

    // protected (POO)
    protected static int num4;


    public static void main(String[] args) throws Exception {
        /* esse new eh pra objetos
        Random generate = new Random();
        int number = generate.nextInt(60); // gera um numero aleatorio de 0 a 60
        */

        /*
        User userDefault = new User();
        User userCaio = new User();
        */

        /* "scanf()"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Olá, "+name);
        */

        /* tipo nao primitivo, tem funcoes imbutidas acesaas com .
        Integer x = 4;
        */
    }

    public static void soma(int a, int b){
        System.out.print(x); // daria erro, pois x esta no escopo de main(), e nao de soma()
        System.out.print(a + b);
    }
}
