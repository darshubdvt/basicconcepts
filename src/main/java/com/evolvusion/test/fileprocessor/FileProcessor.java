package com.evolvusion.test.fileprocessor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String file = exchange.getIn().getHeader(Exchange.FILE_NAME, String.class);
		Date dt = new Date();
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String changedfileName = file + sm.format(dt);
		
		exchange.getIn().setHeader(Exchange.FILE_NAME, changedfileName);
	}

}
