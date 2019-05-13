//JavaArray.java:3: error: ';' expected
//	int num1[][] = {{1,2},{2,3}}
/**JavaArray.java:13: error: incompatible(不相容) types: int[] cannot be converted to int
		for(int x:ja.num1){
		            ^
JavaArray.java:14: error: for-each not applicable to expression type

			for(int i:x){
			          ^
  required: array or java.lang.Iterable
  found:    int
2 errors
**/							
class JavaArray{
	int num[]={1,2,3,4};
	int num1[][] = {{1,2},{2,3}};
	public static void main(String[] ags){
		int t = 3;
		t+=1;
		<<4;
		System.out.println(t);
		JavaArray ja = new JavaArray();

		for(int i:ja.num){
		  System.out.println(i);
		}

		for(int i=0;i<ja.num1.length;i++){
			for(int b:ja.num1[i]){
			  System.out.println(b);
			}
		}

	}

}
