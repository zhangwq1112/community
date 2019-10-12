package life.zhangwq.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zhangwq on 2019/10/12.
 */
@Controller
public class indexCotroller {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
