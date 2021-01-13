package home;

import common.TestBase;

public class HomePage extends TestBase {

    public void getLoginTitle(){
        String title = driver.getTitle();
        System.out.println(title);
    }

}
