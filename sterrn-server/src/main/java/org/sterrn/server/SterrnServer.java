package org.sterrn.server;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.sterrn.core.util.Lazy;

public class SterrnServer extends Application<SterrnServerConfiguration> {

    private static final Lazy<SterrnServer> instance = Lazy.of(SterrnServer::new);

    public static void main(String[] args) throws Exception {
        instance.get().run(args);
    }

    @Override
    public void initialize(Bootstrap<SterrnServerConfiguration> bootstrap) {
    }

    @Override
    public void run(SterrnServerConfiguration configuration, Environment environment) {
    }

}
