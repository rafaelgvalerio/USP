const int SETA_DIREITA = 13;
const int SETA_BAIXO = 12;
const int SETA_CIMA = 11;
const int SETA_ESQUERDA = 10;
const int R = 9;
const int E = 8;
const int Q = 7;
const int SHIFT = 6;

void setup(){
    Serial.begin(9600);
    pinMode(SETA_DIREITA, INPUT);
    pinMode(SETA_BAIXO, INPUT);
    pinMode(SETA_CIMA, INPUT);
    pinMode(SETA_ESQUERDA, INPUT);
    pinMode(R, INPUT);
    pinMode(E, INPUT);
    pinMode(Q, INPUT);
    pinMode(SHIFT, INPUT);
}

void loop(){
    if(digitalRead(SETA_DIREITA) == HIGH){
      Serial.println("Direita:");
      delay(100);
    }
    else if(digitalRead(SETA_BAIXO) == HIGH){
      Serial.println("Baixo:");
      delay(100);
    }
    else if(digitalRead(SETA_CIMA) == HIGH){
      Serial.println("Cima:");
      delay(100);
    }
    else if(digitalRead(SETA_ESQUERDA) == HIGH){
      Serial.println("Esquerda:");
      delay(100);
    }
    else if(digitalRead(R) == HIGH){
      Serial.println("R:");
      delay(100);
    }
    else if(digitalRead(E) == HIGH){
      Serial.println("E:");
      delay(100);
    }
    else if(digitalRead(Q) == HIGH){
      Serial.println("Q:");
      delay(100);
    }
    else if(digitalRead(SHIFT) == HIGH){
      Serial.println("Shift:");
      delay(100);
    }
    }