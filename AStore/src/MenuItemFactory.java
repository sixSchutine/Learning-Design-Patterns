class MenuItemFactory {
    public MenuItem createMenuItem(String name) {
        switch (name) {
            case "担担面":
                return new MenuItem("担担面", 10.0, 100);
            case "豆花鱼":
                return new MenuItem("豆花鱼", 15.0, 100);
            case "赖汤圆":
                return new MenuItem("赖汤圆", 5.0, 100);
            default:
                return null;
        }
    }
}
