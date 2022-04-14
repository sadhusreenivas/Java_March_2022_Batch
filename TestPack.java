package mypack;

import cdac.hyd.PGDAC; // all classes - PGDAC 
import in.cdachyd.*;
public class TestPack{
 public static void main(String[] args) {
 		
 		PGDAC d1=new PGDAC();
 		d1.getTotal();

 		cdac.hyd.DASSD d2=new cdac.hyd.DASSD(); // FQN
 		d2.getTotal();

 		Date d=new Date();
 		d.getDate();
 	}	

}





// inorder to access an user defined package, one must be in a package (import)