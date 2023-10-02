// class externalVariables extends Main{
//   public int dayCounter = 1;
//   public int belli = 500;
//   public String playerName = "Hen";
  
// }
//Public static makes it on the same level as a class variable
class externalVariables {
    private playerStats playerStats;
    private String playerName;
    public int dayCounter;
    public int belli;

    public externalVariables(playerStats playerStats) {
        this.playerStats = playerStats;
        this.playerName = "Hen";
        this.dayCounter = 1;
        this.belli = 500;
    }

    public String getPlayerName() {
        return playerName;
    }
}