package hijava.practice;

public class Student {
	private String studentNo;
	private String name;
	private int age;
	private String telno;

	public Student() {
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//010-9999-8888 ->010-9999-8888
	public String getTelno() {
		if (this.telno == null || telno.length() > 4) {
			return telno;
		} else {
			return telno.substring(0, telno.length() - 4);
		}
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public Student(String name) {
		this.name = name; // this.name은 5번째줄
	}

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", age=" + age + ", telno=" + telno + "]";
	}
}
