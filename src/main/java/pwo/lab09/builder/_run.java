 package pwo.lab09.builder;
 import java.util.Scanner;

 public class _run {

 public static void main(String [] args){
     
 Scanner scanner = new Scanner(System.in);

 TxtPic1 txtPic = new TxtPic1('.','*',20,"txtpic1.txt");
 txtPic.save();

 TxtPic2 txtPic2 = new TxtPic2();

 txtPic2
 .setBackground('_')
 .setForeground('*')
 .setSize(20)
 .setFileName("txtpic2.txt")
 .createTxtPic()
 .save();
 
 // TxtPic3
        System.out.println("\nTxtPic3 Settings:");
        System.out.print("Enter background character: ");
        char bg = scanner.next().charAt(0);

        System.out.print("Enter foreground character: ");
        char fg = scanner.next().charAt(0);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        System.out.print("Enter file name: ");
        String fileName = scanner.next();

        TxtPic3 txtPic3 = new TxtPic3()
                .setBackground(bg)
                .setForeground(fg)
                .setSize(size)
                .setFileName(fileName)
                .createTxtPic();
        txtPic3.save();

        // Close the scanner
        scanner.close();
 
 
 
 }
 }