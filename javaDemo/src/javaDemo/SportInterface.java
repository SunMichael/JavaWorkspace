
//接口（类似协议）里的方法都是抽象方法  只声明不实现

package javaDemo;

public interface SportInterface {

	public void setHomeTeam(String name);
	public void setVisitingTeam(String name);
	
}

interface Football extends SportInterface {
	public void homeTeamScored(int points);
}

