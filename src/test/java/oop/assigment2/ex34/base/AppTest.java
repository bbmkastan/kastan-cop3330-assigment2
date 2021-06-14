package oop.assigment2.ex34.base;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void test_getNewEmployeeList_method() {
        App app = new App();
        ArrayList<String> expectedList = new ArrayList();
        String[] list = {"John Smith","Jackie Jackson", "Chris Jones",
                "Amanda Cullen", "Jeremy Goodwin"};

        for (int i = 0; i < list.length - 1; i++) {
                expectedList.add(list[i]);
        }

        assertEquals(expectedList, app.getNewEmployeeList("Jeremy Goodwin", list));
    }

}