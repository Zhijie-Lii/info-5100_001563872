public class HospitalRoom {
    //TODO: implement your code here
    private final int CapacityForPatient = 3;
    private final int CapacityForDoctor = 1;
    private int PatientNumber = 0;
    private int DoctorNumber = 0;
    private int WaitingDoctor = 0;
    private int WaitingPatient = 0;
    private static Object lockD = new Object();
    private final Object lockP = new Object();

    public boolean doctorEnter(Doctor d) throws InterruptedException {
        synchronized(Doctor.class){
            while(true){
                if(DoctorNumber == CapacityForDoctor){
                    WaitingDoctor ++;
                    System.out.println("Doctor "+ d.name + " is waiting to enter, number of doctor "+ WaitingDoctor);
                    lockD.wait();
                } else {
                    DoctorNumber ++;
                    System.out.println("Doctor "+ d.name +" entered, number of doctor 1");
                    lockD.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public boolean doctorLeave(Doctor d) throws InterruptedException {
        synchronized(lockD){
            while(true){
                if(DoctorNumber == 0){
                    //System.out.println("Doctor "+ d.name + " is waiting to enter, number of doctor 1");
                    lockD.wait();
                } else {
                    DoctorNumber --;
                    System.out.println("Doctor "+ d.name +" left, number of doctor "+ DoctorNumber);
                    lockD.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public boolean patientEnter(Patient p) throws InterruptedException {
        synchronized(Patient.class){
            while(true){
                if(PatientNumber == CapacityForPatient){
                    WaitingDoctor ++;
                    System.out.println("Patient "+ p.name + " is waiting to enter, number of patient "+ WaitingPatient);
                    lockP.wait();
                } else {
                    PatientNumber ++;
                    System.out.println("Patient "+ p.name +" entered, number of patient "+ PatientNumber);
                    lockP.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public boolean patientLeave(Patient p) throws InterruptedException {
        synchronized(lockP){
            while(true){
                if(PatientNumber == 0){
                    //System.out.println("Patient "+ p.name + " is waiting to enter, number of patient "+ WaitingPatient);
                    lockP.wait();
                } else {
                    PatientNumber --;
                    System.out.println("Patient "+ p.name +" left, number of patient "+ PatientNumber);
                    lockP.notify();
                }
                Thread.sleep(500);
            }
        }
    }
}

class Doctor {
    public String name;
    public Doctor(String name) {
        this.name = name;
    }
}

class Patient {
    public String name;
    public Patient(String name) {
        this.name = name;
    }
}

class Main2 {
    public static void main(String[] args) {
        HospitalRoom room = new HospitalRoom();
        Doctor siva = new Doctor("siva");
        Doctor john = new Doctor("john");
        Patient p1 = new Patient("p1");
        Patient p2 = new Patient("p2");
        Patient p3= new Patient("p3");
        Patient p4 = new Patient("p4");
        Patient p5 = new Patient("p5");
        Thread doctor1 = new Thread(() -> {
            try {
                while(!room.doctorEnter(siva)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(siva)) {}

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread doctor2 = new Thread(() -> {
            try {
                while(!room.doctorEnter(john)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(john)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient1 = new Thread(() -> {
            try {
                while(!room.patientEnter(p1)) {}
                Thread.sleep(500);
                while(!room.patientLeave(p1)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient2 = new Thread(() -> {
            try {
                while(!room.patientEnter(p2)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p2)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient3 = new Thread(() -> {
            try {
                while(!room.patientEnter(p3)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p3)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient4 = new Thread(() -> {
            try {
                while(!room.patientEnter(p4)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p4)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient5 = new Thread(() -> {
            try {
                while(!room.patientEnter(p5)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p5)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        doctor1.start();
        doctor2.start();
        patient1.start();
        patient2.start();
        patient3.start();
        patient4.start();
        patient5.start();
    }
}
