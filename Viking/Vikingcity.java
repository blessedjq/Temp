class Vikingcity{
    int north=0,south=0,east=0,west=0,count=0;
    
    public void attackNorth(int power){
         if(north<power){
                    ++count;
                    north=power;
                }
    }
    public void attackSouth(int power){
         if(south<power){
                    ++count;
                    south=power;
                }
    }
    public void attackEast(int power){
         if(east<power){
                    ++count;
                    east=power;
                }
    }
    public void attackWest(int power){
         if(west<power){
                    ++count;
                    west=power;
                }
    }
    public int getNoOfEffectiveAttacks(){
        return count;
    }
}