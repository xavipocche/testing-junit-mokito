package com.example.junitindexcontroller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @PostMapping("/welcome")
    @ResponseBody
    public String welcome(@RequestParam(required = false, name = "param") String[] paramArray) {
        StringBuilder msg = new StringBuilder("");
        int i = 0;
        if(paramArray == null) {
            msg.append("El array está vacio");
        }else {
            for(String paramArrayItem : paramArray){
                msg.append("param[" + i + "]" + paramArrayItem + "\n");
                i++;
            }
        }
        return msg.toString();
    }
}
