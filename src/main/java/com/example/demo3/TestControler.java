package com.example.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController  -> tutaj każdy zasób zachowuje się tak że każdą idpowiedz zwraca z body!!
@Controller   //-> tutaj nie zwraca w body!!
public class TestControler {

//    @ResponseBody   //-> to co zwruci nasza funkcja zostanie umieszczone w body dlatego to zostało dodane!!
    @GetMapping("/test")
    public String test(){
//        return "test-app";    //-> w takim przypadku spring szuka widoku elementu "test-app" -> ten szuka localhost:8080/test-app
        return "kot.jpg";    // !!NAZWA WIDOKU!!   -> w takim przypadku spring szuka widoku elementu "test-app" -> ten szuka localhost:8080/test-app
    }



    @ResponseBody
    @GetMapping("/test-app")  //tutaj tworzymy definicje tego widoku, bez tego zwraca 404
    public String testApp(){
        return "TEST APP";
    }



}
