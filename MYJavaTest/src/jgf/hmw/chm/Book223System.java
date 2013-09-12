package jgf.hmw.chm;
import java.util.*;

public class Book223System {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p=System.getProperties();
		Enumeration e=p.propertyNames();
		while(e.hasMoreElements())
		{
			String key=(String)e.nextElement();
			System.out.println(key+" = "+p.getProperty(key));
		}
		
	}

}
