package de.ecreators.demo.ai.core.service.ai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecr/api/ai/v1")
public class ArtificialIntelligenceService {
	
	@GetMapping(path = "/create/{name:(\\w+)}")
	public String createAi(final @PathVariable("name") String name) {
		return "OK";
	}
}
