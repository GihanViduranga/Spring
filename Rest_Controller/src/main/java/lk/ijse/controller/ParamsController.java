package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {

    //http://localhost:8080/Rest_Controller_Web_exploded/params?id=1
    @GetMapping(params = {"id"})
    public String test1(@RequestParam ("id")String id){
        return id;
    }

    @GetMapping(params = {"id","name"})
    public String test2(@RequestParam("id") String id,
                        @RequestParam("name") String name){
        return id+"_"+name;
    }

    //http://localhost:8080/Rest_Controller_Web_exploded/params/test3?id=1&name=gihan
    @GetMapping("test3")
    public String test3(@RequestParam("id") String id,
                        @RequestParam("name") String name){
        return id+"_"+name;
    }
}
