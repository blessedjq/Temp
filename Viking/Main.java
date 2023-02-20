import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Vikingcity vk=new Vikingcity();
	String[] str=sc.nextLine().split(";");
	List<String[]> list=new ArrayList<>();
	for(String i:str)list.add(i.split(" - "));
    for(int i=0;i<str.length;++i){
         String[] curr=list.get(i);
        // vk.attack(curr[1].charAt(0),Integer.parseInt(curr[3]));
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