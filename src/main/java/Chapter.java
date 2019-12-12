public class Chapter implements Comparable{
    private String name;
    private String number;

    public Chapter(String name, String number) {
        if(name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("The name cannot be blank or null!");
        }
        if(number.isBlank() || number.isEmpty()){
            throw new IllegalArgumentException("The number cannot be blank or null!");
        }
        this.name = name;
        this.number = number;
    }

    public Chapter(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
