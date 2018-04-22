public class Votes
{
  private int[][] votesLists;
  private int projectPosition;

  public Votes()
  {
    votesLists = null;
    projectPosition = 0;
  }

  public Votes(int[][] theLists, int theNo)
  {
    votesLists = theLists;
    projectPosition = theNo;
  }

  public Votes(Votes theVotes)
  {      
    setProjectPosition(theVotes.getProjectPosition());
    setVotesLists(theVotes.votesLists);
  }

  // -------------------------------------------------------
  // Sets the project position in the projectList array.
  // -------------------------------------------------------
  public void setProjectPosition(int n)
  {
    projectPosition = n;
  }

  public void setVotesLists(int[][] list)
  {
    votesLists = list;
  }

  // -------------------------------------------------------
  // Returns the project position in the projectList array.
  // -------------------------------------------------------
  public int getProjectPosition()
  {
    return projectPosition;
  }

  // ----------------------------------------------------------
  // Returns the 2d array of votes.
  // ----------------------------------------------------------
  public int[][] getVotesLists()
  {
    int [][]list = null;
    if (votesLists!=null)
    {
      int size = votesLists.length;
      list = new int[size][size];
      for (int n = 0; n < size; n++)
      {
        for(int m = 0; m < size; m++)
        {
          list[n][m] = votesLists[n][m];
        }
      }
    }
    return list;
  }

  // ------------------------------------------------------------------------
  // Returns the value of the nth person's vote for the mth person if valid.
  // ------------------------------------------------------------------------
  public int getMemberVote(int n, int m)
  {
    final int ERROR = 0;
    if (n >= 0 && m >= 0 && n < votesLists.length 
        && m < votesLists.length && n != m)
    {
      return votesLists[n][m];
    }
    else
    {
      Controller.fatalError("Invalid number passed to the argument.");
      return ERROR;
    }
  }
}
