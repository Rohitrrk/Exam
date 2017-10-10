package com.cg.student.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.student.bean.StudentScoreBean;
import com.cg.student.service.IStudentService;
import com.cg.student.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	/**
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		IStudentService service = new StudentServiceImpl();
		StudentScoreBean bean = new StudentScoreBean();
		String path = request.getServletPath();
		String target = null;
		HttpSession session = request.getSession(true);
		switch(path)
		{
		
		case "/addDetails.obj":
			
			ArrayList<Integer> list= new ArrayList<Integer>();
			
			try {
				
				list = service.getDetails();
				
			
				session.setAttribute("StudData", list);
				
				target = "AddStudentExam.jsp";
			
				
			} 
			
			catch (SQLException e) {
				
			    throws StudentException (e.getMessage());

			}
			
			
			
		break;
		
	
		case "/insertDetails.obj":
			
			String studId = request.getParameter("studId");
			int id = Integer.parseInt(studId);
		
			String sub =  request.getParameter("subject");
			
			String th = request.getParameter("theory");
			int theory = Integer.parseInt(th);
			
			String mcq_score = request.getParameter("mcq");
			int  mcq = Integer.parseInt(mcq_score);
			
			String lab_score = request.getParameter("lab");
			int lab = Integer.parseInt(lab_score);
	
			int total=service.total(theory, mcq, lab);
			String grade=service.grade(total);
			
			bean.setStudentId(id);
			bean.setSubjectName(sub);
			bean.setTheory(theory);
			bean.setMcq(mcq);
			bean.setLab(lab);
			bean.setGrade(grade);
			bean.setTotal(total);
			
			int res = service.addStudentDetails(bean);
			if(res == 1)
			{
	
			session.setAttribute("id", id);
			session.setAttribute("sub", sub);
			session.setAttribute("total", total);
			session.setAttribute("grade", grade);

			target = "resultScore.jsp";
	
			}
			
			break;
			
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);
		
	}

}
