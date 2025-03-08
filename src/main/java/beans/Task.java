package beans;

public class Task {
	public Task(int taskid, String taskname, String taskdate, int taskstatus, int regid) {
		super();
		this.taskid = taskid;
		this.taskname = taskname;
		this.taskdate = taskdate;
		this.taskstatus = taskstatus;
		this.regid = regid;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int taskid;
	private String taskname;
	private String taskdate;
	private int taskstatus;
	private int regid;
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getTaskdate() {
		return taskdate;
	}
	public void setTaskdate(String taskdate) {
		this.taskdate = taskdate;
	}
	public int getTaskstatus() {
		return taskstatus;
	}
	public void setTaskstatus(int taskstatus) {
		this.taskstatus = taskstatus;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}

}
