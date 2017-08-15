import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
	
	Pattern p;
	Matcher m;



	public void runAttach(String command){
		String regexp = "^(attach)\\s+(\\S+)\\s+to\\s+(\\S+)$";
//		String regexp = "^(grow)\\s+(\\S+)$";
		String mainCommand = command;
		
		p = Pattern.compile(regexp);
		m = p.matcher(mainCommand);
		
		System.out.println(mainCommand);
		
		while(m.find()){
			for(int i=0; i<m.groupCount()+1; i++){
				System.out.println(i + ": " + m.group(i).toUpperCase());
			}
			
			Params params = new Params(m.group(1), m.group(2), m.group(3));
			System.out.println(params.getCommandName() + params.getBranch1() + params.getBranch2());
					
		}
	}
	
	
}
