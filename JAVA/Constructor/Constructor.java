/*
构造函数
默认构造函数 default constructor
参数构造函数 parameterizde constructor
构造函数和常规方法的区别
1.构造与类名相同不能有返回值，仅针对单个对象调用
*/
class Constructor{
  Constructor(){

  }
  Constructor(int num){

  }
  public static void main(String[] args) {
    Constructor c = new Constructor();
    Constructor c2 = new Constructor(22);
  }
}
