package Basic;
//String are imutable and can not be changed so we can add buffer/builder.
public class StringBufferBuilder {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer ("java");
	System.out.println(s);
	System.out.println(s.append(" tech"));
	System.out.println(s);
	
	
	StringBuilder s1 = new StringBuilder("");
}
}
