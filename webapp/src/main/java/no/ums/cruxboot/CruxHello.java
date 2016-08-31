package no.ums.cruxboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:su@ums.no">Ståle Undheim</a>
 */
@Controller
public class CruxHello {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello world";
    }
}
