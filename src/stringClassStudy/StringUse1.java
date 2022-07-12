package stringClassStudy;

public class StringUse1 {

	

	public static void main(String[] args) {
	
		String name="velocity";//without using new keyword
		String city=new String("pune");// with using new keyword
		
		//String consist of diffrnt types of method
		
		
      // length () method use
		System.out.println(name.length());
		System.out.println(city.length());
		System.out.println("================");
		
		int output = name.length();//storing output in reference variable
		int output1 = city.length();
		System.out.println("The length of string is "+output);// we can reuse the reference variable
		System.out.println("The length of string is "+output1);
		System.out.println("====================");

		
		//touppercase() method use
		String a="velocity";
		System.out.println(a);
		System.out.println(a.toUpperCase());
		String b = a.toUpperCase();//storing output in reference variable
		System.out.println("The char convert lower to capital digit "+b);
		System.out.println("======================");
		
		//tolowercase() method use
		String a1="BHUSHAN";
		System.out.println(a1);
		System.out.println(a1.toLowerCase());
		String b1 = a1.toLowerCase();//storing output in reference variable
		System.out.println("The char convert capital to small "+b1);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		// equal() method use
		String c1="velocity";
		String c2="velocity";
		String c3=new String("velocity");
		String c4=new String("velocity");
		String c5=new String("VELOCITY");
		
		// ==(equal ignore case) will compare only memory location that will not compare string content
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		System.out.println(c3==c4);
		System.out.println("========================");
		
		//equal will compare content of string
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c4));
		System.out.println("========================");
		System.out.println(c1.equals(c5));
		System.out.println(c1.equalsIgnoreCase(c5));
		System.out.println("==========================");
		
		//contains() method use
		String d1="VELOCITY";
		System.out.println(d1.contains("LO"));
		boolean result = d1.contains("LO");
		System.out.println(result);
		System.out.println("===========================");
		
		// isempty() method use
		String m="pune";
		String n="";
		String l=" ";
		String o=null;
		
		System.out.println(m.isEmpty());
		System.out.println(n.isEmpty());
		System.out.println(l.isEmpty());
		//System.out.println(o.isEmpty()); error observed null point exception
		System.out.println("==============================");
		System.out.println(m.length());
		System.out.println(n.length());
		System.out.println(l.length());
		//System.out.println(o.length()); error observed null point exception
		System.out.println("===============================");
		
		//charAt() method use
		String x="INDIA";
		
		System.out.println(x.charAt(3));
		System.out.println(x.charAt(0));
		char requiredchar=x.charAt(0);
		System.out.println(requiredchar);
		//System.out.println(x.charAt(-1)); error string index of boudary exception
		System.out.println("==================================");
		
		//endswith() method use
		String e="velocity";
		
		System.out.println(e.endsWith("ty"));
		System.out.println(e.endsWith("city"));
		System.out.println(e.endsWith("CITY"));
		System.out.println(e.endsWith("cy"));
		System.out.println("====================================");
		
		// startswith() method use
		
		System.out.println(e.startsWith("ve"));
		System.out.println(e.startsWith("Ve"));
		System.out.println(e.startsWith("loc", 2));
		System.out.println(e.startsWith("city", 4));
		System.out.println(e.startsWith("city", 3));
		System.out.println("=====================================");
		
		//substring() method use
		
		String test="velocity corporate training centre";
		System.out.println(test.substring(9));
		System.out.println(test.substring(8));
		String mystring = test.substring(9);
		System.out.println(mystring);
		System.out.println("======================================");
		
		//concate () method use
		String y="pune";
		String y1="city";
		System.out.println(y.concat(y1));
		System.out.println(y.concat(" ").concat(y1));
		System.out.println("=========================================");
		
		// indexof() method use
		String z="INDIAIAIAD";
		System.out.println(z.indexOf("A"));
		System.out.println(z.indexOf("I"));
		int zz=z.indexOf("D");
		System.out.println(zz);
		System.out.println(z.indexOf("D"));
		System.out.println(z.indexOf("I",4 ));
		System.out.println(z.indexOf("D", 1));
		System.out.println(z.lastIndexOf("I"));
		System.out.println("===========================================");
		
		// replace() method use
		String z1="Automation Testing";
		System.out.println(z1.replace("A", "a"));
		System.out.println(z1.replace("A", "M"));
		System.out.println(z1.replace(" ", "$"));
		
		
		
		
		
		
		
		
		
	}

}
