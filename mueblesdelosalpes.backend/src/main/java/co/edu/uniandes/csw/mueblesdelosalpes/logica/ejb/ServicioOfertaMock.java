package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ServicioOfertaMock implements IServicioOfertaMockLocal {

    // Lista estática para simular la persistencia de las ofertas
    private static List<Oferta> ofertas = new ArrayList<>();

    @Override
    public void agregarOferta(Oferta oferta) {
        ofertas.add(oferta);  // Agrega la oferta a la lista
    }

    @Override
    public List<Oferta> obtenerOfertas() {
        return ofertas;  // Devuelve todas las ofertas almacenadas
    }
}
