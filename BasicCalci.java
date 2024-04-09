import java.awt.*;  
import java.awt.event.*;  

class BasicCalci extends WindowAdapter implements ActionListener{
  Frame f; 
  
Label l1;

Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;

double res;
double num1,num2,check;

BasicCalci()
{ 
f= new Frame("BASIC CALCULATOR");
f.setBackground(Color.CYAN);

  
//Initiating Every Components... 
l1=new Label(); 
l1.setBackground(Color.LIGHT_GRAY);       //LABEL which is used for displaying the Input and Output
l1.setBounds(50,50,260,60);
 

b1=new Button("1");
  b1.setBounds(50,340,50,50);
b2=new Button("2");
  b2.setBounds(120,340,50,50);
b3=new Button("3");
  b3.setBounds(190,340,50,50);
b4=new Button("4");
  b4.setBounds(50,270,50,50);
b5=new Button("5");
  b5.setBounds(120,270,50,50); 
b6=new Button("6");
  b6.setBounds(190,270,50,50);
b7=new Button("7");
  b7.setBounds(50,200,50,50);
b8=new Button("8");
  b8.setBounds(120,200,50,50);
b9=new Button("9");
  b9.setBounds(190,200,50,50);
b0=new Button("0"); 
  b0.setBounds(120,410,50,50);                                    //Number Buttons...(0 to 9)

  
  bneg=new Button("INVERT");
bneg.setBackground(new Color(255, 127, 80));
  bneg.setBounds(50,410,50,50);               //Negative Sign will be given to Input
bpts=new Button(".");
  bpts.setBounds(190,410,50,50);
bback=new Button("BACK");
bback.setBackground(new Color(255, 192, 203));
 bback.setBounds(120,130,50,50);

badd=new Button("+");
  badd.setBounds(260,340,50,50);
  badd.setBackground(Color.green);
bsub=new Button("-");
  bsub.setBackground(Color.ORANGE);
  bsub.setBounds(260,270,50,50);
bmult=new Button("X");
  bmult.setBackground(Color.yellow);
  bmult.setBounds(260,200,50,50);
bdiv=new Button("/");
  bdiv.setBackground(Color.blue);
  bdiv.setBounds(260,130,50,50);
bmod=new Button("DIV(%)");
bmod.setBackground(new Color(216, 191, 216));
  bmod.setBounds(190,130,50,50);
bcalc=new Button("=");
  bcalc.setBounds(245,410,65,50);

  
  bclr=new Button("CLEAR"); 
bclr.setBackground(new Color(255, 224, 189));
  bclr.setBounds(50,130,65,50);
  

b1.addActionListener(this); 
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 
b8.addActionListener(this); 
b9.addActionListener(this);  
b0.addActionListener(this);

bpts.addActionListener(this);  
bneg.addActionListener(this);
bback.addActionListener(this); 

badd.addActionListener(this);
bsub.addActionListener(this);
bmult.addActionListener(this);
bdiv.addActionListener(this);
bmod.addActionListener(this);
bcalc.addActionListener(this);
bclr.addActionListener(this); 

f.addWindowListener(this);
//Including Components to the FRAME...   
f.add(l1);  
f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8); f.add(b9); f.add(b0);

f.add(badd); f.add(bsub); f.add(bmod); f.add(bmult); f.add(bdiv); f.add(bmod); f.add(bcalc);

f.add(bclr); f.add(bpts); f.add(bneg); f.add(bback);

f.setSize(370,510);  
f.setLayout(null);  
f.setVisible(true);  
} 
                    
public void windowClosing(WindowEvent e)    //Closes the Window... 
{
  f.dispose();
}

public void actionPerformed(ActionEvent e){ 
  String z,zt;
                        //Number Buttons...
if(e.getSource()==b1){
 zt=l1.getText();
  z=zt+"1";
  l1.setText(z);
}
if(e.getSource()==b2){
zt=l1.getText();
z=zt+"2";
l1.setText(z);
}
if(e.getSource()==b3){
  zt=l1.getText();
  z=zt+"3";
  l1.setText(z);
}
if(e.getSource()==b4){
  zt=l1.getText();
  z=zt+"4";
  l1.setText(z);
}
if(e.getSource()==b5){
  zt=l1.getText();
  z=zt+"5";
  l1.setText(z);
}
if(e.getSource()==b6){
  zt=l1.getText();
  z=zt+"6";
  l1.setText(z);
}
if(e.getSource()==b7){
  zt=l1.getText();
  z=zt+"7";
  l1.setText(z);
}
if(e.getSource()==b8){
  zt=l1.getText();
  z=zt+"8";
  l1.setText(z);
}
if(e.getSource()==b9){
  zt=l1.getText();
  z=zt+"9";
  l1.setText(z);
}
if(e.getSource()==b0){
  zt=l1.getText();
  z=zt+"0";
  l1.setText(z);
}

if(e.getSource()==bpts){  //Include . to the Number Ex: 3.16
  zt=l1.getText();
  z=zt+".";
  l1.setText(z);
}
if(e.getSource()==bneg){ //Negative Sign...
  zt=l1.getText();
  z="-"+zt;
  l1.setText(z);
}

if(e.getSource()==bback)  //Backspace...
{ 
  zt=l1.getText();
  try{
    z=zt.substring(0, zt.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  l1.setText(z);
}
//ARITHMETIC OPERATIONS...
if(e.getSource()==badd)
 {                                              //ADDITION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=1;
}
if(e.getSource()==bsub)
{                                         //SUBTRACTION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=2;
}
if(e.getSource()==bmult)
{                                           //MULTIPLICATION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=3;
}
if(e.getSource()==bdiv)
{                                                //DIVISION
  try{
    num1=Double.parseDouble(l1.getText());
    }catch(NumberFormatException f){
      l1.setText("Invalid Format");
      return;
    }
  z="";
  l1.setText(z);
  check=4;
}
if(e.getSource()==bmod)
{
  try
  {
    num1=Double.parseDouble(l1.getText());
    }
  catch(NumberFormatException f)
  {
      l1.setText("Invalid Format");
      return;
    }
  z="";                                   // z="" is used under every Operations because to clear the value after clicking the desired arithmetic operations(+,-,X,/...)
  l1.setText(z);
  check=5;
}
                         //Result...
if(e.getSource()==bcalc){          
  try{
    num2=Double.parseDouble(l1.getText());
    }
  catch(Exception f)
  {
	  l1.setBackground(Color.RED);
      l1.setText("Invalid Format, Enter the Inputs Carefully...");
      return;
    }
  if(check==1)
    res =num1+num2;
  if(check==2)
    res =num1-num2;
  if(check==3)
    res =num1*num2;
  if(check==4)
    res =num1/num2; 
  if(check==5)
    res =num1%num2;    
  l1.setText(String.valueOf(res));
}
                       
if(e.getSource()==bclr) 
{                                                  //Clears Label and Memory...
  num1=0;
  num2=0;
  check=0;
  res=0;
   z="";
   l1.setBackground(Color.LIGHT_GRAY);
   l1.setText(z);
}
}
public static void main(String args[])
{  
      new BasicCalci();  
  }
}  