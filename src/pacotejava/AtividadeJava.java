package pacotejava;
import javax.swing.*;

public class AtividadeJava {
    public static void main(String[] args) {
        
         double V1, V2, Resp = 0;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Insira o Primeiro valor: ");
        V1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira o Segundo valor: ");
        V2 = Double.parseDouble(aux);

        Resp = (V1 * V2);

        JOptionPane.showMessageDialog(null, "O Resultado da multiplicação é: " + Resp);
    }


    }
    

