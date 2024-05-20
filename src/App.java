
public class App {
    public static void main(String[] args) throws Exception{
        
        int numero1 = 10, numero2 = 0;
        int r;

        Calculadora calculadora = new Calculadora();



        try{
            r = calculadora.dividir(numero1, numero2);

            System.out.println(r);

        }catch (DividirPorCeroException e){
            e.printStackTrace();

        }

        

    }

}
