public class Singer {



static Singer singers[]=new Singer[10];

	private String name;
	private int id;
	static int counter= 0;

	public Singer (String name1) {
		this.name = name1;
        singers[counter]=this;

		id=counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name1) {
		this.name = name1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id1) {
		this.id = id1;
	}

	public String toString() {
		return "Singer : name=" + name + ", id=" + id ;
	}
}
