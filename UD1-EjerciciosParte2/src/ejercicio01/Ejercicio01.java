package ejercicio01;

import java.util.Scanner; //Paquete encargado de registrar la entrada.

public class Ejercicio01{
   
	public static void main(String[] args) {
       
	   double numeroDecimal, numeroResta; //Variables que almacenarán el número introducido y la parte decimal calculada.
       Integer numeroNoDecimal, numeroRedondeado; //Variables que almacenarán la parte entera del número y el resultado final redondeado.
       Scanner sc = new Scanner(System.in); //La clase Scanner permite al sistema leer el valor introducido por el usuario.
       
       System.out.print("Introduce un número para ser redondeado: "); //El sistema escribe en pantalla para que el usuario sepa qué debe escribir.
       numeroDecimal = sc.nextDouble(); //El sistema espera a que el usuario introduzca un número decimal y lo asigna a numeroDecimal.
       sc.close(); //Se cierra el Scanner, ya que no se necesita leer nada más del usuario a partir de aquí.
       
       numeroNoDecimal = (int) numeroDecimal; //(int) convierte el valor double de numeroDecimal a Integer.
       numeroResta = numeroDecimal - numeroNoDecimal; //Se calcula la parte decimal restando la parte entera al número original.
       
       if (numeroResta > 0.5) { //Se comprueba si la parte decimal es mayor que 0.5, en cuyo caso hay que redondear hacia arriba.
    	   numeroRedondeado = (int) numeroDecimal; //Se toma la parte entera como base para el resultado.
           ++numeroRedondeado; //Se incrementa en 1 la parte entera, completando el redondeo hacia arriba.
           System.out.println("El numero redondeado es: " + numeroRedondeado); //Se muestra en pantalla el resultado ya redondeado.
           return; //Se termina la ejecución del método aquí, sin llegar a las líneas siguientes.
       } 
       
       else { //Si la parte decimal no es mayor que 0.5, se ejecuta el else.
           if (numeroResta == 0.5) { //se comprueba si numeroResta es exactamente igual a 0.5.
               System.out.println("El número no se redondea ya que su decimal es 0.5. Se queda como: " + numeroDecimal); //Se informa de que el número no se redondea, mostrando el valor original.
               return; //Se termina la ejecución del método aquí, sin llegar a las líneas siguientes.
           }
           numeroRedondeado = (int) numeroDecimal; //Si la parte decimal es menor que 0.5, el resultado es directamente la parte entera, sin modificar.
           System.out.println("El numero redondeado es: " + numeroRedondeado); //Se muestra en pantalla el resultado redondeado.
       }
   }
}