package OopTest;

import java.text.MessageFormat;

public class Bag {
    // 参数列表
    private int longs;
    private int width;
    private String name;

    // 无参构造显式声明
    public Bag() {
        System.out.println(needInitialize());
    }

    // 有参构造
    public Bag(int longs, int width, String name) {
        this.setLongs(longs);
        this.setName(name);
        this.setWidth(width);
        this.toString();
    }

    // 重写toString
    @Override
    public String toString() {
        // 使用%s占位，使用String.format转换，位置固定
        String introduce = String.format("this Bag`s name`s %s and It`s long: %s ,width: %s", this.getName(),
                this.getLongs(), this.getWidth());
        // 使用{n}占位，使用MessageFormat.format转换，可以更换位置
        String introduce2 = MessageFormat.format("this Bag`s name`s {2} and It`s long: {0} ,width: {1}",
                this.getLongs(), this.getWidth(), this.getName());
        return "方法一:\n" + introduce + "\n方法二:\n" + introduce2;

    }

    // 自定义方法
    public  String needInitialize() {
        return String.format("参数未初始化：\n name: %s \n longs: %s \n width: %s", this.getName(),
                this.getLongs(), this.getWidth());
    }

    // get方法：访问参数
    public int getWidth() {
        return width;
    }

    public int getLongs() {
        return longs;
    }

    public String getName() {
        return name;
    }

    // set方法：定义参数
    public void setLongs(int longs) {
        this.longs = longs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(int wieghts) {
        this.width = wieghts;
    }
}
