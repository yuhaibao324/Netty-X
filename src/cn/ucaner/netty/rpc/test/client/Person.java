package cn.ucaner.netty.rpc.test.client;

/**
* @Package：cn.ucaner.netty.rpc.test.client   
* @ClassName：Person   
* @Description：   <p> Person </p>
* @Author： - Jason   
* @Modify By：   
* @Modify marker：   
* @version    V1.0
 */
public class Person {

	/**
	 * 姓
	 */
    private String firstName;
    
    /**
     * 名
     */
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

    @Override
    public int hashCode() {
        return this.firstName.hashCode()^this.lastName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person) ) return false;
        Person p = (Person)obj;
        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName);
    }
}
