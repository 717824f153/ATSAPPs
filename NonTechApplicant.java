package wel;
import java.util.*;

public class NonTechApplicant extends Applicant {
	private String area;

    public NonTechApplicant(int appId, String name, String email, int experience, List<String> skills, String area) {
        super(appId, name, email, experience, skills);
        this.area = area;
    }

    @Override
    public int evaluate() {
        return super.evaluate() + (experience > 5 ? 15 : 5);
    }

    @Override
    public String toString() {
        return "NonTech" + super.toString() + " | Area=" + area;
    }
}


