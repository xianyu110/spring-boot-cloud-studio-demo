package net.coding.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@SpringBootApplication
@Controller
public class DemoApplication {
    @RequestMapping("/")  
    public String greeting(ModelMap map) {  
        String jreVersion = System.getProperty("java.specification.version");
        map.addAttribute("jreVersion", "v" + jreVersion);
        return "index";
    } 

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
