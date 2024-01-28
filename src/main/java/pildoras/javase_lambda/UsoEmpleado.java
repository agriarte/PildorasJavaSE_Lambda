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
public class UsoEmpleado {
    
     public static void main(String[] args) {
         ArrayList<Empleado> misEmpleados = new ArrayList<>();
         misEmpleados.add(new Empleado("Juan", 30000));
         misEmpleados.add(new Empleado("Pedro", 40000));
         misEmpleados.add(new Empleado("Maria", 25000));
         misEmpleados.add(new Empleado("Sara", 50000));
         
         //ordenar por salario porque se implementa la clase Comparable que sobreescribe el método CompareTo
         Collections.sort(misEmpleados);
         
         for (Empleado e: misEmpleados) {
             System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
         }
         
    }
    
}
