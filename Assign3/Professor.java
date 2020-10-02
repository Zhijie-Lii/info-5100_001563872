public class Professor {
    private String firstName;
    private String lastName;
    private double id;
    private String teachingSubject;

    public static class Builder{
        private String firstName;
        private String lastName;
        private double id;
        private String teachingSubject;

        public Builder(String firstName, String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }

        public Builder setId(double id){
            this.id = id;
            return this;
        }

        public Builder setTeachingSubject(String teachingSubject){
            this.teachingSubject=teachingSubject;
            return this;
        }

        public Professor build(){
            return new Professor(firstName,lastName, id, teachingSubject);
        }
    }

    public Professor(String firstName,String lastName, double id, String teachingSubject){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.teachingSubject= teachingSubject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getId() {
        return id;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }
}
