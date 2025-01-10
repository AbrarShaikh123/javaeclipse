package Java;

public class copyconstructor {
	



	    int a, b, add;

	    copyconstructor(int value1, int value2){
	        a = value1;
	        b = value2;
	        add = a + b;
	    }

	    copyconstructor(copyconstructor se){
	        a = se.a;
	        b = se.b;
	        add = a - b;
	    }

	    public static void fun(){
	        System.out.println("Hello");
	    }

	    public static void main(String[] Args){



	    	copyconstructor abc = new copyconstructor(1001,50);
	    	copyconstructor abc1 = new copyconstructor(abc);

	        System.out.println(abc.add);
	        System.out.println(abc1.add);

	    }


	}
	
