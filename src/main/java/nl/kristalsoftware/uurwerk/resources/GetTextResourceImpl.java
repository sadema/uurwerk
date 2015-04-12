package nl.kristalsoftware.uurwerk.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.logging.Logger;

/**
 * Created by sjoerdadema on 08-04-15.
 */
@Path("text")
public class GetTextResourceImpl {

    @Inject
    private Logger logger;

    @GET
    public String getText() {
        logger.info("getText method");
        return "Hello My World";
    }


}
