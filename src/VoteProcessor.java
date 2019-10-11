import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		String TIE;
		int votesFrancis=0;
		     int votesSnowden=0;
		for (int i = 0; i < votes.size(); i++) {
			votes.get(i);			
		     
			if (votes.get(i).equalsIgnoreCase("pope francis")) {
				votesFrancis++;
				
			}
			if (votes.get(i).equalsIgnoreCase("edward snowden")) {
				votesSnowden++;
				
			}
			
		
	}
	if(votesFrancis==votesSnowden) {
				return "TIE";
			}
	if(votesFrancis>votesSnowden) {
		return "pope francis";
	}
	if(votesSnowden>votesFrancis) {
		return "edward snowden";
	}
	return null;
		}

}
