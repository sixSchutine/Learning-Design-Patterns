package Singleton;

import java.util.ArrayList;
import java.util.List;

public class ChairmanGroup {
    private List<Chairman> chairmen = new ArrayList<>();

    // 初始化主席团，创建3个主席
    public ChairmanGroup() {
        for (int i = 0; i < 3; i++) {
            chairmen.add(Chairman.getInstance());
        }
    }

    // 显示所有主席ID的方法
    public void displayAll() {
        for (Chairman chairman : chairmen) {
            chairman.display();
        }
    }
}
