package paridadedasoma;
import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args){
        int resultado;
        int numA = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
        int numB = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
        //objetos
        Soma soma = new Soma(numA, numB);
        Paridade paridade;
        
        resultado = soma.calculo();
        soma.exibeCalculo(resultado);
        
        //instanciando objeto paridade
        paridade = new Paridade(resultado);
        
        if(paridade.verificaViolacao()==false){
            paridade.isNumEven();
        }
    }
}
