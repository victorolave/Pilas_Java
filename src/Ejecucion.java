
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor Olave
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner escaner = new Scanner(System.in);
        
        Metodos metodos = new Metodos(0);
        
        int opcion = 0;
             
        do
        {
                System.out.println("___________________________");
                System.out.println("____________MENU__________");
                System.out.println("1.Definir tamaño");
                System.out.println("2.Apilar");
                System.out.println("3.Desapilar");
                System.out.println("4.Vaciar Pila");
                System.out.println("5.Mostrar Pila");
                System.out.println("6.Salir");
                System.out.println("___________________________");
                System.out.println("Digite una opción");
                opcion = escaner.nextInt();
                System.out.println("___________________________");
          
            switch(opcion)
            {
                case 1: 
                    System.out.println("___________________________");                 
                    metodos.DefinirTamaño();
                    System.out.println("___________________________");      
                 break;
                 
                 case 2:
                    System.out.println("___________________________");                  
                    metodos.Apilar();
                    System.out.println("___________________________");
                 break;

                 case 3:
                    System.out.println("___________________________");
                    metodos.Desapilar();
                    System.out.println("___________________________");
                 break;

                 case 4:
                    System.out.println("___________________________");
                    metodos.VaciarPila();
                    System.out.println("___________________________");
                 break;

                 case 5:
                    System.out.println("___________________________");
                    metodos.MostrarPila();
                    System.out.println("___________________________");
                 break;
            }      
        }
        while(opcion != 6);
     }
}