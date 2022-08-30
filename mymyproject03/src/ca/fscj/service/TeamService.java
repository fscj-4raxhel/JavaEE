package ca.fscj.service;
/*
	 成员已满，无法添加
	该成员不是开发人员，无法添加
	该员工已在本开发团队中
	该员工已是某团队成员 
	该员正在休假，无法添加
	团队中至多只能有一名架构师
	团队中至多只能有两名设计师
	团队中至多只能有三名程序员

 */
import ca.fscj.domain.*;
import ca.fscj.service.Exceptions.TeamException;

import static ca.fscj.domain.Status.*;

public class TeamService {
	private static int counter = 1;
	private static final int MAX_MEMBER = 5;
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int total = 0;
	
	public Programmer[] getTeam(){
		if(total == 0){
			return null;
		}
		Programmer[] res = new Programmer[total];
		for(int i = 0; i < total; i++){
			res[i] = team[i];
		}
		return res;
	}
	
	public void addMember(Employee e) throws TeamException{
		if (total >= MAX_MEMBER){
			throw new TeamException("成员已满，无法添加");
		}
		if(!(e instanceof Programmer)){
			throw new TeamException("该成员不是开发人员，无法添加");
		}
		Programmer p = (Programmer)e;
		if(p.getStatus() == VOCATION){
			throw new TeamException("该员正在休假，无法添加");
		}
		if(total == 0){
			p.setMemberID(counter++);
			team[total++] = p;
			p.setStatus(BUSY);
			return;
		}
		
		int numPro,numDes,numArch;
		numPro = numDes = numArch = 0;
		for(int i = 0; i < total; i++){
			if(e.getId() == team[i].getId()){
				throw new TeamException("该员工已在本开发团队中");
			}
			if(p.getStatus() == BUSY){
				throw new TeamException("该员工已是某团队成员");
			}
			if(team[i] instanceof Architect){
				numArch++;
				continue;
			}else if(team[i] instanceof Designer){
				numDes++;
				continue;
			}else{
				numPro++;
			}
		}
		if(e instanceof Architect && numArch > 0){
			throw new TeamException("团队中至多只能有一名架构师");
		}else if(e instanceof Designer && numDes > 1){
			throw new TeamException("团队中至多只能有两名设计师");
			
		}else if(numPro > 2){
			throw new TeamException("团队中至多只能有三名程序员");
		}else{
			p.setMemberID(counter++);
			team[total++] = p;
			p.setStatus(BUSY);
		}
	}
	
	public void removeMember(int memberId) throws TeamException{
		for(int i = 0; i < total; i++){
			if(memberId == team[i].getMemberID()){
				team[i].setStatus(FREE);
				for(int j = i + 1; j < total; j++){
					team[j-1] = team[j];
				}
				team[--total] = null;
				return;
			}
		}
		throw new TeamException("找不到指定memberId的员工，删除失败");
	}

}

