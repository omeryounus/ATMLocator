/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.backbase.test.servlet;

import com.backbase.test.util.Constant;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Omer Younus
 */

@WebServlet(name = "ATMServlet", displayName="ATM Servlet",urlPatterns = {"/atm"}, loadOnStartup=1)
public class ATMServlet extends HttpServlet {
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
        // forward request to jsp ATMList page
        req.getRequestDispatcher(Constant.REDIRECT_JSP).forward(req, resp);
    }
}
