import java.util.Scanner;


public class BuildWalls {

	//This function will return the max height calculated as per conditions.
	public static int maxHeight(int[] stickPositions,int[] sticksHeight){
		int maxeight=0;
		for(int i=0;i<stickPositions.length-1;i++){
			/*Space between both the sticks is calculated. If it is more than one then height is incremented by 1 unit
			from the given height*/
			int space = stickPositions[i+1]-stickPositions[i];
			if(space>1){
				maxeight=sticksHeight[i];
				for(int j=1;j<space;j++){
					if(j==1){
						maxeight++;
					}else if(maxeight<sticksHeight[i+1]){
						maxeight++;
					}
				}
			}
		}		
		return maxeight;	
	}
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		//The position of the sticks are got as input
		int sticksCount=input.nextInt();
		int[] stickPositions=new int[sticksCount];
		for(int i=0;i<sticksCount;i++){
			stickPositions[i]=input.nextInt();
		}
		//The height of the sticks are got as input
		int heightsCount=input.nextInt();
		int[] sticksheight=new int[sticksCount];
		for(int i=0;i<heightsCount;i++){
			sticksheight[i]=input.nextInt();
		}
		System.out.println("final max "+maxHeight(stickPositions,sticksheight));
	}

}
