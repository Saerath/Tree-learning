package test;
//builder from https://habrahabr.ru/post/244521/


public class Params {
	private String commandName;
	private String branchNameOne;
	private String branchNameTwo;
	private String branchType;
	
	public Params() {
		// TODO Auto-generated constructor stub

	}
	
	public String getCommandName() {
		return commandName;
	}

	public String getBranchNameOne() {
		return branchNameOne;
	}

	public String getBranchNameTwo() {
		return branchNameTwo;
	}
	
	public String getBranchType() {
		return branchType;
	}
	
	public static Builder newBuilder(){
		return new Params().new Builder();
	}


	public class Builder {
		
		private Builder(){
			
		}
		
		public Builder setCommandName(String commandName) {
			Params.this.commandName = commandName;
			return this;
		}
		
		public Builder setBranchNameOne(String branchNameOne) {
			Params.this.branchNameOne = branchNameOne;
			return this;
		}
		
		public Builder setBranchNameTwo(String branchNameTwo) {
			Params.this.branchNameTwo = branchNameTwo;
			return this;
		}
		
		public Builder setBranchType(String branchType) {
			Params.this.branchType = branchType;
			return this;
		}
		
		public Params build(){
			return Params.this;
		}
		
	}

}
