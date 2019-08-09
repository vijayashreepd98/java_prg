
public class freelancer {
	private String name,skill;
	private Integer exp,id;
	public freelancer()
	{}
	public freelancer(String alpha,String beta, Integer cosmo, Integer gama)
	{
	name=alpha;
	skill=beta;
	exp=cosmo;
	id=gama;

	}
	public String toString()
	{
	return name+ " "+skill+" "+exp+" "+id;
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
		public Integer getExp() {
		return exp;
		}
		public void setExp(Integer exp) {
		this.exp = exp;
		}
		public Integer getId() {
		return id;
		}
		public void setId(Integer id) {
		this.id = id;
		}
		

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
