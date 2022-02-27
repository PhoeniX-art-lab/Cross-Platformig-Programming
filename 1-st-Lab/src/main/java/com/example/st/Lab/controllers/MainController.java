package com.example.st.Lab.controllers;

import com.example.st.Lab.exceptions.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/")
public class MainController {

    private Integer first_number = 0;
    private Integer second_number = 0;
    private Integer third_number = 0;


    @RequestMapping("/copy/getJSON")
    @ResponseBody
    public Map<String, Object> noAnnotation(Boolean copy1_2, Boolean copy2_3) {
        Map<String, Object> paramsMap = new HashMap<>();

        paramsMap.put("FirstNumber", this.first_number);
        paramsMap.put("SecondNumber", this.second_number);
        paramsMap.put("ThirdNumber", this.third_number);
        if (copy1_2 == Boolean.TRUE) {
            this.second_number = this.first_number;
            paramsMap.put("SecondNumber", this.second_number);
        }
        if (copy2_3 == Boolean.TRUE) {
            this.third_number = this.second_number;
            paramsMap.put("ThirdNumber", this.third_number);
        }

        return paramsMap;
    }

    @RequestMapping("/copy")
    public String copy(Model model, @RequestParam(name = "first_number", required = false) Integer number,
                       @RequestParam(name = "copy1_2", required = false, defaultValue = "false") Boolean val1,
                       @RequestParam(name = "copy2_3", required = false, defaultValue = "false") Boolean val2) {
        first_number = number;
        if (val1 == Boolean.TRUE) {
            second_number = first_number;
        }
        if (val2 == Boolean.TRUE) {
            third_number = second_number;
        }
        model.addAttribute("first_number", first_number);
        model.addAttribute("second_number", second_number);
        model.addAttribute("third_number", third_number);
        return "home";
    }
}


//@RestController
//@RequestMapping("/")
//public class MainController {
//    private int counter = 4;
//
//    private List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {{
//        add(new HashMap<String, String>() {{
//            put("id", "1");
//            put("text", "First Message");
//        }});
//        add(new HashMap<String, String>() {{
//            put("id", "2");
//            put("text", "Second Message");
//        }});
//        add(new HashMap<String, String>() {{
//            put("id", "3");
//            put("text", "Third Message");
//        }});
//    }};
//
//    @GetMapping
//    public List<Map<String, String>> list() {
//        return messages;
//    }
//
//    @GetMapping("/hello")
//    public String home(Model model) {
//        return "Hello, World!";
//    }
//
//    @GetMapping("{id}")
//    public Map<String, String> getOne(@PathVariable String id) {
//        return getMessage(id);
//    }
//
//    private Map<String, String> getMessage(String id) {
//        return messages.stream()
//                .filter(message -> message.get("id").equals(id))
//                .findFirst()
//                .orElseThrow(NotFoundException::new);
//    }
//
//    @PostMapping
//    public Map<String, String> create(@RequestBody Map<String, String> message) {
//        message.put("id", String.valueOf(counter++));
//
//        messages.add(message);
//        return message;
//    }
//
//    @PutMapping("{id}")
//    public Map<String, String> update(@PathVariable String id, @RequestBody Map<String, String> message) {
//        Map<String, String> messageFromDB = getMessage(id);
//        messageFromDB.putAll(message);
//        messageFromDB.put("id", id);
//
//        return messageFromDB;
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable String id) {
//        Map<String, String> message = getMessage(id);
//
//        messages.remove(message);
//    }
//}
