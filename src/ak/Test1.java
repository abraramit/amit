package ak;

public class Test1 implements Runnable {
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
		Thread t =new Thread(new Test1());
		t.start();
		
		for(int j=0;j<5;j++){
			System.out.println("j="+j);
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}

	}


}
