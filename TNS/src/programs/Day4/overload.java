package programs.Day4;

public class overload {
	int sid=109;
	String sname="chandu";
	overload()
	{
		System.out.println("The student name is:"+sname);
		System.out.println("The student id is:"+sid);
	}
	overload(int a){
		System.out.println("The student id is:"+sid+"The value of a is:"+a);
	 
	}
	overload(int a,String b){
		System.out.println("The value is:"+a+"The value is:"+b);
	}

}
