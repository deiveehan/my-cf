package com.cs.frm.user;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by deiveehannallazhagappan on 3/25/17.
 */
@Path("/user")
@Component
public class UserService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String go() {
        return "Godo";
    }
}
