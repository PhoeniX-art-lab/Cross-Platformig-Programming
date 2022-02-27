package com.example.st.Lab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

public class Numbers {
    private Integer first_number = 0;
    private Integer second_number = 0;
    private Integer third_number = 0;

    public void setFirst_number(Integer first_number) {
        this.first_number = first_number;
    }
    public Integer getFirst_number() {
        return first_number;
    }

    public void setSecond_number(Integer senond_number) {
        this.second_number = senond_number;
    }
    public Integer getSecond_number() {
        return second_number;
    }

    public void setThird_number(Integer third_number) {
        this.third_number = third_number;
    }
    public Integer getThird_number() {
        return third_number;
    }
}


//@Controller
//@RequestMapping("/")
//public class MainController<numbers> {
//
//    Numbers numbers;
//
//
//    @RequestMapping("/copy/getJSON")
//    @ResponseBody
//    public Map<String, Object> noAnnotation(Integer first_number,
//                                            Integer second_number, Integer third_number, Boolean copy1_2, Boolean copy2_3) {
//        Map<String, Object> paramsMap = new HashMap<>();
//        numbers.setFirst_number(first_number);
//        numbers.setSecond_number(second_number);
//        numbers.setThird_number(third_number);
//
//        paramsMap.put("FirstNumber", numbers.getFirst_number());
//        paramsMap.put("SecondNumber", numbers.getSecond_number());
//        paramsMap.put("ThirdNumber", numbers.getThird_number());
//        if (copy1_2 == Boolean.TRUE) {
//            numbers.setSecond_number(numbers.getFirst_number());
//            paramsMap.put("SecondNumber", numbers.getSecond_number());
//        }
//        if (copy2_3 == Boolean.TRUE) {
//            numbers.setThird_number(numbers.getSecond_number());
//            paramsMap.put("ThirdNumber", numbers.getThird_number());
//        }
//
//        return paramsMap;
//    }
//
//    @RequestMapping("/copy")
//    public String copy(Model model) {
//
//        model.addAttribute("first_number", numbers.getFirst_number());
//        model.addAttribute("second_number", numbers.getSecond_number());
//        model.addAttribute("third_number", numbers.getThird_number());
//
//        return "home";
//    }
//}
