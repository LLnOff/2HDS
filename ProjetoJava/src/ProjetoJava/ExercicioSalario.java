package ProjetoJava;

import javax.swing.*;

public class ExercicioSalario {

    public static void main(String[] args) {
        String aux = "";
        double salario = 0, aliquota = 0, valorDesconto = 0, valorLiquido = 0;

        aux = JOptionPane.showInputDialog(null, "Insira o Salário: ","Salário",-1);
        salario = Double.parseDouble(aux);
        if(salario >= 465.00 || salario <= 965.67){
            
            valorDesconto = (salario * 8.0/100);
            valorLiquido  = (salario - valorDesconto);
            aliquota= 8.0;
            
            JOptionPane.showMessageDialog(null, "Salário: " + salario + "\n aliquota INSS: " + aliquota + "\n Valor Desconto: R$" + valorDesconto + "\n Valor Liquido: " + valorLiquido, "Saída", -1);
            
        }
        
            
      
        
    }
}
