package wel;
import java.util.*;
public class ATSService {
    private Map<Integer, Job> jobs = new HashMap<>();
    private Map<Integer, Applicant> applicants = new HashMap<>();
    private List<Application> applications = new ArrayList<>();

    public void addJob(Job job) { jobs.put(job.getJobId(), job); }
    public void addApplicant(Applicant applicant) { applicants.put(applicant.getAppId(), applicant); }

    public void apply(int appId, int jobId) {
        Applicant a = applicants.get(appId);
        Job j = jobs.get(jobId);
        if (a != null && j != null) {
            applications.add(new Application(a, j));
            System.out.println("Application submitted: " + a.getName() + " -> " + j.getTitle());
        }
    }

    public void advanceStage(int appId, int jobId) {
        for (Application app : applications) {
            if (app.getApplicant().getAppId() == appId && app.getJob().getJobId() == jobId) {
                app.advanceStage();
                app.setScore(app.getApplicant().evaluate());
                System.out.println("Stage advanced: " + app);
                return;
            }
        }
    }

    // Overloading: searchApplicants
    public List<Applicant> searchApplicants(String skill) {
        List<Applicant> res = new ArrayList<>();
        for (Applicant a : applicants.values())
            if (a.getSkills().contains(skill)) res.add(a);
        return res;
    }

    public List<Applicant> searchApplicants(int minExp) {
        List<Applicant> res = new ArrayList<>();
        for (Applicant a : applicants.values())
            if (a.getExperience() >= minExp) res.add(a);
        return res;
    }

    public List<Applicant> searchApplicants(String keyword, boolean inName) {
        List<Applicant> res = new ArrayList<>();
        for (Applicant a : applicants.values()) {
            if ((inName && a.getName().contains(keyword)) || (!inName && a.getEmail().contains(keyword))) {
                res.add(a);
            }
        }
        return res;
    }

    public void rankByScore() {
        applications.sort((a, b) -> Integer.compare(b.getScore(), a.getScore()));
        System.out.println("---- Ranked Candidates ----");
        for (Application app : applications) System.out.println(app);
    }

    public void showJobs() { jobs.values().forEach(System.out::println); }
    public void showApplicants() { applicants.values().forEach(System.out::println); }
    public void showApplications() { applications.forEach(System.out::println); }
}



