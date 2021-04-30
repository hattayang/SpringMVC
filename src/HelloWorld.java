import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HattaYang on 2021-04-27.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/helloWorld")
    public String hello(){
        System.out.println("Hello,World");
        return "success";
    }
}
