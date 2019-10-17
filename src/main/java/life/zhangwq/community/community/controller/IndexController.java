package life.zhangwq.community.community.controller;

import life.zhangwq.community.community.dto.PaginationDTO;
import life.zhangwq.community.community.dto.QuestionDTO;
import life.zhangwq.community.community.mapper.QuestionMapper;
import life.zhangwq.community.community.mapper.UserMapper;
import life.zhangwq.community.community.model.Question;
import life.zhangwq.community.community.model.User;
import life.zhangwq.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zhangwq on 2019/10/12.
 */
@Controller
public class IndexController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "5") Integer size) {

        PaginationDTO paginationDTO = questionService.list(page, size);
        model.addAttribute("paginationDTO", paginationDTO);

        return "index";
    }
}
