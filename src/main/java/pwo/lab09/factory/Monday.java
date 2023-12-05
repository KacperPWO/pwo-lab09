 package pwo.lab09.factory;

 public class Monday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Jest poniedziałek. I znowu do roboty...";
 }

 @Override
 public String createMainMessage() {
 return "Poniedziałkowa praca powoli się rozkręca";
 }

 @Override
 public String createClosingMessage() {
 return "Koniec poniedziałkowej zmiany";
 }
 }