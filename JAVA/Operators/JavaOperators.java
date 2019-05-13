// java 关系运算符
/*

JavaOperators.java:8: error: unexpected type
		int a = 1++;
		        ^
  required: variable
  found:    value

*/
class JavaOperators{


	public static void main(String [] ags){
		//算术运算符 + - * % /
		int a = 1;
		int b = 2;
		int c = 0;
		int d = 0;
		c = a++;
		d = ++b;		
		System.out.println(a+"===="+b);
		System.out.println(c+"===="+d);
		//关系运算符 == >== <== ！= 
		//逻辑运算符 && || ！
		//按位运算
/*
0 1
1 0
*/
		System.out.println("&"+(1&2)+"|"+(1|2)+"^"+(1^2)+"<<"+(2<<1)+">>"+(1>>1));
		//条件运算符
		int a1 = 6>5?3:4;
		System.out.println(a1);
		//instanceOf 
	}
}
