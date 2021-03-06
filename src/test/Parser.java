package test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Parser {
	
	Pattern p;
	Matcher m;



	public Params runParser(String command){
		
		Params params = null;
		
		String[] exp = command.split("\\s+");
		
		switch(exp.length){
		case 1: //for show tree
			params = Params.newBuilder().setCommandName(exp[0]).build();
			break;
			
		case 2: //for grow branch or create branch
			params = Params.newBuilder().setCommandName(exp[0]).setBranchNameOne(exp[1]).build();	
			break;
			
		case 3: //for create *branch_type* *branch_name*
			params = Params.newBuilder().setCommandName(exp[0]).setBranchType(exp[1]).setBranchNameOne(exp[2]).build();
			break;
			
		case 4: //for attach *branch_name_one* to *branch_name_three*
			params = Params.newBuilder().setCommandName(exp[0]).setBranchNameOne(exp[1]).setBranchNameTwo(exp[3]).build();
			break;
			
		default:
			System.out.println("Wrong command " + "\"" + command + "\"");
		}
		
		return params;

	}
	
	
}
