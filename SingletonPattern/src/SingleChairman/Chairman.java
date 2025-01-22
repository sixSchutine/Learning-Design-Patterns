package SingleChairman;

public class Chairman {
    // 持有唯一的Chairman实例
    private static Chairman instance;
    // 主席的ID
    private String id;
    // 私有构造方法，防止外部实例化
    private Chairman(String id){
        this.id = id;
    }
    // 公共的静态方法用于获取唯一的Chairman实例
    public static synchronized Chairman getInstance(String id) {
        if (instance == null) {
            instance = new Chairman(id);
        }
        return instance;
    }
    // display方法打印主席的ID
    public void display(){
        System.out.println("主席id："+this.id);
    }

    // 防止克隆破坏单例模式
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
