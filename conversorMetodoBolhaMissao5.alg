algoritmo "conversorMissaoSemana5"

var
   opcaoMenu: literal
   temperatura, horario: vetor[1..4]de real
   i, j: inteiro
   aux1, aux2: real
   
procedimento menu()
inicio
   escreval("----------------------------------------")
   escreval("1 - Celsius para Fahrenheit")
   escreval("2 - Fahrenheit para Celsius")
   escreval("0 - Sair")
   escreval("----------------------------------------")
   escreval("Escolha uma opa��o: ")
   leia(opcaoMenu)
   limpatela
fimprocedimento

procedimento lerDados()
inicio

   para i de 1 ate 4 faca
      escreval("Informe a Temperatura: ")
      leia(temperatura[i])
      
      escreval("Informe o Hor�rio: ")
      leia(horario[i])
   fimpara
   limpatela
fimprocedimento

procedimento conversor()
inicio
metodoBolha()
  se(opcaoMenu = "1") entao
     para i de 1 ate 4 faca
        escreval("Temperatura", temperatura[i], "�C, registrado �s", horario[i], "h corresponde a ", ((temperatura[i] * 1.8) + 32):2:2, "�F")
     fimpara
  senao
     para i de 1 ate 4 faca
        escreval("Temperatura", temperatura[i], "�F, registrado �s", horario[i], "h corresponde a ", ((temperatura[i] - 32) / 1.8):2:2, "�C")
     fimpara
  fimse
fimprocedimento

procedimento metodoBolha()
inicio
   para i de 1 ate 4 faca
      para j de 1 ate 4 faca
         se(temperatura[j] > temperatura[i]) entao
            aux1 <- temperatura[i]
            temperatura[i] <- temperatura[j]
            temperatura[j] <- aux1
            aux2 <- horario[i]
            horario[i] <- horario[j]
            horario[j] <- aux2
         fimse
      fimpara
   fimpara
fimprocedimento

inicio
   repita
      menu()
         escolha opcaoMenu
            caso "1"
               lerDados()
               conversor()
            caso "2"
               lerDados()
               conversor()
            caso "0"
               outrocaso
               escreval("Op��o Inesistente, Por Favor, escolha outra op��o")
         fimescolha
   ate opcaoMenu = "0"
fimalgoritmo
