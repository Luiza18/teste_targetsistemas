public class Funcoes {
    private String usuario;

    public Funcoes(String usuario){
        this.usuario =  usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public static String inverter(String usuario){
       char [] usuarioArray = usuario.toCharArray();
       String invertida = "";
       char letra;
        int tamanho = usuarioArray.length - 1;
        int inicio = 0; 

        while(tamanho >= inicio){
            letra = usuarioArray[inicio];
            usuarioArray[inicio] = usuarioArray[tamanho];
            usuarioArray[tamanho] = letra;

            tamanho --;
            inicio ++;
        }

       for(int i =0; i < usuarioArray.length; i++){
        invertida = invertida + usuarioArray[i];
       }

       return invertida;
    }
}
