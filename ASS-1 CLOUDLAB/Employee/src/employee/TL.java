

package employee;
public class TL {
    public static void main (String args[]) {
        TeamLeader KT = new TeamLeader("SHIVANI", "4324-T", "11/12/43", 2, 6.00);
        TeamLeader MF = new TeamLeader("ABHA", "4325-K", "42/31/13", 2, 10.00, 350.00, 10, 8);
        KT.setMinTrainingHours(400);
        KT.setTrainingHours(4);
        KT.setMonthyBonus(1.00);
        System.out.println(KT.toString());
        System.out.println(MF.toString());
    }
}

