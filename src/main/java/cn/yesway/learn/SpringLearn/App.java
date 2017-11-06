package cn.yesway.learn.SpringLearn;

import cn.yesway.learn.SpringLearn.PartOne.Service.IocInterface;
import cn.yesway.learn.SpringLearn.PartOne.Service.Impl.IocInterfaceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	//第一版
//    public static void main( String[] args )
//    {
//        IocInterface ioc = new IocInterfaceImpl();
//        System.out.println(ioc.say());
//    }
	
////	构造器注入
//	private IocInterface ioc;
//	public App(IocInterface ioc){
//		this.ioc = ioc;
//	}
//	public void say(){
//		System.out.println(ioc.say());
//	}

	// 属性注入
	private IocInterface ioc;

	public void setIoc(IocInterface ioc) {
		this.ioc = ioc;
	}

	public void say() {
		System.out.println(ioc.say());
	}
}
