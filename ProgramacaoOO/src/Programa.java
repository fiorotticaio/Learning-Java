public class Programa {
    public static void main(String[] args) {
        
        Caneca canecaJava = new Caneca(); // criando o objeto caneca (classe) na memoria do computador

        canecaJava.cor = "preta";
        canecaJava.volume = 450;
        canecaJava.diametro = 3.0;

        System.out.print("A caneca esta ");
        canecaJava.estadoCaneca();
        System.out.println(canecaJava.cor);
        System.out.println(canecaJava.volume + "ml");
        System.out.println(canecaJava.diametro + "cm");
    }
}
