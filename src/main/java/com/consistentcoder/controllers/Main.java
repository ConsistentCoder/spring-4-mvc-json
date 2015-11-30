package com.consistentcoder.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.consistentcoder.json.Response;

@Controller
public class Main {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model) {
	
		model.addAttribute("message", "Spring 4 MVC JSON Hello World Example Built with Maven");
		return "hello";
	}
	
	@RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Response jsonPage() {

            List<String> result = new ArrayList<String>();
            result.add("Hello World!");

        return new Response(result);
    }
}
