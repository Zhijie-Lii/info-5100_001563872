<u>Assignment-1</u>



**1.Design a course management system (Like Canvas)**



**Object**

**-Faculty**

 Data: Schedule, Assignment,

 Behavior:loginToCanvas, uploadSchedule, uploadAssignment

**-Student**

​	Data: EmailAddress

​	Behavior: loginToCanvas, checkSchedule, submitAssignment,  

**-Canvas**

​	Behavior: stayConnectedToInternet, update, sendMessage()



**Sequence of invoking behaviors on objects**

**Faculty** siva;

**Student** zhijie;

**Canvas** sivaCanvas, zhijieCanvas;

 siva.loginTosivaCanvas();

 siva.uploadSchedule(schedule, sivaCanvas);

 siva.uploadAssignment(assignment, sivaCanvas);

 zhijieCanvas=sivaCanvas.update(schedule, assignment);

 zhijieCanvas.sendMessage(zhijie.emailAddress);

 zhijie.loginTozhijieCanvas();

 zhijie.checkSchedule();

 zhijie.submitAssignment();

 



**2.Design a pet adoption platform**



**Object**

**-Adopter**

​	Data:  Name, Age, Address, Phone, AdoptionRecord, (LivingSituation)

​	Behavior: signIn, lookForPet, knowMoreAboutPet(), submitTheForm, arrive15minsBeforeAppointment, takePetHome,

**-Animal Shelter**

​	Data: Address, AppointmentTime

​	Behavior: callAdopter, makeAppointment,

**-Pet** Katie 

​	Data: Breed, Age, Weight, Sex, Photo, Habit,



**Sequence of invoking behaviors on objects**

**Adopter** zhijie;	

**Animal Shelter** petfinder;	

zhijie.signIn();

**Pet** katie  = zhijie.lookForPet(breed, age, weight, sex);

zhijie.knowMoreAboutPet(katie.photo, katie.habit);

zhijie.submitTheForm(zhijie.name, zhijie.age, phone, address, adoptionRecord);

 **if**  petfinder think zhijie's info match katie

   petfinder.callAdopter(zhijie.phone);

   petfinder.makeAppointment(petfinder.address, appointmentTime);

   zhijie.arrive15minsBeforeAppointment(petfinder.address);

   zhijie.takePetHome(zhijie.address, katie);





**3.Design an app to book airline ticket**



**Objects**

-**Passenger** zhijie

​	Data: Name, StartAirport, ArrivalAirport, FlyingDay, Price,  Passport, Email, Phone, CreditCard, 

​	Behavior: search(), book(), payTheBill(),  cancelFlight().

 

-**Platform **skyscanner

 	Data:  Flight, FlightReservation, Bill,

​	Behavior:  checkRemainingSeat(AirlineCompany),  makeFlightReservation (AirlineCompany), sendTheBill(),  requestAirTicket(AirlineCompany),  cancelFlightReservation(AirlineCompany),



-**AirlineCompany** ana,

​	Data: AirTicket, Boolean RemainingSeat, 

​	Behavior: issueAirTicket(),  sendMessage()

 **Sequence of invoking behaviors on objects**

 zhijie.loginTo( );

 **Flight** flight=zhijie.search(startAirport, arrivalAirport, flyingDay, price);

 remainingSeat =skyscanner.checkRemainingSeat(flight, ana);

**if**  remainingSeat is true

​	flightReservation =zhijie.book( flight, passport, email, phone);

​	skyscanner.makeFlightReservation (ana );

​	skyscanner.sendTheBill(zhijie.email, bill);	

​	**if** zhijie find another flight,

​		zhijie.neglectTheBill();

​		skyscanner.cancelFlightReservation(ana);

​	**else**

​		zhijie.payTheBill( bill, CreditCard);

​		skyscanner.requestAirTicket( ana);

​		airTicket =ana.issueAirTicket(name, startAirport, arrivalAirport, flyingDay);

​		ana.sendMessage(zhijie.email, zhijie.phone);



**4.Design a course registration platform.**



**Object**

-**Faculty** 

​	Data: 

​	Behavior: uploadCourse(), 

-**Course**

​	Data: Name, description, time, pre-requisite, Seat, 



-**Student** 

​	Data: loginCredentials,

​	Behavior: login, search, checkRemainingSeat, addCourse, addIntoWaitinglist, drop 

-**Platform** banner

​	Data: RemainingSeat, Waitinglist,

​	Behavior: updateCourse(), checkRemainingSeat, refreshRemainingSeat,



**Sequence of invoking behaviors on objects**

**Faculty** john;

**Course** java;

**Student** zhijie;

**Platform **banner;

john.uploadCourse(name, description, time, pre-requisite, seat);

banner.updateCourse(name, description, time, pre-requisite, seat);

zhijie.login(loginCredentials);

**Course** java= zhijie.search(name, description, time, pre-requisite);

banner.checkRemainingSeat( java);

**if**  remainingSeat is 0

​	zhijie.addIntoWaitinglist(java);

**else**  zhijie.addCourse(java);

banner.refreshRemainingSeat(java);

​		**if** zhijie want to change to another course

​		  zhijie.drop(java);

​		  banner.refreshRemainingSeat(java);



**5.Order food in a food delivery app.(Like Uber Eats)**



**Object**

**-Customer** 

​	Data: loginCredentials, Address, emailAddress, phone, Name, CreditCard,

​	Behavior:  login, chooseRestaurant, makeOrder, payTheBill, eat, writeReview, 



**-Restaurant**

​	Data: takeout

​	Behavior: prepareOrder,

-**Platform** 

​	Data: 

​	Behavior: sendOrder, allocateDeliveryMan, sendReceipt,

**-DeliveryMan** 

​	Behavior: getOrder, contactCustomer, deliverOrder,



**Sequence of invoking behaviors on objects**

**Customer** zhijie;

**Platform** panda;

**Order** order;

**Restaurant** mcD;

zhijie.login(loginCredentials);

zhijie.chooseRestaurant();

**Bill** bill = zhijie.makeOrder(order, address, phone, name);

zhijie.payTheBill(creditCard);

panda.sendOrder(order,mcD);

panda.sendReceipt(zhijie.emailAddress);

**DeliveryMan** john = panda.allocateDeliveryMan();

**Takeout** takeout = mcD.prepareOrder();

john.getOrder(takeout);

john.contactCustomer(zhijie.phone);

john.deliverOrder(zhijie.address, takeout);

zhijie.eat(takeout);

zhijie.writeReview(''OK, I'll buy this next.'');

