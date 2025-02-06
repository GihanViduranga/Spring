package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy1 {
    @Autowired
    @Qualifier("girl1")
    Aggrement girl;

    public Boy1() {
        System.out.println("Boy1 constructor");
    }

    //tiught cupling
    public void chatWithGirl(){
        girl.chat();
    }
}
