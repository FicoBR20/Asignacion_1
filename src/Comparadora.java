import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Comparadora {

    public int fib_recurs(int n){
        int f=0;
        if(n<2){
            f=n;
            return f;
        }
        else{
            f = fib_recurs(n-1)+fib_recurs(n-2);
            return f;

        }
    }


    public int fib_list(int n){

        ArrayList<Integer>contenedor;
        contenedor = new ArrayList<Integer>(n);

        if(n<2){
            return n;
        }
        else{
            contenedor.add(0, 0);
            contenedor.add(1, 1);

            for (int i = 2; i <=n; i++) {

                contenedor.add(i, contenedor.get(i-2)+contenedor.get(i-1));
            }

        }

        return contenedor.get(n);

    }

    public static void main(String[] args) {

        Comparadora com = new Comparadora();

        

        int prueba =10;
       // Array de los 3,5,7 y 10 n valores fibonacci.
        ArrayList<Integer>probador;
        probador=new ArrayList<Integer>();

        // generacion de la serie recursivamente

//        for (int i = 0; i < prueba; i++) {
//
//            probador.add(i,com.fib_recurs(i));
//
//            System.out.println(" el valor recursivo de la serie fibonacci para n = " + i + " es " + probador.get(i));
//        }

        // generacion de la serie mediante lista

        for (int i = 0; i < prueba; i++) {

            probador.add(i,com.fib_list(i));

            System.out.println(" el valor usando una lista de la serie fibonacci para n = " + i + " es " + probador.get(i));
        }


    }
}