package lk.ijse.DI;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Aggrement{
    @Override
    public void Chat() {
        System.out.println("Girl chat");
    }
}
