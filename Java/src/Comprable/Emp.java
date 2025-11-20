package Comprable;

public class Emp implements Comparable<Emp>{
	
    String name;
    int id;
    int age;
    public Emp(String name, int id, int age) {
    		this.name=name;
		this.id=id;
		this.age=age;
	}
	@Override
    public String toString() {
    			return "Emp[name=" + name + ", id=" + id + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Emp e) {
			if(this.age>e.age) return 1;
			else if(this.age<e.age) return -1;
			else return 0;
	}

}