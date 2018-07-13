package com.alibaba.dubbo.demo;
import com.alibaba.dubbo.demo.entity.HelloEntity;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("demo")
public interface RestService {
    @GET
    @Path("hello/{name}")
    //@Consumes({MediaType.APPLICATION_JSON})    
    @Produces({MediaType.APPLICATION_JSON})   
    HelloEntity testHello(@PathParam("name") String name);
    /*
     * Doc:
     * http://dubbo.apache.org/#/docs/user/references/protocol/rest.md?lang=zh-cn
     */
}