package pl.przydan.hello.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloServlet {
    private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);

    private HelloService service;

    HelloServlet(HelloService service) {
        this.service = service;
    }

    @RequestMapping("/api")
    String welcome() {
        return welcome(null, null);
    }

    @RequestMapping(value = "/api", params = {"lang", "name"})
    String welcome(@RequestParam("lang") Integer langId, @RequestParam String name) {
        logger.info("Got request");
        return service.prepareGreeting(name, langId);
    }
}
