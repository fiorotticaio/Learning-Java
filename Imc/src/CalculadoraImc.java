import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CalculadoraImc {
    public static void main(String[] args) throws Exception {

        double peso = 0.0, altura = 0.0, imc = 0.0;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

        imc = peso / (altura*altura);

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(imc);

        if(imc >= 18.8 && imc <= 24.9){
            JOptionPane.showMessageDialog(null, "IMC = "+valorFormatado + " - Peso normal\nParabéns");

        } else if(imc >= 25 && imc <= 29.9){
            JOptionPane.showMessageDialog(null, "IMC = "+valorFormatado + " - Sobrepeso");

        } else{
            JOptionPane.showMessageDialog(null, "IMC = "+valorFormatado + " - Qualquer outra coisa");
        }

        // Constantes
        final double PI = 3.1415; // tipo const double
        JOptionPane.showMessageDialog(null, PI);
    }
}