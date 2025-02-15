package p.software;

public interface NewInterface {
    
}
public class person implement SQLdata{}
private String sql_type ="person";
private int personId;
private String personName;
}
public int getPersonId;
return personId;


public void setPersonId(intPersonId){
this.personId =personId;
}

public String getPersonName(){

return personName;
}

public void setPersonName(){

this.personName = personName;
}

public void readSQL(SQLInput stream,String typeName)throws SQLException{
this.sql_type=typeName;
this.personId=stream.readLong();
this.personName=stream.readString();
}

public void writeSQL(SQLOutput stream)throws SQLException{
stream.writeLong(this.personId);
stream.writeString(this.personName);
}

}