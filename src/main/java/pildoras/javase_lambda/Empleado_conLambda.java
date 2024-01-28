/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pildoras.javase_lambda;

/**
 *
 * Diferencias: no requiere implementar la clase Comparable ni sobreescribir método
 * Importante, para poder ordenar es necesario modificar el getter de salario de "double" primitiva a "Double" objeto 
 * debido a que al hacer la comparación por lambda se usa una clase que solo compara objetos
 * 
 */
public class Empleado_conLambda{

    private String nombre;
    private double salario;

    public Empleado_conLambda(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    

}
