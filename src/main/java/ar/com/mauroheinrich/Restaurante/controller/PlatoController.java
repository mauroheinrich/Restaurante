
package ar.com.mauroheinrich.Restaurante.controller;

import ar.com.mauroheinrich.Restaurante.modelo.Plato;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platos")  // Indica que todas las rutas aquí comienzan con /platos
public class PlatoController {  // Usa PascalCase para el nombre de la clase
    @GetMapping("/{numero}")
    public Plato traerPlato(@PathVariable int numero) {  // Usamos @PathVariable aquí
        List<Plato> listaPlatos = new ArrayList<>();
        listaPlatos.add(new Plato(1, "Milanesa con puré", 1500.0, "Clásica milanesa con puré de papas"));
        listaPlatos.add(new Plato(2, "Pizza napolitana", 2000.0, "Pizza con tomate, mozzarella y albahaca"));
        listaPlatos.add(new Plato(3, "Ensalada César", 1900.0, "Lechuga, pollo, croutons y aderezo César"));
        listaPlatos.add(new Plato(4, "Pasta Alfredo", 2200.0, "Fettuccine con salsa Alfredo y parmesano"));
        listaPlatos.add(new Plato(5, "Hamburguesa completa", 2500.0, "Carne, queso, lechuga, tomate y papas fritas"));

          //buscamos en la lista de platos a ver si hay uno con esa id
            for (Plato plat : listaPlatos) { 
                if (plat.getNumero()== numero) {
                    //Si encontró devuelve el plato completo
                    return plat; 
                }    
            }
           
        //si no encontró nada, devuelve null
        return null;
    }
}
