package application;


public class Bracket {
    
    public Team[][] leftChallengerLists;
    public Team[][] rightChallengerLists;
    public int roundNum;

    public Bracket(String[] teamsName) {
        int numOfTeam = teamsName.length;
        int teamInSeries = numOfTeam;
        teamsName = reorder(teamsName);
        roundNum = 0;
        while(teamInSeries!=1) {
            teamInSeries/=2;
            roundNum++;
        }
        leftChallengerLists = new Team[roundNum+1][numOfTeam/2+1];
        rightChallengerLists = new Team[roundNum+1][numOfTeam/2+1];
        for(int i=0; i<numOfTeam/2; i++) {
            leftChallengerLists[1][i+1] = new Team();
            leftChallengerLists[1][i+1].name.setText(teamsName[i]);
            leftChallengerLists[1][i+1].score.setVisible(true);
            rightChallengerLists[1][i+1] = new Team();
            rightChallengerLists[1][i+1].name.setText(teamsName[numOfTeam-1-i]);
            rightChallengerLists[1][i+1].score.setVisible(true);
        }
    }
    
    
    private String[] reorder(String[] teamsName) {
        return teamsName;
        // TODO reorder teams
//        String[] orderedTeams = new String[teamsName.length];
//        for(int i=1; i<=teamsName.length; i++) {
//            
//        }
//        return orderedTeams;
    }

    
    
}
