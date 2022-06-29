import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args)  {
       
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", 
        "AppJava",3));

        if(Fibonacci.verifica(numero)== true){
            JOptionPane.showMessageDialog(null,
            "O número que você digitou tem na sequencia fibonacci");
        }else{
            JOptionPane.showMessageDialog(null,
            "O número que você digitou não tem na sequência fibonacci");
        }

    }
}
