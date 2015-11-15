package it.eng.test.netflix.secondservice;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

	private static final Logger logger = LoggerFactory.getLogger(Service.class);
	
	private List<Model> list;
	
	public Service() {
		list = new ArrayList<Model>();
		
		for(int i = 0; i < 100; i += 1) {
			list.add(Model.random());
		}
	}
	
	@RequestMapping("/collection")
	public List<Model> getList() {
		logger.info("Method getList() invoked.");
		return list;
	}
}
