package com.andremanuelbarbosa.soq48813976;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SOQ48813976 extends Application<SOQ48813976Configuration> {

    private static final Logger LOGGER = LoggerFactory.getLogger(SOQ48813976.class);

    @Override
    public void run(SOQ48813976Configuration soq48813976Configuration, Environment environment) throws Exception {

        LOGGER.info("Running");
    }

    public static void main(String[] args) throws Exception {

        new SOQ48813976().run(args);
    }
}
