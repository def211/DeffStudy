//垃圾收集
//1.不能明确强制垃圾收集
//2.可以调用System.gc() 请求JVM垃圾收集 但并不保证JVM 会执行垃圾收集

//3.对象销毁时 要执行一些任务 用finalize() 该方法在Objiect ,且用protected声明，
//方法只通过GC线程的守护线程调用一次
//4.gc() 显示调用垃圾收集，不保证JVM将执行垃圾收集 此方法存在System 和 Runtime 类中
class GarbageCollection{
  public void finalize()
  {
      System.out.println("Garbage Collected");
  }
  public static void main(String[] args) {
    GarbageCollection g = new GarbageCollection();
    g = null;
    System.gc();
  }
}
