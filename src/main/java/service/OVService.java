package service;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("objectViewer")
public class OVService {

    @Path("test")
    @Produces(MediaType.TEXT_HTML)
    public String test() {

        return "LOL, das ist ein TEST!";
    }



}
