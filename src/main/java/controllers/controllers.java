package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class controllers {


    @GetMapping("/")
    String getstart(){
        return "index";
    }

    @PostMapping("/translate")
    public ModelAndView Translate(@RequestParam String english)
    {
           ModelAndView modelAndView = new ModelAndView("result");
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

           String result = dictionary.get(english);
           if (result != null){
               modelAndView.addObject("result","Result: " +result);
           }
           else {
               modelAndView.addObject("result", "Not valid");
           }
           return modelAndView;
    }
}
