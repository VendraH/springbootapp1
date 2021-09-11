
package com.hemv.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AwsDevopsController {
	/*/getalldevopstools
	/getallawsservices*/
	
	@GetMapping("/getalldevopstools")
	public List<String> getALLDevOpsTools(){
		return Arrays.asList("git","java","maven","jenkins","docker","k8s");
	}
}
