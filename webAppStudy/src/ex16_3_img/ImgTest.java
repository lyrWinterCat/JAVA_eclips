package ex16_3_img;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImgTest {
	public static void main(String[] args) {
		Frame f = new Frame("이미지");
		f.setBounds(500, 300, 600, 600);
		f.setLayout(null);
		
		ImageIcon backImg = new ImageIcon("src/images/tea1.jpg");
		JLabel jl_back = new JLabel(backImg);
		jl_back.setBounds(50, 50, 500, 500);
		
		ImageIcon btnIcon = new ImageIcon("src/images/tea2.jpg");
		JButton jb = new JButton(btnIcon);
		jb.setBounds(50, 50, 105, 105);
		
		ImageIcon back2 = new ImageIcon("src/images/tea3.jpg");
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 배경으로 사용중인 JLabel의 아이콘을 back2로 변경
				jl_back.setIcon(back2);
				f.repaint();//현재 프레임의 내용을 갱신
				
			}
		});
		
		
		
		f.add(jb);
		f.add(jl_back);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
