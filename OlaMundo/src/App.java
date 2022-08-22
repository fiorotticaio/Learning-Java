import javax.swing.JOptionPane; // importanto o resurso que cria uma janelinha

public class App {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        int idade = 10;
        double altura = 1.55;
        String nome = "Caio";
        boolean pessoa = true;

        JOptionPane.showMessageDialog(null, "Idade = " + idade);
        JOptionPane.showMessageDialog(null, "Altura = " + altura);
        JOptionPane.showMessageDialog(null, "Nome = " + nome);
        JOptionPane.showMessageDialog(null, "É uma pessoa? " + pessoa);
    }
}
