package cross1usf.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestController {

    @GetMapping("/yoyo")
    public String hello(Principal principal) {
        return principal.getName();
    }
}
