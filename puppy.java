public class puppy {
	int puppyAge;
	public puppy(String name) {
	System.out.println("终极傻屌"+name);
	}
	
	public void setAge( int age ) {
		puppyAge=age;
	}
	public int getAge() {
		System.out.println("年龄="+puppyAge);
		return puppyAge;
	}
	 public static void main(String[] args) {
	puppy myPuppy =new puppy("孟逸凡");
	myPuppy.setAge(23);
	myPuppy.getAge();
	System.out.println("变量值"+myPuppy.puppyAge);
	 }
}