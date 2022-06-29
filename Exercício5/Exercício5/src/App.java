import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){

        String usuario = JOptionPane.showInputDialog(null, "Digite uma String", 
        "AppJava",3);
        

        JOptionPane.showMessageDialog(null,"Antes: "+ usuario+ "\nDepois: "+Funcoes.inverter(usuario));
        
    }
}
