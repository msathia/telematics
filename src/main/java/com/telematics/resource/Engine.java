package com.telematics.resource;

import com.telematics.config.MessagesConfiguration;
import com.telematics.platformdata.PlatformDataService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path(value = "/engine")
public class Engine {
    private final MessagesConfiguration conf;
    private PlatformDataService platformdata = new PlatformDataService();

    public Engine(MessagesConfiguration conf) {
        this.conf = conf;
    }
    @Path(value = "/engineTypes")
    @GET
    public String sayEngineType() {
            return conf.getEngineType();
    }
    @Path(value = "/engineTypes")
    @POST
    public String postEngineTypes() {
        return "WroteEngineType";
    }

    @Path(value = "/engineParameters")
    @GET
    public String sayEngineParameters() {
        return conf.getEngineParameters();
    }
    @Path(value = "/engineParameters")
    @POST
    public String postEngineParameters() {
        return "WroteEngineParams";
    }

    @Path(value = "/obdTypes")
    @GET
    public String getOBDData() {
        return platformdata.getObdParams() ;
    }
    @Path(value = "/obdParams")
    @GET
    public String getOBDParams() {
        return platformdata.getObdType();
    }
}

