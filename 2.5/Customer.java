package secao2_5;

public class Customer {

  private int ID;
  private String name;
  private char gender;

  public Customer(int ID, String name, int discount) {
    this.ID = ID;
    this.name = name;
    if (discount == 0) {
      gender = 'm';
    } else {
      gender = 'f';
    }
  }

  public int getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public char getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return name + "(" + ID + ")";
  }
}
