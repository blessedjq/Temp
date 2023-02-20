import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Vikingcity vk=new Vikingcity();
	String[] str=sc.nextLine().split(";");
	List<String[]> totalAttacks=new ArrayList<>();
	for(String i:str){
	    String[] currentAttacks=i.split(" : ");
	    for(String j:currentAttacks)totalAttacks.add(j.split(" - "));
	}
	int length=totalAttacks.size();
    for(int i=0;i<length;++i){
        String[] curr=totalAttacks.get(i);
        char dir=curr[1].charAt(0);
        int power=Integer.parseInt(curr[3]);
        if(dir=='N')vk.attackNorth(power);
        else if(dir=='S')vk.attackSouth(power);
        else if(dir=='W')vk.attackWest(power);
        else if(dir== 'E')vk.attackEast(power);
        
    }
    System.out.println(vk.getNoOfEffectiveAttacks());
	}
}