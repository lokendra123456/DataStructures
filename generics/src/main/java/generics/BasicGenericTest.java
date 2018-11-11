package generics;

class Details<T> {

	private T obj;

	public Details(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Details [obj=" + obj + "]";
	}

}

class Emp {
	int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}

class Student {
	int rollNum;

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
}

public class BasicGenericTest {

	public static void main(String[] args) {
		Emp e=new Emp();
		Student s=new Student();
		
		Details<Emp> eg=new Details<Emp> (e);
		Details<Student> sg=new Details<Student> (s);
		
		System.out.println(eg);
		System.out.println(sg);

	}

}
