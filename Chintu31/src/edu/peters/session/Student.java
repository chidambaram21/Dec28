package edu.peters.session;
 class Student1 {
		int id;
		String name;
		public Student1(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
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
	public class Student {
		public static void main(String[] args) {		
		//	Student s1 = new Student(100,"Mar");
			try {
				Student1 s1 = null;
				System.out.println("Name------>"+s1.getName());
				System.out.println("Id---->"+s1.getId());
					
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			Student1 s2 = new Student1(200,"Akbar");
			
			System.out.println("Name------>"+s2.getName());
			System.out.println("Id---->"+s2.getId());
			
			Student1 s3 = new Student1(300,"Akash");
			
			System.out.println("Name------>"+s3.getName());
			System.out.println("Id---->"+s3.getId());
			
			
		}
}
}
