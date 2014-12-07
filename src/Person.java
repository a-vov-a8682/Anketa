
public class Person {
    private final String firstName;
    private final String lastName;
    private final String age;
    private final String phone;
    private final Answer answers;

    public Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.answers = builder.answers;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public Answer getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", answers=" + answers +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != null ? !age.equals(person.age) : person.age != null) return false;
        if (answers != null ? !answers.equals(person.answers) : person.answers != null) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (phone != null ? !phone.equals(person.phone) : person.phone != null) return false;

        return true;
    }
    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (answers != null ? answers.hashCode() : 0);
        return result;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String age;
        private String phone;
        private Answer answers;

        public Builder(){
        }
        public Builder(Person original){
            this.firstName = original.firstName;
            this.lastName = original.lastName;
            this.age = original.age;
            this.phone = original.phone;
            this.answers = original.answers;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder age(String age){
            this.age = age;
            return this;
        }
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder answers(Answer answers){
            this.answers = answers;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
