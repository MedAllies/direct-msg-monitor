package org.nhindirect.monitor.distributedaggregatorroute;

import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = "camel.springboot.xmlRoutes=classpath:distributedAggregatorRoutes/monitor-route-to-mock.xml")
public class TestNonReliableMessageMonitorRoute extends org.nhindirect.monitor.route.TestNonReliableMessageMonitorRoute 
{

}
