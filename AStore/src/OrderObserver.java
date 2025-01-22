// 观察者类
class OrderObserver {
    public void update(MenuItem menuItem) {
        System.out.println(menuItem.getName() + " remaining: " + menuItem.getQuantity());
    }
}

