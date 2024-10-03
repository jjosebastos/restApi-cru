package br.com.fiap;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.Path;

@Path("/rest")
public class HelloWorldApi {

    @GET
    @Path("/v1")
    public String hello(){
        return "{\"mensagem\" : \"Hello, World!\"}";
    }
    @GET
    @Path("/v2")
    public String helloV2(){
        return """
                {
                "mensagem":"Hello, World!"
                }
                """;
    }
}
