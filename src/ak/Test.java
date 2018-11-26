package ak;

public class Test extends Thread {
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("i="+i);
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}

	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Test t =new Test();
		t.start();
		
		for(int j=0;j<5;j++){
			System.out.println("j="+j);
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}

	}

}
