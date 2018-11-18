package classandobject;

public class ClassDemo {
    /**
     * 面向对象
     * 1.成员变量
     * 2.成员方法
     * 3.类成员（static）
     * 对象（实例）instance
     */

    String name;
    int age;

     ClassDemo(String name,int age){
        this.name=name;
        this.age=age;
        show();
    }

    void show () {
        System.out.println("姓名："+name+"年龄:"+age);
    }

    public static void main(String[] args) {
        ClassDemo person = new ClassDemo("cdcd",32);
        new ClassDemo("wang",23);
    }
}


/**
 * 成员变量和局部变量
 * 内存中存在地方不同
 */

/**
 * 四种访问权限
 *  1.public
 *  2.protected(包访问保护)
 *  3.private
 *  4.default(包)
 */


