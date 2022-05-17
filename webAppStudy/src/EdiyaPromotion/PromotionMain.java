package EdiyaPromotion;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import BuyPanel.Test;
import EdiyaMain.EdiyaMain;
import Storage.PrMain;

public class PromotionMain extends JFrame implements ActionListener,Runnable{
	static int myMoney = 50_0000;
	int cnt=0;
	boolean stop=true;
	String [] imageResource = {"../pageImage/promotion1.png","../pageImage/promotion2.png","../pageImage/promotion3.png"};
	Image background= new ImageIcon(PromotionMain.class.getResource(imageResource[cnt])).getImage();
	JButton backIcon;
	
	EdiyaMain eMain;
	PrMain pM;
	
	public PromotionMain() {
		new Test();
		setTitle("EDIYA");
		setSize(480, 600);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		backIcon = new JButton(new ImageIcon(background));
		backIcon.addActionListener(this);
		backIcon.setName("메인이동");
		backIcon.setSize(480, 600);
		add(backIcon);		
		
		setVisible(true);		
	}
	
	public void paint(Graphics g) {		
			if(cnt==0) {
				g.drawImage(new ImageIcon(PromotionMain.class.getResource(imageResource[cnt])).getImage(), 0, 0, null);
				cnt++;		
			}else if(cnt==1) {
				g.drawImage(new ImageIcon(PromotionMain.class.getResource(imageResource[cnt])).getImage(), 0, 0, null);
				cnt++;
			}else if(cnt==2) {
				g.drawImage(new ImageIcon(PromotionMain.class.getResource(imageResource[cnt])).getImage(), 0, 0, null);
				cnt=0;
			}		
		}	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		JButton button = (JButton)o;
		if(button.getName().equals("메인이동")) {
			stop=false;
			eMain = new EdiyaMain();
			pM = new PrMain();
			eMain.startEdiyaMain();
			dispose();		
		}		
	}
	
	@Override
	public void run() {
		while(stop) {
			try {
//				backIcon.setDisabledIcon(null);
				System.out.println(cnt);
				Thread.sleep(1500);
				repaint();		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}		
	}
	public static void main(String[] args) {
		PromotionMain pm = new PromotionMain();
		Thread t = new Thread(pm);
		t.start();
	}


}
