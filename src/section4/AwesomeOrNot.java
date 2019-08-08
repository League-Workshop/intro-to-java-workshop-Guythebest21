package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random hamoshe = new Random();
int fred = hamoshe.nextInt(4);
	// 3. Print out this variable
System.out.println(fred);
	// 4. Get the user to enter something that they think is awesome
String name=JOptionPane.showInputDialog("enter something that is awesiome ");
	// 5. If the random number is 0
if (fred==0) {
	// -- tell the user whatever they entered is awesome!
JOptionPane.showMessageDialog( null,name+" is awesiome ");
	// 6. If the random number is 1
JOptionPane.showMessageDialog( null,name+" is ok ");
	// -- tell the user whatever they entered is ok.
if (fred==1) {
	// 7. If the random number is 2
JOptionPane.showMessageDialog( null,name+" is boring ");
	// -- tell the user whatever they entered is boring.
if (fred==2) {
	// 8. If the random number is 3
JOptionPane.showMessageDialog( null,name+" is terrible i hate it ");
	// -- write your own answer
JOptionPane.showMessageDialog(null, hamoshe);
}}}}}


