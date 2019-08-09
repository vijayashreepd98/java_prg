
public class employee {
	private  String name,skill;
	int exp,ssn;
	public employee()
	{
		
	}
	public employee(String name,String skil,int exp,int ssn)
	{
	this.exp=exp;
	this.name=name;
	this.skill=skill;
	this.ssn=ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
