package wel;

public class Application {
	private Applicant applicant;
    private Job job;
    private String stage;
    private int score;
    private String remarks;

    public Application(Applicant applicant, Job job) {
        this.applicant = applicant;
        this.job = job;
        this.stage = "Applied";
        this.score = 0;
        this.remarks = "";
    }

    public Applicant getApplicant() { return applicant; }
    public Job getJob() { return job; }
    public String getStage() { return stage; }
    public int getScore() { return score; }
    public String getRemarks() { return remarks; }

    public void advanceStage() {
        switch (stage) {
            case "Applied": stage = "Screening"; break;
            case "Screening": stage = "Interview"; break;
            case "Interview": stage = "Offer"; break;
            default: stage = "Offer"; break;
        }
    }

    public void setScore(int score) { this.score = score; }
    public void setRemarks(String remarks) { this.remarks = remarks; }

    @Override
    public String toString() {
        return "Application[Applicant=" + applicant.getName() + ", Job=" + job.getTitle() +
                ", Stage=" + stage + ", Score=" + score + ", Remarks=" + remarks + "]";
    }
}



