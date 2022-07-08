package cross1usf.inventoryservice.controller;

import cross1usf.inventoryservice.client.NotificationClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class TestController {

    private final NotificationClient notificationClient;

    public TestController(NotificationClient notificationClient) {
        this.notificationClient = notificationClient;
    }

    @GetMapping("/howIsShe")
    public String inventoryTest() {
        return "IVENTORY IS LOOKING GOOOD BOSS!";
    }


    @GetMapping("/notification")
    public String notificationTest() {
        return notificationClient.tester();
    }

}
