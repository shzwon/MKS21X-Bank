public class Kitty{

  private int age;
  private String name;

  public Kitty(String newName, int  newAge){
    name = newName;
    age = newAge;
  }

  public Kitty(){

  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public String toString(String str){
    if (str.length > 0)
      return "The amazing " + str;
    else
      return "The amazing XXX";
  }

  public void String changeName(String newStr){
    name = newStr;
  }

  public void int makeOlder(int num){
    age = num + 1;
  }
}
