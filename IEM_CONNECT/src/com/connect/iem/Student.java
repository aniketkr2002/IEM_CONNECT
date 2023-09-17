package com.connect.iem;

public class Student {
		private String  name;
		private String password;
		private long   enrollment;
		
		Student(String name,String password,long enrollment ){
			this.name =name;
			this.password=password;
			this.enrollment =enrollment;
		}

		public long getEnrollment() {
			return enrollment;
		}

		public void setEnrollment(long enrollment) {
			this.enrollment = enrollment;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
}
