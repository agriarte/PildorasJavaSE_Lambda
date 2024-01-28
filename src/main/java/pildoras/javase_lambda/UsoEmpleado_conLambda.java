/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras.javase_lambda;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Pedro
 */
public class UsoEmpleado_conLambda {
    
     public static void main(String[] args) {
         ArrayList<Empleado_conLambda> misEmpleados = new ArrayList<>();
         misEmpleados.add(new Empleado_conLambda("Juan", 30000));
         misEmpleados.add(new Empleado_conLambda("Pedro", 40000));
         misEmpleados.add(new Empleado_conLambda("Maria", 25000));
         misEmpleados.add(new Empleado_conLambda("Sara", 50000));
         
         System.out.println("Metodo 1");
         //ordenar por salario
         //Método 1 de Lambda para ordenar y mostrar por consola.
         //Son 2 sentencias. Se puede agrupar todo en una sola sentencia 
         
         Collections.sort(misEmpleados, (Empleado_conLambda e1, Empleado_conLambda e2) -> {
             return e1.getSalario().compareTo(e2.getSalario());
         });
         
         
         for (Empleado_conLambda e: misEmpleados) {
             System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
         }
         
         //Método 2 de uso de lambda para ordenar, mostrar, filtrar resultados...
         
         System.out.println("Metodo 2");
         
         misEmpleados
                 .stream()
                 .sorted((e1,e2) -> e1.getSalario().compareTo(e2.getSalario()))
                 .filter((Empleado_conLambda e) -> e.getSalario()<40000)
                 .forEach((Empleado_conLambda)->System.out.println(" Nombre: " + Empleado_conLambda.getNombre() + " Salario: " + Empleado_conLambda.getSalario()));
         
                 
         
    }
    
}
