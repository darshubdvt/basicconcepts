package com.evolvusion.test;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.routepolicy.quartz.CronScheduledRoutePolicy;
import com.evolvusion.test.fileprocessor.FileProcessor;

public class CamelContextDummi {
	private static final long DURATION_MILIS = 10000;
	private static final String SOURCE_FOLDER = "/data/camelsource";
	private static final String DESTINATION_FOLDER = "/data/cameldestination";

	public void moveFolderContentJavaDSLTest() throws Exception {
		CamelContext camelContext = new DefaultCamelContext();
		// camelContext.seti
		CronScheduledRoutePolicy startPolicy = new CronScheduledRoutePolicy();
		startPolicy.setRouteStartTime("0 0 14/19 ? * * *");
		startPolicy.setRouteStopTime("0 0 14/22 ? * * *");
		// .routeId("testRoute").routePolicy(startPolicy).noAutoStartup()

		camelContext.addRoutes(new RouteBuilder() {
			@Override
			public void configure() throws Exception {

				// from("file://" + SOURCE_FOLDER + "?delete=true").process(new
				// FileProcessor()).to(DESTINATION_FOLDER);

				from("quartz://" + SOURCE_FOLDER + "?cron=0+0+16+?+*+MON-FRI&delete=true")
						.to(DESTINATION_FOLDER);

			}
		});
		camelContext.start();
		Thread.sleep(DURATION_MILIS);

		camelContext.stop();
	}

}
