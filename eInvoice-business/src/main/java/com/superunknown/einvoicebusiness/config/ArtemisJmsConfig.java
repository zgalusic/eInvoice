package com.superunknown.einvoicebusiness.config;

import org.apache.activemq.artemis.api.core.TransportConfiguration;
import org.apache.activemq.artemis.core.remoting.impl.netty.NettyAcceptorFactory;
import org.apache.activemq.artemis.core.remoting.impl.netty.NettyConnectorFactory;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisConfigurationCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@Configuration
public class ArtemisJmsConfig implements ArtemisConfigurationCustomizer {

    @Override
    public void customize(org.apache.activemq.artemis.core.config.Configuration configuration) {

        configuration.addConnectorConfiguration("nettyConnector",
                new TransportConfiguration(NettyConnectorFactory.class.getName()));
        configuration.addAcceptorConfiguration(new TransportConfiguration(NettyAcceptorFactory.class.getName()));
    }
}
