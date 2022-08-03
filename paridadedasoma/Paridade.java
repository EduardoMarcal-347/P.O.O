package paridadedasoma;
import javax.swing.JOptionPane;

public class Paridade {
    public int resultado;
    
    Paridade(int resultado){
        this.resultado = resultado;
    }
    
    public boolean verificaViolacao(){
        boolean verifica = false;
        if(this.resultado<0){
            JOptionPane.showConfirmDialog(null, "Para verificar paridade o resultado deve ser positivo ");
            verifica = true;
        }
        return verifica;
    }
    
    public void isNumEven(){
        if(this.resultado%2==0){
            JOptionPane.showConfirmDialog(null,"O resultado é par");
        } else {
            JOptionPane.showConfirmDialog(null,"O resultado é impar");
        }
    }
}
