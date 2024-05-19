package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index(){
        return "안녕하세요. sbb에 온신것을 환영합니다.";
    }

    @GetMapping("/sbbb")
    @ResponseBody
    public List<String> indexx(){
        List<String> sss = new ArrayList<>();
        for (int i = 0;i<100;i++){
            sss.add(index());
        }
        return sss;
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }
}
