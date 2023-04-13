package thread;

import javax.swing.JLabel;

//GUIThread02의 라벨을 제어
public class LablePrintThread implements Runnable{
	JLabel lblnum;
	public LablePrintThread(){
		
	}
	public LablePrintThread(JLabel lblnum){
		this.lblnum = lblnum;
	}
	@Override
	public void run() {
		int num=0;
		try {
			while(!Thread.currentThread().isInterrupted()){
				lblnum.setText(num+"");
				Thread.sleep(500);
				num++;
			}
			
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
	}

}





