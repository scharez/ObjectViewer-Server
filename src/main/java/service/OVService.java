package service;

import repository.Repository;
import transferObjects.UserTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ov")
public class OVService {

    @Path("test")
    @Produces(MediaType.TEXT_HTML)
    public String test() {

        return "LOL, das ist ein TEST!";
    }

    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String login(UserTO user) {

        return Repository.getInstance().login(user.username, user.password);
    }

    @Path("register")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String register() {

        return "LOL, das ist ein TEST!";
    }





}
