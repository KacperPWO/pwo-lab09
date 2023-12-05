 package pwo.lab09.composite;

 public class Pokrywa extends WaterSystem{

 boolean zamknieta = false;

 public void fill(){
 super.fill();
 System.out.println("Otwieram pokrywe");
 }

 public void afterFill(){
 super.afterFill();
 System.out.println("Zamykam pokrywe");
 zamknieta = true;
 }

 public void drain() {
 super.drain();
 System.out.println("Otwieram odpływ");
 }

 public void afterDrain() {
 super.afterDrain();
 }
 }