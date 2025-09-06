package wel;

public class Job {
	    private int jobId;
	    private String title;

	    private String dept;
	    private String location;
	    private String status; // Open/Closed

	    public Job(int jobId, String title, String dept, String location, String status) {
	        this.jobId = jobId;
	        this.title = title;
	        this.dept = dept;
	        this.location = location;
	        this.status = status;
	    }

	    public int getJobId() { return jobId; }
	    public String getTitle() { return title; }
	    public String getDept() { return dept; }
	    public String getLocation() { return location; }
	    public String getStatus() { return status; }
	    public void setStatus(String status) { this.status = status; }

	    @Override
	    public String toString() {
	        return "Job[" + jobId + " | " + title + " | " + dept + " | " + location + " | " + status + "]";
	    }
	}



