package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private final Egg6 agge;
@Autowired
    public Duck5(Egg6 egg6) {
        this.agge = egg6;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + "" + agge.toString();
    }
}
