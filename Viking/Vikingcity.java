class Vikingcity{
    private int northWall=0,southWall=0,eastWall=0,westWall=0,count=0;
    
    public void attackNorth(int power){
         if(northWall<power){
                    ++count;
                    northWall=power;
                }
    }
    public void attackSouth(int power){
         if(southWall<power){
                    ++count;
                    southWall=power;
                }
    }
    public void attackEast(int power){
         if(eastWall<power){
                    ++count;
                    eastWall=power;
                }
    }
    public void attackWest(int power){
         if(westWall<power){
                    ++count;
                    westWall=power;
                }
    }
    public int getNoOfEffectiveAttacks(){
        return count;
    }
}