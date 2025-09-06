package wel;
import java.util.*;

public class Applicant {
	 protected int appId;
	    protected String name;
	    protected String email;
	    protected int experience;
	    protected List<String> skills;

	    public Applicant(int appId, String name, String email, int experience, List<String> skills) {
	        this.appId = appId;
	        this.name = name;
	        this.email = email;
	        this.experience = experience;
	        this.skills = new ArrayList<>(skills);
	    }

	    public int getAppId() { return appId; }
	    public String getName() { return name; }
	    public String getEmail() { return email; }
	    public int getExperience() { return experience; }
	    public List<String> getSkills() { return skills; }

	    // Base evaluation
	    public int evaluate() {
	        return experience * 10;
	    }

	    @Override
	    public String toString() {
	        return "Applicant[" + appId + " | " + name + " | " + email +
	                " | Exp=" + experience + "yrs | Skills=" + skills + "]";
	    }
	}


