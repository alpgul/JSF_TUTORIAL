package tr.tutorial.JSF_Tutorial;

public class HelloBean {
private String name="";

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String getSayWelcome(){
	   //check if null?
	   if("".equals(name) || name ==null){
		return "";
	   }else{
		return "Ajax message : Welcome " + name;
	   }
	}
}
