package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/oferta")  // Ruta base para este servicio
@Stateless
@Consumes(MediaType.APPLICATION_JSON)  // Define que el servicio consume JSON
@Produces(MediaType.APPLICATION_JSON)  // Define que el servicio produce JSON
public class OfertaService {

    @EJB
    private IServicioOfertaMockLocal servicioOferta;  // Inyectamos la lógica de negocio

    @GET
    @Path("/ofertas")  // Ruta para obtener todas las ofertas
    public List<Oferta> obtenerOfertas() {
        return servicioOferta.obtenerOfertas();  // Llamamos al método del backend para obtener las ofertas
    }

    @POST
    @Path("/ofertas")  // Ruta para agregar una nueva oferta
    public Response agregarOferta(Oferta oferta) {
        servicioOferta.agregarOferta(oferta);  // Llamamos al backend para agregar la oferta
        return Response.status(Response.Status.CREATED).build();  // Retorna un código 201 (creado)
    }
}
