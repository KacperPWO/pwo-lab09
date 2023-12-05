 package pwo.lab09.factory;

 public class Sunday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Dzień dobry Niedziela.";
 }

 @Override
 public String createMainMessage() {
 return "Niedziela - odpoczywaj";
 }

 @Override
 public String createClosingMessage() {
 return "Koniec wolnego";
 }
 }