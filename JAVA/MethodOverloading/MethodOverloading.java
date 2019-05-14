//方法重载

class MethodOverloading{

  public void student(String name){
    System.out.println(name);
  }
  public void student(String name,int age){
    System.out.println(name+"  "+age);
  }
  public void student(String name,int age,String sex){
    System.out.println(name+"  "+age+" "+sex);
  }

  public static void main(String [] ags){
    MethodOverloading m = new MethodOverloading();
    m.student("Tom");
    m.student("Tom",18);
    m.student("Tom",18,"男");
  }
}
