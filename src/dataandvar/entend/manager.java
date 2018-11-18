package dataandvar.entend;

public class manager extends employee{
  private int bonus;


    public int getBonus()
  {
      return bonus;
  }
  public void setbonus(int bonus){
      this.bonus=bonus;
  }
  public manager(String name,int sex,int salary){
      super(name,sex,salary);
      this.bonus=(int)(bonus*Math.random());
  }
//   private int getsalary(){
//        int baseSalary=super.getSalary;
//   };
    //向上转型：用父类去引用子类的对象（会丢失子类的对象）强制转化
    //向下转型：用子类去引用父类的对象
    //final类 不允许子类去继承
    //final方法：确保他们不会在子类中产生语意
    //object类是所有类的父类
}
