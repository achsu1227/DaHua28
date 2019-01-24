package dahua28.example.com.dahua28;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dahua28.example.com.dahua28.action.Amativeness;
import dahua28.example.com.dahua28.action.Failing;
import dahua28.example.com.dahua28.action.Success;
import dahua28.example.com.dahua28.person.Man;
import dahua28.example.com.dahua28.person.Person;
import dahua28.example.com.dahua28.person.Woman;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public class Client {
    @Test
    public void maiin() {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        // 成功时的反应
        Success v1 = new Success();
        o.display(v1);
        // 失败时的反应
        Failing v2 = new Failing();
        o.display(v2);
        // 恋爱时的反应
        Amativeness v3 = new Amativeness();
        o.display(v3);

        // 對於婚姻的反應
        // Marriage v4 = new Marriage();
        // o.display(v4);
    }
}
