 package pwo.lab09.factory;

 public class Tuesday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Dzień dobry Wtorek.";
 }

 @Override
 public String createMainMessage() {
 return "Wtorkowa praca idzie lepiej";
 }

 @Override
 public String createClosingMessage() {
 return "Drugi dzień pracy w tym tygodniu minął";
 }
 }