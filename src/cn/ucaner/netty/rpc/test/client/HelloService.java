package cn.ucaner.netty.rpc.test.client;

/**
* @Package：cn.ucaner.netty.rpc.test.client   
* @ClassName：HelloService   
* @Description：   <p> HelloService </p>
* @Author： - Jason   
* @Modify By：   
* @Modify marker：   
* @version    V1.0
 */
public interface HelloService {
	
	
	/**
	 * @Description: echo
	 * @param ping
	 * @return String
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
	public String echo(String ping);
	
	/**
	 * @Description: hello
	 * @param name
	 * @return String
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    String hello(String name);

    /**
     * @Description: hello
     * @param person
     * @return String
	 * @Autor: Jason - jasonandy@hotmail.com
     */
    String hello(Person person);
    
}
