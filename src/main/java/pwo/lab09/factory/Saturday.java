 package pwo.lab09.factory;

 public class Saturday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Dzień dobry Sobota.";
 }

 @Override
 public String createMainMessage() {
 return "Jest sobota - odpoczywaj";
 }

 @Override
 public String createClosingMessage() {
 return "Koniec Soboty";
 }
 }