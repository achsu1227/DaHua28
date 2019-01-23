package dahua28.example.com.dahua28;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public class Client {
    @Test
    public void maiin() {
        List<Person> persons = new ArrayList<>();

        Person man1 = new Man();
        man1.setAction("成功");
        persons.add(man1);

        Person woman1 = new Woman();
        woman1.setAction("成功");
        persons.add(woman1);

        Person man2 = new Man();
        man2.setAction("失败");
        persons.add(man2);

        Person woman2 = new Woman();
        woman2.setAction("失败");
        persons.add(woman2);

        Person man3 = new Man();
        man3.setAction("恋爱");
        persons.add(man3);

        Person woman3 = new Woman();
        woman3.setAction("恋爱");
        persons.add(woman3);

        for (Person person : persons) {
            person.getConclusion();
        }
    }
}
