import processing.serial.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;


Serial MyPort;
String KeyString = "";
void setup()
{
  System.out.println("Estou a funcionar!!!!!!!!!!");
  size(700, 500);
  MyPort = new Serial(this, "COM5", 9600);
  MyPort.bufferUntil('\n');
}

void draw(){
  background(0, 0, 0);
  fill(255, 0, 0);
  text("Press any key", 100, 175);
}

void serialEvent(Serial MyPort)throws Exception {
  KeyString = MyPort.readStringUntil('\n');
  KeyString = KeyString.substring(0, KeyString.indexOf(':'));
  System.out.println(KeyString);
  Robot Arduino = new Robot();
  switch(KeyString){
    case "Cima" :
    for(int i = 0; i < 7;  i++){
      Arduino.keyPress(KeyEvent.VK_UP);
      Arduino.keyRelease(KeyEvent.VK_UP);
      Arduino.delay(20);
      }
      break;
    case "Baixo" :
    for(int i = 0; i < 7;  i++){
      Arduino.keyPress(KeyEvent.VK_DOWN);
      Arduino.keyRelease(KeyEvent.VK_DOWN); 
      Arduino.delay(20);
      }    
      break;
    case "Direita" :
    
    for(int i = 0; i < 7;  i++){
      Arduino.keyPress(KeyEvent.VK_RIGHT);
      Arduino.keyRelease(KeyEvent.VK_RIGHT);
      Arduino.delay(20);
      }
      break;
    case "Esquerda" :
    for(int i = 0; i < 7;  i++){
      Arduino.keyPress(KeyEvent.VK_LEFT);
      Arduino.keyRelease(KeyEvent.VK_LEFT);
      Arduino.delay(20); 
      }     
      break;
    case "R" :
    for(int i = 0; i < 7;  i++){
      Arduino.keyPress(KeyEvent.VK_R);
      Arduino.keyRelease(KeyEvent.VK_R);
      Arduino.delay(20);  
      }
          
      break;
    case "E" :
    for(int i = 0; i < 7;  i++){
      Arduino.keyPress(KeyEvent.VK_E);
      Arduino.keyRelease(KeyEvent.VK_E);  
      }   
      Arduino.delay(20);
      break;
    case "Q" :
    for(int i = 0; i < 7;  i++){
      Arduino.keyPress(KeyEvent.VK_Q);
      Arduino.keyRelease(KeyEvent.VK_Q); 
      Arduino.delay(20);
      }  
      break;
    case "Shift" :
    for(int i = 0; i < 7;  i++){
      Arduino.keyPress(KeyEvent.VK_SHIFT);  
      Arduino.keyRelease(KeyEvent.VK_SHIFT); 
      Arduino.delay(20);
      }      
      break;
    }
}
