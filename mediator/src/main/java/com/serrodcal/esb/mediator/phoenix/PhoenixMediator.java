package com.serrodcal.esb.mediator.phoenix;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class PhoenixMediator extends AbstractMediator {

    private static final Log log = LogFactory.getLog("PHOENIX");

    private String property1;

    public PhoenixMediator() {
        Config config = ConfigFactory.load();

        String tmp = config.getString("security.keystore");

        log.info("#### Constructor = ".concat(tmp.toString()));

        property1 = tmp;

        // Toda la pesca del TLSUITL

    }

    @Override
    public boolean mediate(MessageContext messageContext) {

        log.info("#### Mediate".concat(property1.toString()));

        return true;
    }

}