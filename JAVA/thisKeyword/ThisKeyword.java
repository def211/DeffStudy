//this 关键字
//1.指代当前对象
//3.调用方法对象的引用
//4.调用当前类构造函数
//5.可以作为参数传递

class ThisKeyword{
  //4
  public ThisKeyword(){
    this(5);
  }
  public ThisKeyword(int a){
    System.out.println(a);
  }
  //3
  public void method1(){
     this.method2();
  }
  private void method2( )
  {
    System.out.println("method2");
  }
  //5
  public Object obj(){
    return this;
  }

  public static void main(String[] args) {
    //4
    ThisKeyword t = new ThisKeyword();
    //3
    t.method1();
    //5
    ThisKeyword t1 =(ThisKeyword)t.obj();
    t1.method1();
  }
}
