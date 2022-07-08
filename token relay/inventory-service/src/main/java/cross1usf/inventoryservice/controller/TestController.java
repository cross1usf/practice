package cross1usf.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class TestController {

    @GetMapping("/howIsShe")
    public String inventoryTest() {
        return "IVENTORY IS LOOKING GOOOD BOSS!";
    }
}
