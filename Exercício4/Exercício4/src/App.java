import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        double [] valores = {67836.43,36678.66,29229.88, 27165.48, 19849.53};

        Faturamento objeto = new Faturamento(valores);

        JOptionPane.showMessageDialog(null, "Faturamento total: "+ objeto.faturamentoTotal()+
        objeto.percentual());
    }
}
