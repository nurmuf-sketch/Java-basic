import java.util.ArrayList;
import java.util.List;

public class RepositoryMember {

    private static List<Member> members = new ArrayList<>();

    static {
        members.add(new Member("M-001", "Risman", "Bandung"));
        members.add(new Member("M-002", "Budi", "Bandung"));
        members.add(new Member("M-003", "Resti", "Kab. Bandung"));
    }

    public static List<Member> getAllMember() {
        return new ArrayList<>(members);
    }
}