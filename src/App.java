import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        //declaração das Variaveis
        int num1 , num2;
        double divisao , potencia;
        String msg1, msg2  ="";


        //entrada de dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));


        //processamento
        divisao = num1/num2;
        potencia = Math.pow(num1, num2);
        msg1 = "A divisão de " +  num1 + " por " + num2 +" é = " + divisao;
        msg2 = "A Potencia de " +  num1 + " elevado a " + num2 +" é  = " + potencia;


        //saida
        JOptionPane.showMessageDialog(null, msg1);
        JOptionPane.showMessageDialog(null, msg2);
    System.exit(0);
    }
}
