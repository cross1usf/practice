package cross1usf.inventoryservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "notification"
        ,url = "http://localhost:8083/notification")
public interface NotificationClient {

    @GetMapping("/test")
    String tester();
}
