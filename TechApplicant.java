package wel;
import java.util.*;

public class TechApplicant extends Applicant {
    private String domain;

    public TechApplicant(int appId, String name, String email, int experience, List<String> skills, String domain) {
        super(appId, name, email, experience, skills);
        this.domain = domain;
    }

    @Override
    public int evaluate() {
        int score = super.evaluate();
        if (skills.contains("Java")) score += 20;
        if (skills.contains("SQL")) score += 10;
        return score;
    }

    @Override
    public String toString() {
        return "Tech" + super.toString() + " | Domain=" + domain;
    }
}



