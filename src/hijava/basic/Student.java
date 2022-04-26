package hijava.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Student implements Cloneable,Comparable<Student> {
	private int id;
	private String name;
	
	public Student() {
		this.name = "Guest";
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "(" + id + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	// if ( s1 != null && s1.equals(s2))
	@Override // object의 메소드 equals (다형성)
	public boolean equals(Object obj) {
		// 동일한 메모리 주소면 true
		if (this == obj)
			return true;

		// this는 절대 null이 될 수 없으므로 obj null이면 false
		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clobj = (Student) super.clone();
		clobj.name = clobj.name + " 복제본!";
		return clobj;
	}

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
//		boolean hasCondition = true;
//		String searchStr = "홍길동";
//		String s = "select * from Tbl where";
//		if(hasCondition) {
//			s = s + " where name like '%" + searchStr + "%";
//			s += " and id > 0";
//			s += " limit 10";
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append("select * from Tbl where");
//		if(hasCondition) {
//			sb.append(" where name like '%").append(searchStr).append("%");
//			sb.append(100).append('T');
//		}
		
//		sb.append("aaaaaaaa");
//		System.out.println("sb1=" + sb.toString());
//		sb.setLength(0);
//		System.out.println("sb2=" + sb.toString());
//		
//		StringBuffer sf = new StringBuffer();
//		sf.append("aaaaaaaa");
//		System.out.println("sb1=" + sf.toString());
//		sf.setLength(0);
//		System.out.println("sb2=" + sf.toString());


		
//		String s1 = new String("123abc");
//		String s2 = "123abc";
//		String s3 = "123abc";
//
//		System.out.println("s1==s2 :" + (s1 == s2) + ", " + s1.equals(s2));
//		System.out.println(s3 == s2);
//		System.out.println(System.identityHashCode(s1) + ", " + System.identityHashCode(s2));
//		System.out.println(s1.hashCode() + " : " + s2.hashCode() + " : " + s3.hashCode());

		Student s = new Student(921234, "홍길동");
//		Student s2 = (Student)s.clone();

//		System.out.println(s.getClass() + ", " + s.getClass().getSimpleName());
		
		String inputStr = "hijava.basic.Student";
		Class<?> cls = Class.forName(inputStr);
		Package pkg = cls.getPackage();
		System.out.println("pkg= " + pkg);
		
//		for (Constructor c: cls.getConstructors())
//			System.out.println("constructor=" + c);
//		for (Field f : cls.getFields())
//			System.out.println("field=" + f);
//		for (Method m : cls.getMethods()) {
//			System.out.println("method=" + m.getName());
//			if("getName".equals(m.getName())) {
//				System.out.println("--------------------");
////				m.invoke(null,null);
//			}
//		}
		
		Student newStu = (Student)cls.newInstance();
		System.out.println(newStu);
		Method setnameMethod = cls.getMethod("setName", String.class);
		setnameMethod.invoke(newStu, "홍길동");
		System.out.println(newStu);
		Method getnameMethod = cls.getMethod("getName");
		Method setidMethod = cls.getMethod("setId", int.class);
		setidMethod.invoke(newStu, 100);
		System.out.println("newStr.name=" + getnameMethod.invoke(newStu));
		System.out.println(newStu);

		
//		Student s2 = (Student)cls.newInstance();
		
//		System.out.println(s2);
//		System.out.println(s);
//		String ss = new String("홍길동");
//		Integer obj = new Integer(s.id);
//		Integer obj2 = new Integer(921234);
//		System.out.println(s.name.hashCode() + "::" + ss.hashCode());
//		System.out.println(obj.hashCode() + "::" + obj2.hashCode());
//		System.out.println(System.identityHashCode(obj2));
//		
//		Student s1 = new Student(123, "Hong");
//		Student s2 = new Student(456, "Kim");
//		Student s3 = new Student(123, "Hong");
//		System.out.println("s1 equals s2 =" + s2.equals(s1)); // false
//		System.out.println("s1 equals s3 =" + s3.equals(s1)); // true

	}
	@Override
	public int compareTo(Student o) {
		System.out.println("comp=" + this.id + "-" + o.id);
//		return this.id - o.id; 내림차순
		return this.id - o.id *-1; //오름차순
	}

}
