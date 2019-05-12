//class Class
//new obj
//error: class found on application class path: PrimitiveDataType -----java *.java  NO No No
//error: package system does not exist ------ is System  no system ----static  fan wen
//Identifiers in Java
//原始数据类型
class PrimitiveDataType{
	 int int1;
	 char char1;
	 long long1;
	 boolean boolean1;
	 short short1;
	 float float1 = 12f;
	 double double1;
	 byte byte1;
	

	public static void main(String [] ags){
		
		PrimitiveDataType obj = new PrimitiveDataType();

		System.out.println("Primitive Data type");
		System.out.println("Primitive Data type:int"+obj.int1);
		System.out.println("Primitive Data type:long"+obj.long1);
		System.out.println("Primitive Data type:byte"+obj.byte1);
		System.out.println("Primitive Data type:float"+obj.float1);
		System.out.println("Primitive Data type:double"+obj.double1);
		System.out.println("Primitive Data type:char"+obj.char1);
		System.out.println("Primitive Data type:boolean"+obj.boolean1);
		System.out.println("Primitive Data type:short"+obj.short1);
	

	}
}


