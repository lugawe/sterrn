package org.sterrn.server;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sterrn.core.Sterrn;
import org.sterrn.core.util.Lazy;

public class SterrnServer extends Application<SterrnServerConfiguration> {

    private static final Logger log = LoggerFactory.getLogger(SterrnServer.class);

    private static final Lazy<SterrnServer> instance = Lazy.of(SterrnServer::new);

    public static void main(String[] args) throws Exception {
        instance.get().run(args);
    }

    @Override
    public void initialize(Bootstrap<SterrnServerConfiguration> bootstrap) {
    }

    @Override
    public void run(SterrnServerConfiguration configuration, Environment environment) {
        log.info("Run SterrnServer - Version {}", Sterrn.VERSION);
    }

}
