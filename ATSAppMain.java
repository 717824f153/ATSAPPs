package wel;
import java.util.*;

public class ATSAppMain {

	public static void main(String[] args) {
		ATSService service = new ATSService();

        // Add Jobs
        service.addJob(new Job(101, "Software Engineer", "IT", "Bangalore", "Open"));
        service.addJob(new Job(102, "HR Manager", "HR", "Mumbai", "Open"));

        // Add Applicants
        service.addApplicant(new TechApplicant(1, "Alice", "alice@mail.com", 3,
                Arrays.asList("Java", "SQL", "Spring"), "Backend"));
        service.addApplicant(new TechApplicant(2, "Bob", "bob@mail.com", 6,
                Arrays.asList("Python", "ML"), "AI"));
        service.addApplicant(new NonTechApplicant(3, "Charlie", "charlie@mail.com", 8,
                Arrays.asList("Communication", "Leadership"), "HR"));

        // Apply for jobs
        service.apply(1, 101);
        service.apply(2, 101);
        service.apply(3, 102);

        // Advance stages
        service.advanceStage(1, 101);
        service.advanceStage(2, 101);
        service.advanceStage(3, 102);

        // Display everything
        System.out.println("\n--- Jobs ---");
        service.showJobs();

        System.out.println("\n--- Applicants ---");
        service.showApplicants();

        System.out.println("\n--- Applications ---");
        service.showApplications();

        // Rank candidates
        System.out.println("\n--- Ranked Candidates ---");
        service.rankByScore();

        // Search examples
        System.out.println("\n--- Search by Skill: Java ---");
        service.searchApplicants("Java").forEach(System.out::println);

        System.out.println("\n--- Search by Exp >= 5 ---");
        service.searchApplicants(5).forEach(System.out::println);
    }


	

	}


