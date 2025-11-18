import java.util.ArrayList;
import java.util.List;

class Group {
    private String groupName;
    private List<Member> memberList;
    
    public Group(String groupName) {
        this.groupName = groupName;
        this.memberList = new ArrayList<>();
    }
    
    public void addMember(Member member) {
        memberList.add(member);
    }
    
    public void groupInfo() {
        System.out.println("Group Name: " + groupName);
        for (Member member : memberList) {
            member.memberInfo();
        }
    }
}
