public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("Member 1");
        Member member2 = new Member("Member 2");
        Member member3 = new Member("Member 3");
        Member member4 = new Member("Member 4");
        Member member5 = new Member("Member 5");
        
        Group group = new Group("Group 1");
        group.addMember(member1);
        group.addMember(member2);
        group.addMember(member3);
        group.addMember(member4);
        group.addMember(member5);
        
        group.groupInfo();
    }
}
