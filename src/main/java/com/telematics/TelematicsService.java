package com.telematics;

import com.telematics.config.EngineServiceConfiguration;
import com.telematics.resource.Engine;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class TelematicsService extends Service<EngineServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new TelematicsService().run(args);
    }

    @Override
    public void initialize(final Bootstrap<EngineServiceConfiguration> bootstrap) {
        bootstrap.setName("Telematics-Application");
    }

    @Override
    public void run(final EngineServiceConfiguration conf, final Environment env) throws Exception {
        env.addResource(new Engine(conf.getMessages()));
    }

}
