
public class College {
	String university;
	String department;
	String  branch;
	String faculty;
	int  code;
	@Override
	public String toString() {
		return "College [university=" + university + ", department=" + department + ", branch=" + branch + ", faculty="
				+ faculty + ", code=" + code + "]";
	
		
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	
	

}
