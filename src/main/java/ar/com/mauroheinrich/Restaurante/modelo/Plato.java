
// Clase que representa un plato del restaurante
package ar.com.mauroheinrich.Restaurante.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter  // Lombok genera automáticamente los getters y setters
public class Plato {
    
    public int numero;  // Número identificador del plato
    public String nombre;  // Nombre del plato
    public double precio;  // Precio del plato
    public String descripcion;  // Descripción breve del plato

    public Plato() {
    }

    public Plato(int numero, String nombre, double precio, String descripcion) {
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
}