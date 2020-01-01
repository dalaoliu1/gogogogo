package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdAdds;
import com.example.demo.service.AdAddService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/ads")
public class AdAddsController {
	@Autowired
	AdAddService adAddService;
@RequestMapping("/adadds")
public JSONObject adsadds(@RequestBody AdAdds adAdds) {
	JSONObject results = new JSONObject();
	
	//调用service层
	int i = adAddService.adadds(adAdds);
	
	results.put("state", i);
	return results;
}
}
