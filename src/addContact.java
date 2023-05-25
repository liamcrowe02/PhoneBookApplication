public class addContact {

    String name;
    String phoneNum;

        public addContact(String name, String phoneNum) {
            this.name = name;
            this.phoneNum = phoneNum;
        }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "addContact{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}

