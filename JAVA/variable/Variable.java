class Variable{
//实例变量 instance variable
//静态变量 static variable
//局部变量 local variable

//error: cannot find symbol  没有发现标记
//symbol:   variable nam1
//  location: class Variable



	String name="Tom";
	static String name1 = "Ti";
	
	public String name(){
		String name = "tom";
		return name;
	}

	public static void main(String [] ags){
		
		Variable vab = new Variable();
		System.out.println(vab.name+" "+vab.name()+" "+Variable.name1);
		System.out.println("实例对象访问静态变量"+vab.name1);
	}


}
