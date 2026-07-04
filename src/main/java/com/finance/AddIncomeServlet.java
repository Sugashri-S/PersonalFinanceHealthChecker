package com.finance;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addIncome")
public class AddIncomeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        String source = request.getParameter("source");
        String amount = request.getParameter("amount");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>Income Added Successfully</h1>");
        out.println("<h2>Income Source: " + source + "</h2>");
        out.println("<h2>Amount: ₹" + amount + "</h2>");
    }
}