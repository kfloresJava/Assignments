package com.flores.DisplayDate.Controllers;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
	@RequestMapping("")
	private String index()
	{
		return "index.jsp";
	}
	@RequestMapping("/date")
	private String datex(Model nx)
	{
		String pattern1 = "EEEE";
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
		String day = simpleDateFormat1.format(new Date());
		String pattern2 = "MMMM";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		String month = simpleDateFormat2.format(new Date());
		String pattern3 = "yyyy";
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern3);
		String year = simpleDateFormat3.format(new Date());
		String pattern4 = "FF";
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(pattern4);
		String aday = simpleDateFormat4.format(new Date());
		String ndate= day+", the "+ aday +" of "+month+", "+year;
		nx.addAttribute("textval",ndate);
		//System.out.println(ndate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	private String timex(Model nx)
	{
		String pattern1 = "h:mm a";
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
		String day = simpleDateFormat1.format(new Date());
		//System.out.println(day);
		nx.addAttribute("textval",day);
		return "time.jsp";
	}
}
