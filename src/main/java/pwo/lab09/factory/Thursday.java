 package pwo.lab09.factory;

 public class Thursday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Dzień dobry Czwartek.";
 }

 @Override
 public String createMainMessage() {
 return "Czwartkowa praca idzie lepiej";
 }

 @Override
 public String createClosingMessage() {
 return "Czwarty dzień pracy w tym tygodniu minął";
 }
 }