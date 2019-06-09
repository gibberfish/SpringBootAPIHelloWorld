package yourpackage.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("api")
public class HelloWorldController {
    Logger logger = Logger.getLogger(HelloWorldController.class);

    @GetMapping(value = "/helloWorld", produces = "application/json")
    public ResponseEntity<String> helloWorld () {
        logger.info("Hello World API called");

        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}

