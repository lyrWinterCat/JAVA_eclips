package Account;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calendar2 extends Frame {
	String f = "5";
	private static final long serialVersionUID = 1L;
	protected static final Object[] JFrame = null;
	private Panel SearchPanel = null;
	private Panel CaledarPanel = null;
	private Label labelMonth = null;
	private Label labelYear = null;
	private Label[] dayOfWeekLabel = null;
	private TextField textFieldYear = null;
	private TextField textFieldMonth = null;
	private Button searchButton = null;
	 Button[] dayButton = null;
	private int date;
	 int space;
	 int lastday;
	private String[] dayOfWeek = { "��", "��", "ȭ", "��", "��", "��", "��" };
	Font myFont = null;
	Font myFont1 = null;
	Label q1 = null;
	
	
	int d  = 0;
	int d2 = 0;
	int d3 = 0;
	int d4 = 0;
	int d5 = 0;
	int d6 = 0;
	int d7 = 0;

	private Panel getSearchPanel() {
		if (SearchPanel == null) {
			// Year, Month Label
			myFont = new Font("Serif", Font.BOLD, 12);
			myFont1 = new Font("Serif", Font.BOLD, 20);
			labelYear = new Label("��");
			labelYear.setFont(myFont);
			labelMonth = new Label("��");
			labelMonth.setFont(myFont);
			// Year, Month TextField
			textFieldYear = new TextField("2022");
			textFieldYear.setFont(myFont);

			textFieldMonth = new TextField(f);
			textFieldMonth.setFont(myFont);
			q1 = new Label("�̹��� ���� : "+(d+d2+d3+d4+d5+d6+d7));
			q1.setBounds(600, 35, 300, 30);
			q1.setFont(myFont1);
			
			// Search Button
			searchButton = new Button("�˻�");
			searchButton.setFont(myFont);
			// Button event
			searchButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getCalendarData(Integer.parseInt(textFieldYear.getText()),
							Integer.parseInt(textFieldMonth.getText()));
					setCalendarButton();

				}
			});

			// Search Panel
			add(q1);
			SearchPanel = new Panel();
			
			SearchPanel.setLayout(new FlowLayout());
			SearchPanel.add(textFieldYear, null);
			SearchPanel.add(labelYear, null);
			SearchPanel.add(textFieldMonth, null);
			SearchPanel.add(labelMonth, null);
			
			SearchPanel.setFont(myFont);
			
			
			

		}
		return SearchPanel;
	}

	private void getCalendarData(Integer year, Integer month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1); // ���� ��ü�� ��, ��, �� ���� ����
		date = cal.get(Calendar.DAY_OF_WEEK); // �ش� ���� 1���� ����(�Ͽ����� 1, ������� 7)
		space = date - 1; // �޷� ù ���� ���� ��ư�� ����
		lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // �ش� ���� ������ ��¥
	}

	private Panel getCalendarPanel() {
		if (CaledarPanel == null) {
			// Calendar Panel
			CaledarPanel = new Panel();
			CaledarPanel.setLayout(new GridLayout(7, 7));

			// Day of week Label
			dayOfWeekLabel = new Label[7];
			for (Integer i = 0; i < 7; i++) {
				dayOfWeekLabel[i] = new Label(dayOfWeek[i]);
				myFont = new Font("Serif", Font.BOLD, 14);
				dayOfWeekLabel[i].setFont(myFont);
				dayOfWeekLabel[i].setBackground(Color.GRAY);
				dayOfWeekLabel[i].setForeground(Color.WHITE);
				dayOfWeekLabel[i].setAlignment(Label.CENTER);
				CaledarPanel.add(dayOfWeekLabel[i]);
			}

			// Day Button
			dayButton = new Button[42];
			
			for (Integer i = 0; i < 42; i++) {
				dayButton[i] = new Button();
				// Button event
				
				
				
				CaledarPanel.add(dayButton[i]);

			}

			setCalendarButton();

		}
		return CaledarPanel;

	}
	private void setCalendarButton() {
        // ��ư �ؽ�Ʈ �ʱ�ȭ
        for (Integer i = 0; i < 42; i++) {
        	
            dayButton[i].setLabel("");
           
        }
 
        // ��ư �ؽ�Ʈ�� ��¥ ����
         
        for (Integer i = 1; i < lastday + 1; i++) {
        	
            dayButton[i + space - 1].setLabel(i+"�� : "+0+"��");
           
			
					 }
       	 
                    } 
                    
            
            

	public static void main(String[] args) {
		Calendar2 cal = new Calendar2();
		cal.setVisible(true);
	}

	public Calendar2() { // constructor
		super();
		initialize();
	}

	private void initialize() {
		this.setBounds(550, 230, 500, 308);
		this.setTitle("�Ѵ� �Ǹž�");

		getCalendarData(2022, 5);

		// add
		this.add(getSearchPanel(), BorderLayout.NORTH);
		this.add(getCalendarPanel(), BorderLayout.CENTER);

	}
}
