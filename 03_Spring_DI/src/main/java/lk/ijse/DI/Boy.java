package lk.ijse.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Boy implements DI {
    //@Autowired
    Aggrement girl;

    /*@Autowired
    public Boy(Aggrement girl) {
        this.girl = girl;
    }*/

    @Autowired
    public void setGirl(Aggrement girl) {
        this.girl = girl;
    }

    public void chatWithGirl(){
        girl.Chat();
    }

    @Autowired
    @Override
    public void inject(Aggrement aggrement) {
        this.girl = aggrement;
    }
}
