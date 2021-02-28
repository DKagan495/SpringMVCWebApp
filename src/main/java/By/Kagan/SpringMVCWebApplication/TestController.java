package By.Kagan.SpringMVCWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/hellofag")
    public String helloSaying()
    {
        return "hello_dear_fagot";
    }
    @GetMapping("/goodmood")
    public String goodMoodDoode()
    {
        return "goodman";
    }
}
