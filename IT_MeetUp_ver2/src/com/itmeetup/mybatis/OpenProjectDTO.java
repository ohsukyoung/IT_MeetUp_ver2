package com.itmeetup.mybatis;

import java.util.ArrayList;

public class OpenProjectDTO
{
	// 주요 속성 구성
	private String code, start, end, profile, nickname, title, content, sigg;
	private int view, day;
	private ArrayList<String> skill;
	//private ArrayList<JobDTO> jobList;
	
	// getter / setter 구성
	public String getCode()
	{
		return code;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getStart()
	{
		return start;
	}
	public void setStart(String start)
	{
		this.start = start;
	}
	public String getEnd()
	{
		return end;
	}
	public void setEnd(String end)
	{
		this.end = end;
	}
	public String getProfile()
	{
		return profile;
	}
	public void setProfile(String profile)
	{
		this.profile = profile;
	}
	public String getNickname()
	{
		return nickname;
	}
	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	public int getView()
	{
		return view;
	}
	public void setView(int view)
	{
		this.view = view;
	}
	public int getDay()
	{
		return day;
	}
	public void setDay(int day)
	{
		this.day = day;
	}
	public String getSigg()
	{
		return sigg;
	}
	public void setSigg(String sigg)
	{
		this.sigg = sigg;
	}
	public ArrayList<String> getSkill()
	{
		return skill;
	}
	public void setSkill(ArrayList<String> skill)
	{
		this.skill = skill;
	}
	
	
	
}
