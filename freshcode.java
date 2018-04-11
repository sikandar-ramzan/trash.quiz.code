import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Abdul Basit
 */
public class Framekandarframe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
                  JFrame P= new JFrame("Online Test");
        P.setSize(1500, 1500);
        P.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        P.setLayout(null);
      
        JLabel L5=new JLabel("Select the suitable Answer");
        L5.setForeground(Color.BLACK);
        L5.setBounds(400,20 ,200 ,100);

        JLabel L=new JLabel("1:What is the OOP ?");
        L.setBounds(60,50 ,150 ,100);
         L.setForeground(Color.RED);

        JRadioButton R1=new JRadioButton();
       
        R1.setBounds(40 ,142 ,30 ,20 );
        JRadioButton R2=new JRadioButton();
        R2.setBounds(40 ,175 ,30,20 );

        JRadioButton R3=new JRadioButton();
        R3.setBounds(40 ,205 ,30,20);

        JRadioButton R4=new JRadioButton();
        R4.setBounds(40 , 232 ,30,20 );

        JLabel L1=new JLabel("Object oriented Programing");
         L1.setForeground(Color.BLUE);
        L1.setBounds(70 ,100,200,100 );
        JLabel L2=new JLabel("object object processer");
        L2.setBounds(70 ,130,200,100 );
        L2.setForeground(Color.BLUE);
        JLabel L3=new JLabel("object object processer  ");
        L3.setForeground(Color.BLUE);
        L3.setBounds(70 ,160,200,100 );
        JLabel L4=new JLabel("Object oriented performance");
        L4.setBounds(70 ,190,200,100 );
        L4.setForeground(Color.BLUE);
       JLabel l5=new JLabel("Press OK");
       l5.setBounds(80,290, 200,50 );
P.setVisible(true);

        JButton b= new JButton("ok");
         b.setBackground(Color.GRAY);
        b.setBounds(150,300,60,30);
         b.addActionListener(new ActionListener() {
           
            public  void actionPerformed(ActionEvent f)
            {
    String W= "امین بھا ئ بہت پیا ر ے ہیں";
               
                if (R1.isSelected())
                {
                    JOptionPane.showMessageDialog(null,"your Answer is Right ");
                 
                }

                if(R2.isSelected())
                {
                 JOptionPane.showMessageDialog(null,W);

                }
                if(R3.isSelected())
                {
                 JOptionPane.showMessageDialog(null,W);

                }
                if(R4.isSelected())
                {
                 JOptionPane.showMessageDialog(null,W);

                }

            }
        });
        
//         meri jaan pehla frame edhr takk hei agy dusra frame hei
       
        JButton b1=new JButton("Next");
        b1.setBounds(220,300,100,30);   //aa frame one chy add kita wa
        b1.setBackground(Color.GRAY);
       
         JFrame P1= new JFrame("Online Test");
         P1.setLayout(null);
      
         b1.addActionListener(new ActionListener() {
           
            public  void actionPerformed(ActionEvent F)
            {
//                String Y=l5.getText();
                if (F.getActionCommand().equals("Next"))
                {

        P1.setSize(1000, 1000);
       
        P1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        P1.setVisible(true);
        P.setVisible(false);
      

                }
            }

     });
       
        
           JLabel LL=new JLabel(" 2 : Which of the following mechanisms is/are provided   by  OOP to implement OO Model?");
         LL.setForeground(Color.RED);
        LL.setBounds(60 ,20,550,200 );
       
      JLabel LL1=new JLabel("Encapsulation ");
         LL1.setForeground(Color.BLUE);
        LL1.setBounds(70 ,105,200,100 );
       
        JLabel LL2=new JLabel("Inheritance");
        LL2.setBounds(70 ,138,200,100 );
        LL2.setForeground(Color.BLUE);
       
        JLabel LL3=new JLabel("Polymorphism ");
        LL3.setForeground(Color.BLUE);
        LL3.setBounds(70 ,168,200,100 );
       
        JLabel LL4=new JLabel("All of the above");
        LL4.setBounds(70 ,196,200,100 );
        LL4.setForeground(Color.BLUE);
       
        JRadioButton RR1=new JRadioButton();
       
        RR1.setBounds(40 ,145 ,30 ,20 );
        JRadioButton RR2=new JRadioButton();
        RR2.setBounds(40 ,178 ,30,20 );

        JRadioButton RR3=new JRadioButton();
        RR3.setBounds(40 ,208 ,30,20);

        JRadioButton RR4=new JRadioButton();
        RR4.setBounds(40 , 235 ,30,20 );
       
         JButton bb1=new JButton("Next");
        bb1.setBounds(220,300,100,30);
        bb1.setBackground(Color.GRAY);
      
// frame one kay leay R
     ButtonGroup ba=new ButtonGroup();
    ba.add(R1);
    ba.add(R2);
    ba.add(R3);
    ba.add(R4);
   
//   frame 2 ky leay RR
     ButtonGroup bba=new ButtonGroup();
    bba.add(RR1);
    bba.add(RR2);
    bba.add(RR3);
    bba.add(RR4);

// frame one wasty
        P.add(L);
        P.add(L1);
        P.add(L2);
        P.add(L3);
        P.add(L4);
        P.add(L5);
        P.add(R1);
        P.add(R2);
        P.add(R3);
        P.add(R4);
        P.add(b);
        P.add(l5);
        P.add(b1);
       
//        frame two wasty
        P1.add(LL);
        P1.add(LL1);
        P1.add(LL2);
        P1.add(LL3);
        P1.add(LL4);
        P1.add(RR1);
        P1.add(RR2);
        P1.add(RR3);
        P1.add(RR4);
        P1.add(bb1);

    }
   
}