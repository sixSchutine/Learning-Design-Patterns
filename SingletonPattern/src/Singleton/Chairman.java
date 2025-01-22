package Singleton;

import java.util.ArrayList;
import java.util.List;

public class Chairman {
    private static final int MAX_INSTANCES = 3;
    private static List<Chairman> instances = new ArrayList<>(MAX_INSTANCES);
    private static int nextId = 1;
    private final int id;

    // 私有构造函数，防止外部实例化
    private Chairman(int id) {
        this.id = id;
    }
    // 静态工厂方法，用于获取主席实例
    public static Chairman getInstance() {
        if (instances.size() < MAX_INSTANCES) {
            Chairman chairman = new Chairman(nextId++);
            instances.add(chairman);
            return chairman;
        } else {
            throw new IllegalStateException("Cannot create more than " + MAX_INSTANCES + " Chairmen");
        }
    }

    // 显示主席ID的方法
    public void display() {
        System.out.println("Chairman ID: " + id);
    }
}
