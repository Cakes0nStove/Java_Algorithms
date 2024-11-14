
public class Circular {
	public static void main(String[] args) {
		//Calculate the closest rational number to PI,
		// the idea behind this is to use the principle of bruteforcing and range reducing to speed up the algorithm.
	    long startTime = System.currentTimeMillis();
		int num = 500000;
		double bestNum = 10000;
		int tempN = 3;
		int tempD = 1;
		
		System.out.println(1/3);
		
		for(int i = 1; i < num / 3.3; i++) {
			for(int j = (int)( 3.2 * i); j < 4 * i ; j++) {
				var diff = Math.abs(((double)j/i) - Math.PI);
				if(diff < bestNum) 
				{
					bestNum = diff;
					tempN = j;
					tempD = i;
				
				}
			}
		}
		System.out.print(tempN + "/" + tempD +"    error = " + bestNum);
		
		long endTime = System.currentTimeMillis();
		System.out.println("          time =" + ((endTime-startTime)/1000)+"s");


		//This code underneath is used to create a custom timer when you input the seconds
		// the program then calculates how many hours, mins,sec, and millisec there are 
		//within those seconds
	
		
		double time = 3661.001;//seconds
		double hours2= (double) (time / 3600);//1.0169
		double hours = (int)(time / 3600);//1
		
		double mins2 = (hours2 - hours) * 60;//1.0169 -1 % 60 = 1.0166
		double mins = (int)mins2;//1
		double seconds = (int)((mins2 - mins) * 60);//1.0
		double seconds2 =(mins2 - mins) * 60;//1.001
		double milliseconds = (int)((seconds2-seconds)* 1000);
//HH:MM:SS:mmm		
		
		System.out.println("Hours =" + hours);
		System.out.println("Minutes =" + mins);
		System.out.println("Seconds =" + seconds);
		
		System.out.printf((int)hours+":"+(int)mins+":"+(int)seconds+":"+(int)milliseconds);
		
		
	}
		
		

	
	
	
	
}

