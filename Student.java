class Student
{
	int sno;	  //instance variabes
	String sname; //instance variabes
Student() //default constructor added by the compier
{
	sno = 0; sname = null;
}

public void talk()
{
	System.out.println("my roll number is :"+sno);
	System.out.println("my roll sname is :"+sname);
}
public static void main(String []args)
{
	Student s1 = new Student();
	s1.talk();
    }
}

  	