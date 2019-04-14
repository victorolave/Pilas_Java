
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
public class Metodos
{
    Scanner escaner = new Scanner (System.in);
    
    int tamaño;
    int tope;
    int Pila[];
   
    public Metodos(int n)
    {
        this.tope = 0;
        this.tamaño = 100;
        this.Pila = new int [this.tamaño + 1];
    }
    
    public void DefinirTamaño()
    {
        System.out.println("¿Que tamaño?");
        this.tamaño = escaner.nextInt(); 
    }
    
    //Revisión si la pila esta llena
    public boolean PilaLlena()
    {
        if (this.tope == this.tamaño)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //Revision si la pila esta vacia
    public boolean PilaVacia()
    {
        if(tope == 0)
        {
            return true;
        }
        else
        {
            return false;
         }
    }
    
    //Eliminar elementos de la pila
    public void VaciarPila()
    {
        this.tope = 0;
    }
    
    //Añadir elementos a la pila
    public void Apilar()
    {
        if (this.PilaLlena())
        {
            System.out.println("No se puede apilar, la pila esta llena.");
        }
        else
        {
            System.out.println("Ingrese el elemento a apilar");
            this.tope++;
            this.Pila[this.tope] = escaner.nextInt();
        }
    }
    
    //Eliminar elemento
    public void Desapilar()
    {
        if(this.PilaVacia())
        {
            System.out.println("La pila esta Vacia");
        }
        else
        {
            int item = this.Pila[this.tope];
            System.out.println("El elemento eliminado es: "+item);
            this.tope--;
        }
    }
    
    //Mostrar Pila
    public void MostrarPila()
    {
        if(this.PilaVacia())
        {
            System.out.println("La pila esta Vacia");
        }
        else
        {
            for(int i = 1; i <= this.tope; i++)
            {
                System.out.println(this.Pila[i]);
            }
        }
    }
}
