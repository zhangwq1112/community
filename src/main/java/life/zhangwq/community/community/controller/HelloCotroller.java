package life.zhangwq.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhangwq on 2019/10/12.
 */
@Controller
public class HelloCotroller {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue = "world") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
