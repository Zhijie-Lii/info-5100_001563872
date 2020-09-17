# info-5100
Assignment-1

1.Design a course management system (Like Canvas)

Object

-Faculty
  Data:
  Behavior:loginToCanvas, uploadSchedule, uploadAssignment
 
-Student

  Behavior: loginToCanvas, checkSchedule, doAssignment, 
  
-Canvas

  Behavior: stayConnectedToInternet, update, sendMessage()


Faculty siva;
Student zhijie;
Canvas sivaCanvas, zhijieCanvas;

  siva.loginTosivaCanvas()
  siva.uploadSchedule()
  siva.uploadAssignment()
  zhijieCanvas=sivaCanvas.update()
  zhijieCanvas.sendMessage(zhijie)
  zhijie.loginTozhijieCanvas()
  zhijie.checkSchedule()
  zhijie.doAssignment()
  

3.Design an app to book airline ticket
Object
-Passenger zhijie
  Data: StartAirport, ArrivalAirport, day, CreditCard, price, gender, ID number, ;
  
  
-App flypig
  Data:

-Airline a, b
  Data:
  

  zhijie.loginToflypig()
  trip =zhijie.search(StartAirport,ArrivalAirport,day,price);
  
  
  
