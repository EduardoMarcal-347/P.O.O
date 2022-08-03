package paridadedasoma;
import javax.swing.JOptionPane;

public class Soma {
    
    public int numA, numB;
    
    Soma(int numA, int numB){
        this.numA = numA;
        this.numB = numB;
    }
    
    public int calculo(){
        return this.numA + this.numB;
    }
    
    public void exibeCalculo(int resultado){
        JOptionPane.showConfirmDialog(null, "O resultado é " + resultado);
    }
    
}

