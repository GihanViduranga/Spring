package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("extract")
public class ExtractMappingController {
    @GetMapping("test1")
    public String getExtract(){
        return "Extract Test1";
    }

    @GetMapping("test2")
    public String getExtract2(){
        return "Extract Test2";
    }

    @GetMapping("test3/*/hello")//meke maddata vitharak kamathi valu ekak danna puluwan
    public String getExtract3(){
        return "Extract Test3";
    }

    @GetMapping("test4/*/*")//meke anthima deka vitharak wenas karanna puluwan
    public String getExtract4(){
        return "Extract Test4";
    }
}
