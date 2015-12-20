//-----------------------------------------------------------------------------
package dk.sunepoulsen.jes.citycodes.rs;

//-----------------------------------------------------------------------------
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//-----------------------------------------------------------------------------
/**
 *  Status REST service to return status information about the Web Application.
 */
@Stateless
@Path( "/status" )
public class StatusService {
    /**
     * GET operation to return status information.
     *
     * @return Info in a JSON structure as a String.
     *
     * @throws Exception In case of an error.
     */
    @GET
    @Produces( MediaType.TEXT_PLAIN )
    public Response invoke() throws Exception {
        return Response.ok( "{ \"status\": \"ok\" }", MediaType.TEXT_PLAIN ).build();
    }
}
