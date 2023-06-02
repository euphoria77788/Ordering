import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Function implements ActionListener {
	
	JFrame f,f1;JPanel p,p2,p3,drinks,bmi,cal;JButton bdrinks,bbmi,bcai;CardLayout cout;BoxLayout box;
	Color Co,Co1,Co2,Co3;GridLayout gdlt;
	
	
	public Function(){
		f=new JFrame();
		Co = new Color(50,200,200);
		Co1 = new Color(250,150,150);
		Co2 = new Color(150,200,150);
		Co3 = new Color(250,200,150);
		
		
		
		p = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p2.setBackground(Co);
		
		cout=new CardLayout();
		
		p.setLayout(cout);
		
		drinks = new JPanel();
		bmi = new JPanel();
		cal = new JPanel();
		
		drinks.setBackground(Co1);
		bmi.setBackground(Co2);
		cal.setBackground(Co3);
		
		
		
		p.add(drinks, "1");
		p.add(bmi, "2");
		p.add(cal,"3");
		
		Drinks();
		Bmi();
		calculate();
		
		
		bdrinks=new JButton("飲料");
		bbmi=new JButton("BMI");
		bcai=new JButton("計算機");
		
//		bdrinks.setPreferredSize(new Dimension(100, 50));
//		bbmi.setPreferredSize(new Dimension(100, 50));
//		bcai.setPreferredSize(new Dimension(100, 50));
		
		
		p2.add(bdrinks);
		p2.add(bbmi);
		p2.add(bcai);
		f.setTitle("飲料");
		
		
		
//		JLabel jLabel1 = new JLabel("C1");
//		jLabel1.setBounds(100,100,70,20);
//		bmi.add(jLabel1);
		
		bdrinks.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       
	        	
	        	cout.show(p,"1");
	        	f.setTitle("飲料");
	        	
	        }});
		
		bbmi.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       
	        	
	        	cout.show(p,"2");
	        	f.setTitle("BMI");
	        	
	        }});
		
		bcai.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       
	        	
	        	cout.show(p,"3");
	        	f.setTitle("計算機");
	        	
	        }});
		
		
		
		
//		f.setSize(500,500);  
		f.setBounds(450,200,500,500);
//	    f.setLayout(null);  
	    f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		box = new BoxLayout(p2, BoxLayout.Y_AXIS);
		gdlt = new GridLayout(3,1,0,1);
		p2.setLayout(gdlt);
		
//		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
//		box.minimumLayoutSize(p2);
//		p2.add(p3);
		
		f.getContentPane().add(p, BorderLayout.CENTER);
		f.getContentPane().add(p2, BorderLayout.WEST);
		
		
//		bdrinks.setSize(100,50);
//		bbmi.setSize(100,50);
//		bcai.setSize(100,50);
		
	}
	
	JLabel dril1,dril2,dril3;JComboBox cb1,cb2,cb3;JButton drib;JCheckBox chb1,chb2,chb3,chb4;JLabel drilabel;
	
	void Drinks(){
		
		drib=new JButton("送出");  
		drib.setBounds(200,400,75,20);
	    drilabel = new JLabel("可加的料");          
	    drilabel.setHorizontalAlignment(JLabel.CENTER);  
	    drilabel.setSize(350,350);
	    dril1=new JLabel("飲料種類");  
	    dril1.setBounds(70,20, 100,30);
	    dril2=new JLabel("甜度");  
	    dril2.setBounds(70,60, 100,30);
	    dril3=new JLabel("冰塊");  
	    dril3.setBounds(70,100, 100,30);
	    
	    String drinks1[]= {"紅茶","綠茶","清茶","麥茶"};
	    cb1=new JComboBox(drinks1);
	    cb1.setBounds(200, 20,90,30);
	    String sweet[]= {"正常","7分","半糖","三分","無糖"};
	    cb2=new JComboBox(sweet);
	    cb2.setBounds(200, 60,90,30);
	    String cold[]= {"正常","一半","去冰","溫","熱"};
	    cb3=new JComboBox(cold);
	    cb3.setBounds(200, 100,90,30);
	    
	    chb1=new JCheckBox("椰果");  
	    chb1.setBounds(100,200,50,20);
	    chb1.setBackground(null);
	    chb2=new JCheckBox("珍珠");  
	    chb2.setBounds(100,250,50,20);
	    chb2.setBackground(null);
	    chb3=new JCheckBox("粉條");  
	    chb3.setBounds(200,200,50,20);
	    chb3.setBackground(null);
	    chb4=new JCheckBox("芋圓");  
	    chb4.setBounds(200,250,50,20);
	    chb4.setBackground(null);
		
	    drinks.add(chb1);drinks.add(chb2);drinks.add(chb3);drinks.add(chb4);
	    drinks.add(cb1);drinks.add(cb2);drinks.add(cb3);
	    drinks.add(dril1);drinks.add(dril2);drinks.add(dril3);drinks.add(drib);drinks.add(drilabel);
	    drinks.setLayout(null);
	    drib.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       
	        	
	        	String data = "你點的飲料是: "   
	        	    	+ cb1.getItemAt(cb1.getSelectedIndex())+"\n甜度是: "+cb2.getItemAt(cb2.getSelectedIndex())+"\n冰度是: "+cb3.getItemAt(cb3.getSelectedIndex());
//	        	    	label.setText(data);
	        	    	String msg="";  
	        	    	if(chb1.isSelected()||chb1.isSelected()||chb2.isSelected()||chb3.isSelected()||chb4.isSelected()) {
		        	        if(chb1.isSelected()){  
		        	              
		        	            msg="椰果\n";  
		        	        }  
		        	        if(chb2.isSelected()){  
		        	              
		        	            msg+="珍珠\n";  
		        	        }  
		        	        if(chb3.isSelected()){  
		        	              
		        	            msg+="粉條\n";  
		        	        }
		        	        if(chb4.isSelected()){  
		        	            
		        	            msg+="芋圓\n";  
		        	        }
	        	    	}
	        	    	else
	        	    		msg+="無";
	        	        	
	        	        	
	        	        JOptionPane.showMessageDialog(drinks,data+"\n你加的料有:\n"+msg);
	        	
	        }});
	    
	}
	
	JTextField bmitf1,bmitf2;JButton calbmi;JLabel bmil1,bmil2;
	
	void Bmi(){
		
		calbmi=new JButton("計算");  
		calbmi.setBounds(120,150,75,20);
	    
	    bmil1=new JLabel("身高(公分)");  
	    bmil1.setBounds(110,20, 100,30);
	    bmil2=new JLabel("體重(公斤)");  
	    bmil2.setBounds(110,70, 100,30);
	    
	    bmitf1=new JTextField();  
	    bmitf1.setBounds(70,50,150,20);  
	    bmitf2=new JTextField();  
	    bmitf2.setBounds(70,100,150,20);
        
        bmi.add(bmitf1);bmi.add(bmitf2);
        bmi.add(calbmi);bmi.add(bmil1);bmi.add(bmil2);
        bmi.setLayout(null);
//		f.setSize(350,300);  
//		f.setLayout(null);  
//		f.setVisible(true);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calbmi.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       
	        	
	        	String s1=bmitf1.getText();  
	            String s2=bmitf2.getText();
	            double Ht=Integer.parseInt(s1);  
	            double Kg=Integer.parseInt(s2);
	            double Bmi=Bmi(Ht, Kg);
	            String Sbmi=printAdd(Bmi);
	    		
	    		JOptionPane.showMessageDialog(f,"你的BMI是= "+Bmi+"\n"+Sbmi);
	        	
	        }});
		
	}
	
	double Bmi(double Ht,double Kg) {
		double Bmi=((double)((int)((Kg/((Ht/100)*(Ht/100)))*100)))/100;
		return Bmi;
	}
	
	String printAdd(double bmi) {
//		System.out.println("你的BMI是="+bmi);
		
		String B1 ="「體重過輕」，需要多運動，均衡飲食，以增加體能，維持健康！";
		String B2 ="恭喜！「健康體重」，要繼續保持！";
		String B3 ="「體重過重」了，要小心囉，趕快力行「健康體重管理」！";
		String B4 ="啊～「肥胖」，需要立刻力行「健康體重管理」囉！";
		
		String BMI1 = bmi>=18.5?(bmi>=24?(bmi>=27?B4:B3):B2):B1;
		
		return BMI1;
	}
	
	JTextField tf1,tf2,tf3;JButton b1,b2,b3,b4,b5;JLabel l1,l2;
	
	void calculate() {
		
		l1=new JLabel("數字1");  
	    l1.setBounds(50,20, 100,30);
	    l2=new JLabel("數字2");  
	    l2.setBounds(50,80,100,30);
		tf1=new JTextField();  
        tf1.setBounds(50,50,150,30);
        tf2=new JTextField();  
        tf2.setBounds(50,110,150,30);
        tf3=new JTextField("結果");  
        tf3.setBounds(50,150,150,30);
        tf3.setEditable(false);
        tf3.setBackground(null);
        b1=new JButton("+");  
        b1.setBounds(50,200,50,30);
        b2=new JButton("-");  
        b2.setBounds(150,200,50,30);
        b3=new JButton("*");  
        b3.setBounds(50,250,50,30);
        b4=new JButton("/");  
        b4.setBounds(150,250,50,30);
        b5=new JButton("%");  
        b5.setBounds(50,300,50,30);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        cal.add(l1);cal.add(l2);
        cal.add(tf1);cal.add(tf2);cal.add(tf3);
        cal.add(b1);cal.add(b2);cal.add(b3);cal.add(b4);cal.add(b5);
        
        cal.setLayout(null);
		
	}
	
	public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        double a=Integer.parseInt(s1);  
        double b=Integer.parseInt(s2);  
        double c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }
        else if(e.getSource()==b2){  
            c=a-b;  
        }  
        else if(e.getSource()==b3){  
            c=a*b;  
        }
        else if(e.getSource()==b4){  
        	c=a/b;  
        }
        else if(e.getSource()==b5){  
            c=a%b;  
        }
        
        
        
        
        	String result=String.valueOf(c);  
        tf3.setText(result); 
        
    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Function();
		
	}

}
