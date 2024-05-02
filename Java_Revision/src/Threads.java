
class Threads extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
	 Threads t1=new Threads();  
	 Threads t2=new Threads();  
   t1.start();
   t2.start();
  t1.run();  
  t2.run();  
 }  
} 