public class Student {

    private String name;
    private String course;
    private String address;

    public Student(String name, String course, String address) {
        this.name = name;
        this.course = course;
        this.address = address;
    }

    public Student(Builder builder){
        this.name = builder.name;
        this.course = builder.course;
        this.address = builder.address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private String course;
        private String address;


//        builder pattern should have methods that return an instance of the builder pattern

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setCourse(String course){
            this.course = course;
            return this;
        }

        public Builder setAddress(String course){
            this.address = address;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
