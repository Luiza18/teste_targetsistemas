public class Fibonacci {
    
    public static boolean verifica(int  numero){
        int [] sequenciaFibonacci = new int [100];
        sequenciaFibonacci[0] = 0;
        sequenciaFibonacci [1] = 1;

        for( int i = 2; i < sequenciaFibonacci.length; i++){
            sequenciaFibonacci[i] = sequenciaFibonacci[i-1] + sequenciaFibonacci [i+1];
            if(sequenciaFibonacci[i] == numero){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
