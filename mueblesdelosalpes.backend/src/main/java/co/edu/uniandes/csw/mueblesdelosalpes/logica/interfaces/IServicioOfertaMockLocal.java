package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import java.util.List;

import javax.ejb.Local;

@Local
public interface IServicioOfertaMockLocal {

    // Método para agregar una nueva oferta
    void agregarOferta(Oferta oferta);

    // Método para obtener todas las ofertas
    List<Oferta> obtenerOfertas();
}
