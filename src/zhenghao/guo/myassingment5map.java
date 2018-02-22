/*Zhenghao GUO
 * 950671756
 * winter quarter in 2018
 * In this assignment, I made an google map for my hometown,Guangzhou.
 * this is a specific program for the guangzhou university facility.
 * Ss are stadiums;Ps are parks;A are ATMS;
 * There are some flaws during the process I sourced datas. The only thing I can do is just 
 * excerpt all the locations one by one. I actually want to study how to use big data though this program. 
 */
package zhenghao.guo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

	public class myassingment5map  {
	    static String title;
	    static String mapCenterlati;
	    static String mapCenterlongi;
	    static int zoom;
	    static int width;
	    static int height;
	    static int scale;
	    static String type;
	    static String marks="";

	    
	    static void bigData() throws FileNotFoundException {
	    	// map initial info
	    	title="Guangzhou university village";
	    	width=800;
	    	height=600;    
	    	mapCenterlati="23.050922";     // Bellevue College, map center
	    	mapCenterlongi="113.392266";
	    	zoom=13;
	    	scale=1;
	    	type="terrain";  // roadmap, satellite, hybrid, terrain
	    	String markColor="";
	    	String label="";
	    	Scanner input=new Scanner(new File("guangzhou.txt"));
	    	while(input.hasNext()) {
	    		String id=input.next();
	    		String lati=input.next();
	    		String longi=input.next();
	    	if(id.equals("1")){markColor="red";label="S";}
	     	if(id.equals("2")) {markColor="yellow";label="A";}
            if(id.equals("3")) {markColor="green";label="P";}
	    	// mark 1
	    	//marks= "&markers=color:red%7Clabel:S%7C47.610378,-122.200676";  
	    	     // mark 2
	    	marks+="&markers=color:"+markColor+"%7Clabel:"+label+"%7c"+lati+","+longi;}
	 
            
	    	    }
		
		
		public static void main(String[] args) throws FileNotFoundException{//throws FileNotFoundException {
		    bigData();
		   
		    Asktype();
		    new assignment5map(title,mapCenterlati,mapCenterlongi,zoom,width,height,scale,type, marks); 
		}

        
        public static void Asktype() {
        	System.out.println("what is your type of map(roadmap, satellite, hybrid, terrain)?");
        	Scanner scan=new Scanner(System.in);
        	type=scan.nextLine();  // roadmap, satellite, hybrid, terrain
        	System.out.println("what is your scale?");
        	scale=scan.nextInt();  
        	System.out.println("what is your zoom");
        	zoom=scan.nextInt();
        }
}
	
	
