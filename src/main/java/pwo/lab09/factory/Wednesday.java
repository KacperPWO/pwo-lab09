 package pwo.lab09.factory;

 public class Wednesday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Dzień dobry Środa.";
 }

 @Override
 public String createMainMessage() {
 return "Środowa praca idzie lepiej";
 }

 @Override
 public String createClosingMessage() {
 return "Trzeci dzień pracy w tym tygodniu minął";
 }
 }