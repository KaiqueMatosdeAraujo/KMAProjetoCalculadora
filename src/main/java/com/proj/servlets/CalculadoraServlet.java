package com.proj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().println("Hello Servlet\n");                          
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String var1;
		String var2;
		
		var1= request.getParameter("valorConta1");
		var2= request.getParameter("valorConta2");
		
		if((request.getParameter("valorConta1") != null) && (request.getParameter("valorConta2") != null )) {
			
			//Validação se os campos não são vazios
			if ((var1 != "") && (var2 != "")){  
			

					Integer numero1, numero2,resultado;
					numero1 = Integer.parseInt(var1);
					numero2 = Integer.parseInt(var2);
					Calcular c = new Calcular(numero1,numero2);
					
				String	teste = request.getParameter("calc");
					
			    //Adição
				if("1".equals(teste)) {
					
		            resultado = c.somar();
		            request.setAttribute("valorPrimeiro", numero1);
		            request.setAttribute("valorSegundo", numero2);
					request.setAttribute("resultadoconta", resultado);
					request.getRequestDispatcher("/").forward(request,response);
				
					
			    //Subtração
				}else if("2".equals(teste)){
					resultado = c.subtrair();
					
					request.setAttribute("valorPrimeiro", numero1);
			        request.setAttribute("valorSegundo", numero2);
		            request.setAttribute("resultadoconta", resultado);
					request.getRequestDispatcher("/").forward(request,response);
					
					
				}
				//Multiplicação
				else if("3".equals(teste)){
					resultado = c.multiplicar();
					
					request.setAttribute("valorPrimeiro", numero1);
			        request.setAttribute("valorSegundo", numero2);
		            request.setAttribute("resultadoconta", resultado);
					request.getRequestDispatcher("/").forward(request,response);
		
				}
				
				//Divisão
				else{
					
					resultado = c.dividir();
					
				    request.setAttribute("valorPrimeiro", numero1);
			        request.setAttribute("valorSegundo", numero2);
		            request.setAttribute("resultadoconta",resultado);
					request.getRequestDispatcher("/").forward(request,response);
					
					
				}
				
				
				
				
				}else{
					request.setAttribute("resultadoconta", "Favor preencher os campos acima");
					request.getRequestDispatcher("/").forward(request,response);
				}
				
				
				}else {
			String resultado = " Valor Invalido";
			request.setAttribute("resultadoconta", resultado);
			request.getRequestDispatcher("/").forward(request,response);
		}
				
				
		}
		}

	
		

