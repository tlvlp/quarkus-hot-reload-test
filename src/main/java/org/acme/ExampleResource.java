package org.acme;

import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//@Path("/hello")
@ApplicationScoped
public class ExampleResource {

    public void hotReloadWithoutRestEndpoint(@Observes StartupEvent ev) {
        System.out.println("CHANGE THIS TEXT TO TEST");
    }

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return "Hello RESTEasy Reactive";
//    }


}
