package Singleton;

public class Client {
    public static void main(String[] args) {

        ChairmanGroup group = new ChairmanGroup();
        group.displayAll();  // 应该打印3个主席的ID

        // 尝试创建第四个主席（应该抛出异常）
        try {
            Chairman extraChairman = Chairman.getInstance();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());  // 打印: Cannot create more than 3 Chairmen
        }
    }
}
