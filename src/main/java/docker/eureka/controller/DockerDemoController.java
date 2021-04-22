package docker.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huwei
 * @version 1.0
 * @date 2021/3/24 10:04
 */
@RestController
@RequestMapping("/dockerDemo")
public class DockerDemoController {
    @GetMapping("/dockerHello")
    public String dockerHello(){
        return "hello docker demo";
    }
}
