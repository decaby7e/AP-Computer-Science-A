/**
 * Purpose: To define a contact entry in a contacts list
 *
 * @author Jack Polk
 * @version 5/22/2019
 *
 */
public class Contact
{
  private String name, relation, email, birthday, phone;
  public Contact(String name, String relation, String email, String birthday, String phone)
  {
    this.name = name;
    this.relation = relation;
    this.email = email;
    this.birthday = birthday;
    this.phone = phone;
  }

  public String getName()
  {return name;}

  public String getRelation()
  {return relation;}

  public String getEmail()
  {return email;}

  public String getBirthday()
  {return birthday;}

  public String getPhone()
  {return phone;}

  @Override
  public String toString()
  {
    return String.format("%-15s  %-7s  %-6s: %-10s  %-10s", getName(), getRelation(),
                          getBirthday(), getPhone(), getEmail());
    //return name+" ("+relation+") "+" ("+birthday+"): "+phone+"  "+email;
  }
}
